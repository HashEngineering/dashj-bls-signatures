/* Fix for jlong on some versions of gcc on Windows */
#if defined(__GNUC__) && !defined(__INTEL_COMPILER)
  typedef long long __int64;
#endif

/* Fix for jlong on 64-bit x86 Solaris */
#if defined(__x86_64)
# ifdef _LP64
#   undef _LP64
# endif
#endif

#include "org_dash_bls_DashBlsJni.h"
#include <iostream>
#include "bls.hpp"

using namespace bls;

JNIEXPORT jlong JNICALL Java_org_dash_bls_BLSPublicKey_FromBytes(JNIEnv * jenv, jclass, jbyteArray seed) {

    uint8_t * _seed = (uint8_t *) jenv->GetByteArrayElements(seed, 0);

    PublicKey result = bls::PublicKey::FromBytes(_seed);

    jenv->ReleaseByteArrayElements(seed, (jbyte *)_seed, 0);

    return (long)new bls::PublicKey(result);

}
