/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.dashcore.blssignatures;

public class CBLSId {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CBLSId(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CBLSId obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        blssignaturesJNI.delete_CBLSId(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void SetInt(int x) {
    blssignaturesJNI.CBLSId_SetInt(swigCPtr, this, x);
  }

  public void SetHash(SWIGTYPE_p_uint256 hash) {
    blssignaturesJNI.CBLSId_SetHash(swigCPtr, this, SWIGTYPE_p_uint256.getCPtr(hash));
  }

  public static CBLSId FromInt(long i) {
    return new CBLSId(blssignaturesJNI.CBLSId_FromInt(i), true);
  }

  public static CBLSId FromHash(SWIGTYPE_p_uint256 hash) {
    return new CBLSId(blssignaturesJNI.CBLSId_FromHash(SWIGTYPE_p_uint256.getCPtr(hash)), true);
  }

  public CBLSId() {
    this(blssignaturesJNI.new_CBLSId(), true);
  }

}
