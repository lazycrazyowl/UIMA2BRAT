

/* First created by JCasGen Tue Feb 05 17:20:43 MSK 2013 */
package com.hp.hplabs.lim2.ie.text.typesystem.temporal;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Feb 05 18:06:06 MSK 2013
 * XML source: /home/pathfinder/Projects/BRATWorkspace/git/UIMA.Ext.Brat.Integration/desc/an-desc-HL.xml
 * @generated */
public class TE_PossibleYear extends TE_Base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TE_PossibleYear.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TE_PossibleYear() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TE_PossibleYear(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TE_PossibleYear(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TE_PossibleYear(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
}

    