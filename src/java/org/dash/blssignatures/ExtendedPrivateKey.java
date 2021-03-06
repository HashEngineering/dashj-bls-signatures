/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.dash.blssignatures;

public class ExtendedPrivateKey {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ExtendedPrivateKey(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExtendedPrivateKey obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        blssignaturesJNI.delete_ExtendedPrivateKey(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static ExtendedPrivateKey FromSeed(byte[] seed, long seedLen) {
    return new ExtendedPrivateKey(blssignaturesJNI.ExtendedPrivateKey_FromSeed(seed, seedLen), true);
  }

  public static ExtendedPrivateKey FromBytes(byte[] serialized) {
    return new ExtendedPrivateKey(blssignaturesJNI.ExtendedPrivateKey_FromBytes(serialized), true);
  }

  public ExtendedPrivateKey PrivateChild(long i) {
    return new ExtendedPrivateKey(blssignaturesJNI.ExtendedPrivateKey_PrivateChild(swigCPtr, this, i), true);
  }

  public SWIGTYPE_p_ExtendedPublicKey PublicChild(long i) {
    return new SWIGTYPE_p_ExtendedPublicKey(blssignaturesJNI.ExtendedPrivateKey_PublicChild(swigCPtr, this, i), true);
  }

  public long GetVersion() {
    return blssignaturesJNI.ExtendedPrivateKey_GetVersion(swigCPtr, this);
  }

  public short GetDepth() {
    return blssignaturesJNI.ExtendedPrivateKey_GetDepth(swigCPtr, this);
  }

  public long GetParentFingerprint() {
    return blssignaturesJNI.ExtendedPrivateKey_GetParentFingerprint(swigCPtr, this);
  }

  public long GetChildNumber() {
    return blssignaturesJNI.ExtendedPrivateKey_GetChildNumber(swigCPtr, this);
  }

  public ChainCode GetChainCode() {
    return new ChainCode(blssignaturesJNI.ExtendedPrivateKey_GetChainCode(swigCPtr, this), true);
  }

  public SWIGTYPE_p_PrivateKey GetPrivateKey() {
    return new SWIGTYPE_p_PrivateKey(blssignaturesJNI.ExtendedPrivateKey_GetPrivateKey(swigCPtr, this), true);
  }

  public SWIGTYPE_p_PublicKey GetPublicKey() {
    return new SWIGTYPE_p_PublicKey(blssignaturesJNI.ExtendedPrivateKey_GetPublicKey(swigCPtr, this), true);
  }

  public SWIGTYPE_p_ExtendedPublicKey GetExtendedPublicKey() {
    return new SWIGTYPE_p_ExtendedPublicKey(blssignaturesJNI.ExtendedPrivateKey_GetExtendedPublicKey(swigCPtr, this), true);
  }

  public void Serialize(byte[] buffer) {
    blssignaturesJNI.ExtendedPrivateKey_Serialize__SWIG_0(swigCPtr, this, buffer);
  }

  public SWIGTYPE_p_std__vectorT_unsigned_char_t Serialize() {
    return new SWIGTYPE_p_std__vectorT_unsigned_char_t(blssignaturesJNI.ExtendedPrivateKey_Serialize__SWIG_1(swigCPtr, this), true);
  }

  public final static long EXTENDED_PRIVATE_KEY_SIZE = blssignaturesJNI.ExtendedPrivateKey_EXTENDED_PRIVATE_KEY_SIZE_get();
}
