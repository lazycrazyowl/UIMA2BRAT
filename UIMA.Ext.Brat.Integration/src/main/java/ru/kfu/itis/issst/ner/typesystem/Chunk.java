

/* First created by JCasGen Tue Mar 12 00:30:02 MSK 2013 */
package ru.kfu.itis.issst.ner.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Mar 12 00:30:02 MSK 2013
 * XML source: /home/pathfinder/_WORK/Projects/BRATWorkspace/git/UIMA-Ext/UIMA.Ext.Brat.Integration/desc/UIMA2BratAnnotatorDescriptor.xml
 * @generated */
public class Chunk extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Chunk.class);
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
  protected Chunk() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Chunk(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Chunk(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Chunk(JCas jcas, int begin, int end) {
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
  //* Feature: chunkType

  /** getter for chunkType - gets The type of chunk (NP, VP, PP...)
   * @generated */
  public String getChunkType() {
    if (Chunk_Type.featOkTst && ((Chunk_Type)jcasType).casFeat_chunkType == null)
      jcasType.jcas.throwFeatMissing("chunkType", "ru.kfu.itis.issst.ner.typesystem.Chunk");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Chunk_Type)jcasType).casFeatCode_chunkType);}
    
  /** setter for chunkType - sets The type of chunk (NP, VP, PP...) 
   * @generated */
  public void setChunkType(String v) {
    if (Chunk_Type.featOkTst && ((Chunk_Type)jcasType).casFeat_chunkType == null)
      jcasType.jcas.throwFeatMissing("chunkType", "ru.kfu.itis.issst.ner.typesystem.Chunk");
    jcasType.ll_cas.ll_setStringValue(addr, ((Chunk_Type)jcasType).casFeatCode_chunkType, v);}    
  }

    