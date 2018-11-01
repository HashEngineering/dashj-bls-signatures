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

JNIEXPORT jlong JNICALL Java_org_dash_bls_DashBlsJniSimple_publicKeyFingerprint
  (JNIEnv* env, jobject thisObject, jintArray jseed) {
    
    jsize seed_len = env->GetArrayLength(jseed);
    jint* jseedbody = env->GetIntArrayElements(jseed, 0);
    
    uint8_t seed[seed_len];
    for (int i=0; i<seed_len; i++) {
        seed[i] = jseedbody[i];
    }
    
    bls::PrivateKey sk = bls::PrivateKey::FromSeed(seed, sizeof(seed));
    bls::PublicKey pk = sk.GetPublicKey();
    std::cout << "Fingerprint (native/java):\t" << pk.GetFingerprint() << std::endl;
    
    env->ReleaseIntArrayElements(jseed, jseedbody, 0);
    
    return pk.GetFingerprint();
}

JNIEXPORT void JNICALL Java_org_dash_bls_DashBlsJniSimple_nativePublicKeyFingerprint
  (JNIEnv* env, jobject thisObject) {

    std::cout << "Fingerprint (native)" << std::endl;

    uint8_t seed[] = {0, 50, 6, 244, 24, 199, 1, 25, 52, 88, 192,
                      19, 18, 12, 89, 6, 220, 18, 102, 58, 209,
                      82, 12, 62, 89, 110, 182, 9, 44, 20, 254, 22};

    bls::PrivateKey sk = bls::PrivateKey::FromSeed(seed, sizeof(seed));
    bls::PublicKey pk = sk.GetPublicKey();
    std::cout << "Fingerprint (native):\t\t" << pk.GetFingerprint() << std::endl;
  }
