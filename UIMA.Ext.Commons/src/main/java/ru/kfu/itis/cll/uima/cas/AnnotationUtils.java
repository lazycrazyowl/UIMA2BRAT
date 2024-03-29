/**
 * 
 */
package ru.kfu.itis.cll.uima.cas;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.newArrayListWithCapacity;
import static com.google.common.collect.Lists.newLinkedList;
import static com.google.common.collect.Sets.newHashSet;
import static com.google.common.collect.Sets.newLinkedHashSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.ConstraintFactory;
import org.apache.uima.cas.FSIntConstraint;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.FSMatchConstraint;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;

/**
 * @author Rinat Gareev (Kazan Federal University)
 * 
 */
public class AnnotationUtils {

	public static int length(Annotation anno) {
		return anno.getEnd() - anno.getBegin();
	}

	/**
	 * 
	 * @param first
	 * @param second
	 * @return does given annotation overlap or not. See
	 *         {@link #getOverlapping(JCas, FSIterator, Annotation)} for
	 *         overlapping definition.
	 */
	public static boolean overlap(Annotation first, Annotation second) {
		return (first.getBegin() < second.getBegin() && first.getEnd() > second.getBegin())
				|| (first.getBegin() >= second.getBegin() && first.getBegin() < second.getEnd());
	}

	/**
	 * 
	 * @param first
	 * @param second
	 * @return overlap length or 0 if given annotation do not overlap. See
	 *         {@link #getOverlapping(JCas, FSIterator, Annotation)} for
	 *         overlapping (overlapping) definition.
	 */
	public static int overlapLength(Annotation first, Annotation second) {
		if (first.getBegin() < second.getBegin() && first.getEnd() > second.getBegin()) {
			return Math.min(first.getEnd(), second.getEnd()) - second.getBegin();
		} else if (first.getBegin() >= second.getBegin() && first.getBegin() < second.getEnd()) {
			return Math.min(first.getEnd(), second.getEnd()) - first.getBegin();
		}
		return 0;
	}

	/**
	 * Given:
	 * <p>
	 * target.begin = tb, target.end = te,
	 * </p>
	 * <p>
	 * requested.begin = rb, requested.end = re,
	 * </p>
	 * <p>
	 * overlapping constraint is: (tb&lt;rb && te&gt;rb) || (tb&ge;rb &&
	 * tb&lt;re)
	 * </p>
	 * 
	 * @param cas
	 * @param iter
	 *            source iterator
	 * @param targetAnno
	 *            annotation which result annotations must overlap with
	 * @return iterator over annotations overlapping with targetAnno from source
	 *         iterator
	 */
	public static FSIterator<AnnotationFS> getOverlapping(CAS cas, FSIterator<AnnotationFS> iter,
			AnnotationFS targetAnno) {
		ConstraintFactory cf = ConstraintFactory.instance();
		FSMatchConstraint firstDisjunct;
		{
			FSIntConstraint beginConstraint = cf.createIntConstraint();
			beginConstraint.lt(targetAnno.getBegin());
			FSIntConstraint endConstraint = cf.createIntConstraint();
			endConstraint.gt(targetAnno.getBegin());
			firstDisjunct = cf.and(
					cf.embedConstraint(newArrayList("begin"), beginConstraint),
					cf.embedConstraint(newArrayList("end"), endConstraint));
		}
		FSMatchConstraint secondDisjunct;
		{
			FSIntConstraint beginConstraint = cf.createIntConstraint();
			beginConstraint.geq(targetAnno.getBegin());
			beginConstraint.lt(targetAnno.getEnd());
			secondDisjunct = cf.embedConstraint(newArrayList("begin"), beginConstraint);
		}
		FSMatchConstraint overlapConstraint = cf.or(firstDisjunct, secondDisjunct);
		return cas.createFilteredIterator(iter, overlapConstraint);
	}

	public static <FST extends FeatureStructure> void fill(FSIterator<FST> srcIter,
			Collection<FST> destCol) {
		srcIter.moveToFirst();
		while (srcIter.isValid()) {
			destCol.add(srcIter.get());
			srcIter.moveToNext();
		}
	}

	public static <FST extends FeatureStructure> List<FST> toList(FSIterator<FST> iter) {
		LinkedList<FST> result = newLinkedList();
		fill(iter, result);
		return result;
	}

	public static <FST extends FeatureStructure> Set<FST> toSet(FSIterator<FST> iter) {
		HashSet<FST> result = newHashSet();
		fill(iter, result);
		return result;
	}

	/**
	 * @param iter
	 * @return linked hashset to preserve iteration order
	 */
	public static <FST extends FeatureStructure> Set<FST> toLinkedHashSet(FSIterator<FST> iter) {
		HashSet<FST> result = newLinkedHashSet();
		fill(iter, result);
		return result;
	}

	@SuppressWarnings("unchecked")
	public static <FST extends FeatureStructure> List<FST> toList(FSArray casArray,
			Class<FST> fstClass) {
		List<FST> result = newArrayListWithCapacity(casArray.size());
		for (int i = 0; i < casArray.size(); i++) {
			result.add((FST) casArray.get(i));
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public static <T extends FeatureStructure> T getFeatureValueSafe(
			FeatureStructure srcFS, String featureName) {
		Feature feat = srcFS.getType().getFeatureByBaseName(featureName);
		if (feat != null) {
			return (T) srcFS.getFeatureValue(feat);
		} else {
			return null;
		}
	}

	/**
	 * @param cas
	 * @param type
	 * @param feature
	 * @return feature value of the first annotation of given type from given
	 *         CAS. E.g., it is useful to get document metadata values. If there
	 *         is no such annotation method will return null.
	 */
	public static String getStringValue(JCas cas, Type type, Feature feature) {
		return getStringValue(cas.getCas(), type, feature);
	}

	/**
	 * @param cas
	 * @param type
	 * @param feature
	 * @return feature value of the first annotation of given type from given
	 *         CAS. E.g., it is useful to get document metadata values. If there
	 *         is no such annotation method will return null.
	 */
	public static String getStringValue(CAS cas, Type type, Feature feature) {
		AnnotationIndex<AnnotationFS> metaIdx = cas.getAnnotationIndex(type);
		if (metaIdx.size() > 0) {
			AnnotationFS meta = metaIdx.iterator().next();
			return meta.getFeatureValueAsString(feature);
		} else {
			return null;
		}
	}

	private AnnotationUtils() {
	}

}