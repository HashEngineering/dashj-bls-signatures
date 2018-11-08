/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.dash.blssignatures;

public class blssignaturesJNI {
  public final static native String BLS_GROUP_ORDER_get();
  public final static native long BLS_MESSAGE_HASH_LEN_get();
  public final static native boolean BLS_Init();
  public final static native void BLS_AssertInitialized();
  public final static native void BLS_Clean();
  public final static native void BLS_HashPubKeys(long jarg1, long jarg2, long jarg3, ByteArrayVector jarg3_, long jarg4);
  public final static native void BLS_CheckRelicErrors();
  public final static native long new_BLS();
  public final static native void delete_BLS(long jarg1);
  public final static native long ChainCode_CHAIN_CODE_SIZE_get();
  public final static native long ChainCode_FromBytes(byte[] jarg1);
  public final static native long new_ChainCode(long jarg1, ChainCode jarg1_);
  public final static native void ChainCode_Serialize__SWIG_0(long jarg1, ChainCode jarg1_, byte[] jarg2);
  public final static native long ChainCode_Serialize__SWIG_1(long jarg1, ChainCode jarg1_);
  public final static native void delete_ChainCode(long jarg1);
  public final static native long ExtendedPrivateKey_EXTENDED_PRIVATE_KEY_SIZE_get();
  public final static native long ExtendedPrivateKey_FromSeed(byte[] jarg1, long jarg2);
  public final static native long ExtendedPrivateKey_FromBytes(byte[] jarg1);
  public final static native long ExtendedPrivateKey_PrivateChild(long jarg1, ExtendedPrivateKey jarg1_, long jarg2);
  public final static native long ExtendedPrivateKey_PublicChild(long jarg1, ExtendedPrivateKey jarg1_, long jarg2);
  public final static native long ExtendedPrivateKey_GetVersion(long jarg1, ExtendedPrivateKey jarg1_);
  public final static native short ExtendedPrivateKey_GetDepth(long jarg1, ExtendedPrivateKey jarg1_);
  public final static native long ExtendedPrivateKey_GetParentFingerprint(long jarg1, ExtendedPrivateKey jarg1_);
  public final static native long ExtendedPrivateKey_GetChildNumber(long jarg1, ExtendedPrivateKey jarg1_);
  public final static native long ExtendedPrivateKey_GetChainCode(long jarg1, ExtendedPrivateKey jarg1_);
  public final static native long ExtendedPrivateKey_GetPrivateKey(long jarg1, ExtendedPrivateKey jarg1_);
  public final static native long ExtendedPrivateKey_GetPublicKey(long jarg1, ExtendedPrivateKey jarg1_);
  public final static native long ExtendedPrivateKey_GetExtendedPublicKey(long jarg1, ExtendedPrivateKey jarg1_);
  public final static native void ExtendedPrivateKey_Serialize__SWIG_0(long jarg1, ExtendedPrivateKey jarg1_, byte[] jarg2);
  public final static native long ExtendedPrivateKey_Serialize__SWIG_1(long jarg1, ExtendedPrivateKey jarg1_);
  public final static native void delete_ExtendedPrivateKey(long jarg1);
  public final static native long ExtendedPublicKey_VERSION_get();
  public final static native long ExtendedPublicKey_EXTENDED_PUBLIC_KEY_SIZE_get();
  public final static native long ExtendedPublicKey_FromBytes(byte[] jarg1);
  public final static native long ExtendedPublicKey_PublicChild(long jarg1, ExtendedPublicKey jarg1_, long jarg2);
  public final static native long ExtendedPublicKey_GetVersion(long jarg1, ExtendedPublicKey jarg1_);
  public final static native short ExtendedPublicKey_GetDepth(long jarg1, ExtendedPublicKey jarg1_);
  public final static native long ExtendedPublicKey_GetParentFingerprint(long jarg1, ExtendedPublicKey jarg1_);
  public final static native long ExtendedPublicKey_GetChildNumber(long jarg1, ExtendedPublicKey jarg1_);
  public final static native long ExtendedPublicKey_GetChainCode(long jarg1, ExtendedPublicKey jarg1_);
  public final static native long ExtendedPublicKey_GetPublicKey(long jarg1, ExtendedPublicKey jarg1_);
  public final static native void ExtendedPublicKey_Serialize__SWIG_0(long jarg1, ExtendedPublicKey jarg1_, byte[] jarg2);
  public final static native long ExtendedPublicKey_Serialize__SWIG_1(long jarg1, ExtendedPublicKey jarg1_);
  public final static native void delete_ExtendedPublicKey(long jarg1);
  public final static native long PrivateKey_PRIVATE_KEY_SIZE_get();
  public final static native long PrivateKey_FromSeed(byte[] jarg1, long jarg2);
  public final static native long PrivateKey_FromBytes__SWIG_0(byte[] jarg1, boolean jarg2);
  public final static native long PrivateKey_FromBytes__SWIG_1(byte[] jarg1);
  public final static native long new_PrivateKey__SWIG_0(long jarg1, PrivateKey jarg1_);
  public final static native void delete_PrivateKey(long jarg1);
  public final static native long PrivateKey_GetPublicKey(long jarg1, PrivateKey jarg1_);
  public final static native long PrivateKey_AggregateInsecure(long jarg1, PrivateKeyVec jarg1_);
  public final static native long PrivateKey_Aggregate(long jarg1, PrivateKeyVec jarg1_, long jarg2);
  public final static native void PrivateKey_Serialize__SWIG_0(long jarg1, PrivateKey jarg1_, byte[] jarg2);
  public final static native long PrivateKey_Serialize__SWIG_1(long jarg1, PrivateKey jarg1_);
  public final static native long PrivateKey_SignInsecure(long jarg1, PrivateKey jarg1_, byte[] jarg2, long jarg3);
  public final static native long PrivateKey_SignInsecurePrehashed(long jarg1, PrivateKey jarg1_, byte[] jarg2);
  public final static native long PrivateKey_Sign(long jarg1, PrivateKey jarg1_, byte[] jarg2, long jarg3);
  public final static native long PrivateKey_SignPrehashed(long jarg1, PrivateKey jarg1_, byte[] jarg2);
  public final static native long PublicKey_PUBLIC_KEY_SIZE_get();
  public final static native long PublicKey_FromBytes(byte[] jarg1);
  public final static native long PublicKey_FromG1(long jarg1);
  public final static native long new_PublicKey(long jarg1, PublicKey jarg1_);
  public final static native long PublicKey_AggregateInsecure(long jarg1, PublicKeyVector jarg1_);
  public final static native long PublicKey_Aggregate(long jarg1, PublicKeyVector jarg1_);
  public final static native void PublicKey_Serialize__SWIG_0(long jarg1, PublicKey jarg1_, byte[] jarg2);
  public final static native long PublicKey_Serialize__SWIG_1(long jarg1, PublicKey jarg1_);
  public final static native long PublicKey_GetFingerprint(long jarg1, PublicKey jarg1_);
  public final static native void delete_PublicKey(long jarg1);
  public final static native long InsecureSignature_SIGNATURE_SIZE_get();
  public final static native long InsecureSignature_FromBytes(byte[] jarg1);
  public final static native long InsecureSignature_FromG2(long jarg1);
  public final static native long new_InsecureSignature(long jarg1, InsecureSignature jarg1_);
  public final static native boolean InsecureSignature_Verify(long jarg1, InsecureSignature jarg1_, long jarg2, long jarg3, PublicKeyVector jarg3_);
  public final static native long InsecureSignature_Aggregate(long jarg1);
  public final static native long InsecureSignature_DivideBy(long jarg1, InsecureSignature jarg1_, long jarg2);
  public final static native void InsecureSignature_Serialize__SWIG_0(long jarg1, InsecureSignature jarg1_, byte[] jarg2);
  public final static native long InsecureSignature_Serialize__SWIG_1(long jarg1, InsecureSignature jarg1_);
  public final static native void delete_InsecureSignature(long jarg1);
  public final static native long Signature_SIGNATURE_SIZE_get();
  public final static native long Signature_FromBytes__SWIG_0(byte[] jarg1);
  public final static native long Signature_FromBytes__SWIG_1(byte[] jarg1, long jarg2);
  public final static native long Signature_FromG2__SWIG_0(long jarg1);
  public final static native long Signature_FromG2__SWIG_1(long jarg1, long jarg2);
  public final static native long Signature_FromInsecureSig__SWIG_0(long jarg1, InsecureSignature jarg1_);
  public final static native long Signature_FromInsecureSig__SWIG_1(long jarg1, InsecureSignature jarg1_, long jarg2);
  public final static native long new_Signature(long jarg1, Signature jarg1_);
  public final static native boolean Signature_Verify(long jarg1, Signature jarg1_);
  public final static native long Signature_AggregateSigs(long jarg1);
  public final static native long Signature_DivideBy(long jarg1, Signature jarg1_, long jarg2);
  public final static native long Signature_GetAggregationInfo(long jarg1, Signature jarg1_);
  public final static native void Signature_SetAggregationInfo(long jarg1, Signature jarg1_, long jarg2);
  public final static native void Signature_Serialize__SWIG_0(long jarg1, Signature jarg1_, byte[] jarg2);
  public final static native long Signature_Serialize__SWIG_1(long jarg1, Signature jarg1_);
  public final static native void delete_Signature(long jarg1);
  public final static native long AggregationInfo_FromMsgHash(long jarg1, PublicKey jarg1_, byte[] jarg2);
  public final static native long AggregationInfo_FromMsg(long jarg1, PublicKey jarg1_, byte[] jarg2, long jarg3);
  public final static native long AggregationInfo_FromVectors(long jarg1, PublicKeyVector jarg1_, long jarg2, ByteArrayVector jarg2_, long jarg3, BigIntegerVec jarg3_);
  public final static native long AggregationInfo_MergeInfos(long jarg1);
  public final static native long new_AggregationInfo__SWIG_0(long jarg1, AggregationInfo jarg1_);
  public final static native void AggregationInfo_RemoveEntries(long jarg1, AggregationInfo jarg1_, long jarg2, ByteArrayVector jarg2_, long jarg3, PublicKeyVector jarg3_);
  public final static native void AggregationInfo_GetExponent(long jarg1, AggregationInfo jarg1_, long jarg2, byte[] jarg3, long jarg4, PublicKey jarg4_);
  public final static native long AggregationInfo_GetPubKeys(long jarg1, AggregationInfo jarg1_);
  public final static native long AggregationInfo_GetMessageHashes(long jarg1, AggregationInfo jarg1_);
  public final static native boolean AggregationInfo_Empty(long jarg1, AggregationInfo jarg1_);
  public final static native long new_AggregationInfo__SWIG_1();
  public final static native void delete_AggregationInfo(long jarg1);
  public final static native long new_PublicKeyVec__SWIG_0();
  public final static native long new_PublicKeyVec__SWIG_1(long jarg1);
  public final static native long new_PublicKeyVec__SWIG_2(long jarg1, PublicKeyVector jarg1_);
  public final static native long PublicKeyVec_capacity(long jarg1, PublicKeyVector jarg1_);
  public final static native void PublicKeyVec_reserve(long jarg1, PublicKeyVector jarg1_, long jarg2);
  public final static native boolean PublicKeyVec_isEmpty(long jarg1, PublicKeyVector jarg1_);
  public final static native void PublicKeyVec_clear(long jarg1, PublicKeyVector jarg1_);
  public final static native void PublicKeyVec_push_back(long jarg1, PublicKeyVector jarg1_, long jarg2, PublicKey jarg2_);
  public final static native long PublicKeyVec_get(long jarg1, PublicKeyVector jarg1_, int jarg2);
  public final static native long PublicKeyVec_set(long jarg1, PublicKeyVector jarg1_, int jarg2, long jarg3, PublicKey jarg3_);
  public final static native int PublicKeyVec_size(long jarg1, PublicKeyVector jarg1_);
  public final static native void PublicKeyVec_removeRange(long jarg1, PublicKeyVector jarg1_, int jarg2, int jarg3);
  public final static native void delete_PublicKeyVec(long jarg1);
  public final static native long new_PrivateKeyVec__SWIG_0();
  public final static native long new_PrivateKeyVec__SWIG_1(long jarg1);
  public final static native long new_PrivateKeyVec__SWIG_2(long jarg1, PrivateKeyVec jarg1_);
  public final static native long PrivateKeyVec_capacity(long jarg1, PrivateKeyVec jarg1_);
  public final static native void PrivateKeyVec_reserve(long jarg1, PrivateKeyVec jarg1_, long jarg2);
  public final static native boolean PrivateKeyVec_isEmpty(long jarg1, PrivateKeyVec jarg1_);
  public final static native void PrivateKeyVec_clear(long jarg1, PrivateKeyVec jarg1_);
  public final static native void PrivateKeyVec_push_back(long jarg1, PrivateKeyVec jarg1_, long jarg2, PrivateKey jarg2_);
  public final static native long PrivateKeyVec_get(long jarg1, PrivateKeyVec jarg1_, int jarg2);
  public final static native long PrivateKeyVec_set(long jarg1, PrivateKeyVec jarg1_, int jarg2, long jarg3, PrivateKey jarg3_);
  public final static native int PrivateKeyVec_size(long jarg1, PrivateKeyVec jarg1_);
  public final static native void PrivateKeyVec_removeRange(long jarg1, PrivateKeyVec jarg1_, int jarg2, int jarg3);
  public final static native void delete_PrivateKeyVec(long jarg1);
  public final static native long new_ByteArrayVec__SWIG_0();
  public final static native long new_ByteArrayVec__SWIG_1(long jarg1);
  public final static native long new_ByteArrayVec__SWIG_2(long jarg1, ByteArrayVector jarg1_);
  public final static native long ByteArrayVec_capacity(long jarg1, ByteArrayVector jarg1_);
  public final static native void ByteArrayVec_reserve(long jarg1, ByteArrayVector jarg1_, long jarg2);
  public final static native boolean ByteArrayVec_isEmpty(long jarg1, ByteArrayVector jarg1_);
  public final static native void ByteArrayVec_clear(long jarg1, ByteArrayVector jarg1_);
  public final static native void ByteArrayVec_push_back(long jarg1, ByteArrayVector jarg1_, long jarg2);
  public final static native long ByteArrayVec_get(long jarg1, ByteArrayVector jarg1_, int jarg2);
  public final static native long ByteArrayVec_set(long jarg1, ByteArrayVector jarg1_, int jarg2, long jarg3);
  public final static native int ByteArrayVec_size(long jarg1, ByteArrayVector jarg1_);
  public final static native void ByteArrayVec_removeRange(long jarg1, ByteArrayVector jarg1_, int jarg2, int jarg3);
  public final static native void delete_ByteArrayVec(long jarg1);
  public final static native long new_BigIntegerVec__SWIG_0();
  public final static native long new_BigIntegerVec__SWIG_1(long jarg1);
  public final static native long new_BigIntegerVec__SWIG_2(long jarg1, BigIntegerVec jarg1_);
  public final static native long BigIntegerVec_capacity(long jarg1, BigIntegerVec jarg1_);
  public final static native void BigIntegerVec_reserve(long jarg1, BigIntegerVec jarg1_, long jarg2);
  public final static native boolean BigIntegerVec_isEmpty(long jarg1, BigIntegerVec jarg1_);
  public final static native void BigIntegerVec_clear(long jarg1, BigIntegerVec jarg1_);
  public final static native void BigIntegerVec_push_back(long jarg1, BigIntegerVec jarg1_, long jarg2);
  public final static native long BigIntegerVec_get(long jarg1, BigIntegerVec jarg1_, int jarg2);
  public final static native long BigIntegerVec_set(long jarg1, BigIntegerVec jarg1_, int jarg2, long jarg3);
  public final static native int BigIntegerVec_size(long jarg1, BigIntegerVec jarg1_);
  public final static native void BigIntegerVec_removeRange(long jarg1, BigIntegerVec jarg1_, int jarg2, int jarg3);
  public final static native void delete_BigIntegerVec(long jarg1);
  public final static native long new_SignatureVector__SWIG_0();
  public final static native long new_SignatureVector__SWIG_1(long jarg1);
  public final static native long new_SignatureVector__SWIG_2(long jarg1, SignatureVector jarg1_);
  public final static native long SignatureVector_capacity(long jarg1, SignatureVector jarg1_);
  public final static native void SignatureVector_reserve(long jarg1, SignatureVector jarg1_, long jarg2);
  public final static native boolean SignatureVector_isEmpty(long jarg1, SignatureVector jarg1_);
  public final static native void SignatureVector_clear(long jarg1, SignatureVector jarg1_);
  public final static native void SignatureVector_push_back(long jarg1, SignatureVector jarg1_, long jarg2, Signature jarg2_);
  public final static native long SignatureVector_get(long jarg1, SignatureVector jarg1_, int jarg2);
  public final static native long SignatureVector_set(long jarg1, SignatureVector jarg1_, int jarg2, long jarg3, Signature jarg3_);
  public final static native int SignatureVector_size(long jarg1, SignatureVector jarg1_);
  public final static native void SignatureVector_removeRange(long jarg1, SignatureVector jarg1_, int jarg2, int jarg3);
  public final static native void delete_SignatureVector(long jarg1);
}
