

/* First created by JCasGen Tue Mar 12 00:30:02 MSK 2013 */
package ru.kfu.itis.issst.ner.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Mar 12 00:30:02 MSK 2013
 * XML source: /home/pathfinder/_WORK/Projects/BRATWorkspace/git/UIMA-Ext/UIMA.Ext.Brat.Integration/desc/UIMA2BratAnnotatorDescriptor.xml
 * @generated */
public class EmailAddress extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EmailAddress.class);
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
  protected EmailAddress() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public EmailAddress(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public EmailAddress(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public EmailAddress(JCas jcas, int begin, int end) {
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
  //* Feature: localPart

  /** getter for localPart - gets 
   * @generated */
  public String getLocalPart() {
    if (EmailAddress_Type.featOkTst && ((EmailAddress_Type)jcasType).casFeat_localPart == null)
      jcasType.jcas.throwFeatMissing("localPart", "ru.kfu.itis.issst.ner.typesystem.EmailAddress");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EmailAddress_Type)jcasType).casFeatCode_localPart);}
    
  /** setter for localPart - sets  
   * @generated */
  public void setLocalPart(String v) {
    if (EmailAddress_Type.featOkTst && ((EmailAddress_Type)jcasType).casFeat_localPart == null)
      jcasType.jcas.throwFeatMissing("localPart", "ru.kfu.itis.issst.ner.typesystem.EmailAddress");
    jcasType.ll_cas.ll_setStringValue(addr, ((EmailAddress_Type)jcasType).casFeatCode_localPart, v);}    
   
    
  //*--------------*
  //* Feature: domainPart

  /** getter for domainPart - gets 
   * @generated */
  public String getDomainPart() {
    if (EmailAddress_Type.featOkTst && ((EmailAddress_Type)jcasType).casFeat_domainPart == null)
      jcasType.jcas.throwFeatMissing("domainPart", "ru.kfu.itis.issst.ner.typesystem.EmailAddress");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EmailAddress_Type)jcasType).casFeatCode_domainPart);}
    
  /** setter for domainPart - sets  
   * @generated */
  public void setDomainPart(String v) {
    if (EmailAddress_Type.featOkTst && ((EmailAddress_Type)jcasType).casFeat_domainPart == null)
      jcasType.jcas.throwFeatMissing("domainPart", "ru.kfu.itis.issst.ner.typesystem.EmailAddress");
    jcasType.ll_cas.ll_setStringValue(addr, ((EmailAddress_Type)jcasType).casFeatCode_domainPart, v);}    
   
    
  //*--------------*
  //* Feature: normalizedEmail

  /** getter for normalizedEmail - gets 
   * @generated */
  public String getNormalizedEmail() {
    if (EmailAddress_Type.featOkTst && ((EmailAddress_Type)jcasType).casFeat_normalizedEmail == null)
      jcasType.jcas.throwFeatMissing("normalizedEmail", "ru.kfu.itis.issst.ner.typesystem.EmailAddress");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EmailAddress_Type)jcasType).casFeatCode_normalizedEmail);}
    
  /** setter for normalizedEmail - sets  
   * @generated */
  public void setNormalizedEmail(String v) {
    if (EmailAddress_Type.featOkTst && ((EmailAddress_Type)jcasType).casFeat_normalizedEmail == null)
      jcasType.jcas.throwFeatMissing("normalizedEmail", "ru.kfu.itis.issst.ner.typesystem.EmailAddress");
    jcasType.ll_cas.ll_setStringValue(addr, ((EmailAddress_Type)jcasType).casFeatCode_normalizedEmail, v);}    
  }

    