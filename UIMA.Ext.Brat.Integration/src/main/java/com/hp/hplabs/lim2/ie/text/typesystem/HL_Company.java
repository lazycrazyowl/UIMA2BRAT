

/* First created by JCasGen Tue Feb 05 17:20:42 MSK 2013 */
package com.hp.hplabs.lim2.ie.text.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Feb 05 18:06:05 MSK 2013
 * XML source: /home/pathfinder/Projects/BRATWorkspace/git/UIMA.Ext.Brat.Integration/desc/an-desc-HL.xml
 * @generated */
public class HL_Company extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(HL_Company.class);
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
  protected HL_Company() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public HL_Company(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public HL_Company(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public HL_Company(JCas jcas, int begin, int end) {
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

    