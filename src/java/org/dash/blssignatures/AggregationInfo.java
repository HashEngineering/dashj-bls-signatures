/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.dash.blssignatures;

public class AggregationInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AggregationInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AggregationInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        blssignaturesJNI.delete_AggregationInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static AggregationInfo FromMsgHash(PublicKey pk, byte[] messageHash) {
    return new AggregationInfo(blssignaturesJNI.AggregationInfo_FromMsgHash(PublicKey.getCPtr(pk), pk, messageHash), true);
  }

  public static AggregationInfo FromMsg(PublicKey pk, byte[] message, long len) {
    return new AggregationInfo(blssignaturesJNI.AggregationInfo_FromMsg(PublicKey.getCPtr(pk), pk, message, len), true);
  }

  public static AggregationInfo FromVectors(PublicKeyVec pubKeys, ByteArrayVec messageHashes, BigIntegerVec exponents) {
    return new AggregationInfo(blssignaturesJNI.AggregationInfo_FromVectors(PublicKeyVec.getCPtr(pubKeys), pubKeys, ByteArrayVec.getCPtr(messageHashes), messageHashes, BigIntegerVec.getCPtr(exponents), exponents), true);
  }

  public static AggregationInfo MergeInfos(SWIGTYPE_p_std__vectorT_bls__AggregationInfo_t infos) {
    return new AggregationInfo(blssignaturesJNI.AggregationInfo_MergeInfos(SWIGTYPE_p_std__vectorT_bls__AggregationInfo_t.getCPtr(infos)), true);
  }

  public AggregationInfo(AggregationInfo info) {
    this(blssignaturesJNI.new_AggregationInfo__SWIG_0(AggregationInfo.getCPtr(info), info), true);
  }

  public void RemoveEntries(ByteArrayVec messages, PublicKeyVec pubKeys) {
    blssignaturesJNI.AggregationInfo_RemoveEntries(swigCPtr, this, ByteArrayVec.getCPtr(messages), messages, PublicKeyVec.getCPtr(pubKeys), pubKeys);
  }

  public void GetExponent(SWIGTYPE_p_bn_t result, byte[] messageHash, PublicKey pubkey) {
    blssignaturesJNI.AggregationInfo_GetExponent(swigCPtr, this, SWIGTYPE_p_bn_t.getCPtr(result), messageHash, PublicKey.getCPtr(pubkey), pubkey);
  }

  public PublicKeyVec GetPubKeys() {
    return new PublicKeyVec(blssignaturesJNI.AggregationInfo_GetPubKeys(swigCPtr, this), true);
  }

  public ByteArrayVec GetMessageHashes() {
    return new ByteArrayVec(blssignaturesJNI.AggregationInfo_GetMessageHashes(swigCPtr, this), true);
  }

  public boolean Empty() {
    return blssignaturesJNI.AggregationInfo_Empty(swigCPtr, this);
  }

  public AggregationInfo() {
    this(blssignaturesJNI.new_AggregationInfo__SWIG_1(), true);
  }

}