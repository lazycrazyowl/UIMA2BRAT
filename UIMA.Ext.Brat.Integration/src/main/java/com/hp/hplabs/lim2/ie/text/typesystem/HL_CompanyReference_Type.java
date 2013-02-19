
/* First created by JCasGen Tue Feb 05 17:20:42 MSK 2013 */
package com.hp.hplabs.lim2.ie.text.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Feb 05 18:06:06 MSK 2013
 * @generated */
public class HL_CompanyReference_Type extends HL_EntityReference_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (HL_CompanyReference_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = HL_CompanyReference_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new HL_CompanyReference(addr, HL_CompanyReference_Type.this);
  			   HL_CompanyReference_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new HL_CompanyReference(addr, HL_CompanyReference_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = HL_CompanyReference.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.hp.hplabs.lim2.ie.text.typesystem.HL_CompanyReference");
 
  /** @generated */
  final Feature casFeat_company;
  /** @generated */
  final int     casFeatCode_company;
  /** @generated */ 
  public int getCompany(int addr) {
        if (featOkTst && casFeat_company == null)
      jcas.throwFeatMissing("company", "com.hp.hplabs.lim2.ie.text.typesystem.HL_CompanyReference");
    return ll_cas.ll_getRefValue(addr, casFeatCode_company);
  }
  /** @generated */    
  public void setCompany(int addr, int v) {
        if (featOkTst && casFeat_company == null)
      jcas.throwFeatMissing("company", "com.hp.hplabs.lim2.ie.text.typesystem.HL_CompanyReference");
    ll_cas.ll_setRefValue(addr, casFeatCode_company, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public HL_CompanyReference_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_company = jcas.getRequiredFeatureDE(casType, "company", "com.hp.hplabs.lim2.ie.text.typesystem.HL_Company", featOkTst);
    casFeatCode_company  = (null == casFeat_company) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_company).getCode();

  }
}



    