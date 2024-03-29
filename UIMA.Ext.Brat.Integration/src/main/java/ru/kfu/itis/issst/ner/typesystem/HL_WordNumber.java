

/* First created by JCasGen Tue Mar 12 00:30:02 MSK 2013 */
package ru.kfu.itis.issst.ner.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Mar 12 00:30:02 MSK 2013
 * XML source: /home/pathfinder/_WORK/Projects/BRATWorkspace/git/UIMA-Ext/UIMA.Ext.Brat.Integration/desc/UIMA2BratAnnotatorDescriptor.xml
 * @generated */
public class HL_WordNumber extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(HL_WordNumber.class);
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
  protected HL_WordNumber() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public HL_WordNumber(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public HL_WordNumber(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public HL_WordNumber(JCas jcas, int begin, int end) {
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
     
 
    
  //*--------------*
  //* Feature: num

  /** getter for num - gets The actual number behine thie words
   * @generated */
  public String getNum() {
    if (HL_WordNumber_Type.featOkTst && ((HL_WordNumber_Type)jcasType).casFeat_num == null)
      jcasType.jcas.throwFeatMissing("num", "ru.kfu.itis.issst.ner.typesystem.HL_WordNumber");
    return jcasType.ll_cas.ll_getStringValue(addr, ((HL_WordNumber_Type)jcasType).casFeatCode_num);}
    
  /** setter for num - sets The actual number behine thie words 
   * @generated */
  public void setNum(String v) {
    if (HL_WordNumber_Type.featOkTst && ((HL_WordNumber_Type)jcasType).casFeat_num == null)
      jcasType.jcas.throwFeatMissing("num", "ru.kfu.itis.issst.ner.typesystem.HL_WordNumber");
    jcasType.ll_cas.ll_setStringValue(addr, ((HL_WordNumber_Type)jcasType).casFeatCode_num, v);}    
  }

    