%module blssignatures
%{
#include "bls-signatures/src/bls.hpp"
#include "bls-signatures/src/chaincode.hpp"
#include "bls-signatures/src/extendedprivatekey.hpp"
#include "bls-signatures/src/extendedpublickey.hpp"
#include "bls-signatures/src/privatekey.hpp"
#include "bls-signatures/src/publickey.hpp"
#include "bls-signatures/src/signature.hpp"
#include "bls-signatures/src/aggregationinfo.hpp"
#include "cpp/bls.h"
%}


/*%typemap(out) PublicKey { $result = bls::PublicKey($1) };

%typemap(jni) bls::PublicKey PUBLICKEY "jobject"
%typemap(jtype) bls::PublicKey PUBLICKEY "PublicKey"
%typemap(jstype) bls::PublicKey PUBLICKEY "PublicKey"
%typemap(in) bls::PublicKey PUBLICKEY {
  $1 = *(bls::PublicKey*)$input.getCPtr(); 
}
%typemap(out) bls::PublicKey PUBLICKEY {
  $result = new PublicKey($1); 
}
%typemap(javaout) bls::PublicKey PUBLICKEY {
  return new PublicKey($jnicall, $owner);
}

%apply bls::PublicKey PUBLICKEY { bls::PublicKey result };
*/


/*
%typemap(jstype) bls::ExtendedPublicKey "ExtendedPublicKey" // the C/C++ type bls::ExtendedPublicKey corresponds to the JAVA type org.dash.blssignatures.ExtendedPublicKey (jstype: C++ type corresponds to JAVA type)
%typemap(javain) bls::ExtendedPublicKey "$javainput.getCPtr()" // javain tells SWIG how to pass the JAVA object to the intermediary JNI class (e.g. swig_exampleJNI.java); see next step also
%typemap(jtype) bls::ExtendedPublicKey "long" // the C/C++ type bls::ExtendedPublicKey corresponds to the JAVA intermediary type long. JAVA intermediary types are used in the intermediary JNI class (e.g. swig_exampleJNI.java)
%typemap(jni) bls::ExtendedPublicKey "jlong" // the C/C++ type bls::ExtendedPublicKey corresponds to the C/C++ JNI type long, which is used in the generated C/C++ JNI functions in e.g. swig_example_wrap.cpp 
// the typemap for in specifies how to create the C/C++ object out of the datatype specified in jni
// this is C/C++ code which is injected in the C/C++ JNI function to create the bls::ExtendedPublicKey for further processing in the C/C++ code
%typemap(in) bls::ExtendedPublicKey {
        $1 = *(bls::ExtendedPublicKey **)&$input;
}
%typemap(javaout) bls::ExtendedPublicKey {
     return new ExtendedPublicKey($jnicall, $owner);
}

%typemap(jstype) bls::PublicKey "PublicKey" // the C/C++ type bls::PublicKey corresponds to the JAVA type org.dash.blssignatures.PublicKey (jstype: C++ type corresponds to JAVA type)
%typemap(javain) bls::PublicKey "$javainput.getCPtr()" // javain tells SWIG how to pass the JAVA object to the intermediary JNI class (e.g. swig_exampleJNI.java); see next step also
%typemap(jtype) bls::PublicKey "long" // the C/C++ type bls::PublicKey corresponds to the JAVA intermediary type long. JAVA intermediary types are used in the intermediary JNI class (e.g. swig_exampleJNI.java)
%typemap(jni) bls::PublicKey "jlong" // the C/C++ type bls::PublicKey corresponds to the C/C++ JNI type long, which is used in the generated C/C++ JNI functions in e.g. swig_example_wrap.cpp
// the typemap for in specifies how to create the C/C++ object out of the datatype specified in jni
// this is C/C++ code which is injected in the C/C++ JNI function to create the bls::PublicKey for further processing in the C/C++ code
%typemap(in) bls::PublicKey {
        $1 = *(bls::PublicKey **)&$input;
}
%typemap(javaout) bls::PublicKey {
     return new PublicKey($jnicall, $owner);
}
*/
%typemap(jni) uint8_t *UBYTE "jbyteArray"
%typemap(jtype) uint8_t *UBYTE "byte[]"
%typemap(jstype) uint8_t *UBYTE "byte[]"
%typemap(in) uint8_t *UBYTE {
  $1 = (uint8_t *) JCALL2(GetByteArrayElements, jenv, $input, 0);
}

%typemap(argout) uint8_t *UBYTE {
  JCALL3(ReleaseByteArrayElements, jenv, $input, (jbyte *) $1, 0);
}

%typemap(javain) uint8_t *UBYTE "$javainput"

/* Prevent default freearg typemap from being used */
%typemap(freearg) uint8_t *UBYTE ""

%apply uint8_t *UBYTE { const uint8_t* key };
%apply uint8_t *UBYTE { const uint8_t* seed };
%apply uint8_t *UBYTE { const uint8_t* bytes };
%apply uint8_t *UBYTE { const uint8_t* serialized };
%apply uint8_t *UBYTE { const uint8_t *msg };
%apply uint8_t *UBYTE { const uint8_t *hash };
%apply uint8_t *UBYTE { const uint8_t *buffer };
%apply uint8_t *UBYTE { const uint8_t *message };
%apply uint8_t *UBYTE { const uint8_t *messageHash };
%apply uint8_t *UBYTE { uint8_t *buffer };
typedef unsigned int		uint32_t;
%include vector.i


%feature("valuewrapper") bls::PublicKey;

namespace bls {


};

%include "cpp/bls.h"

/*
%template(PublicKeyVec) std::vector<bls::PublicKey>;
%template(PrivateKeyVec) std::vector<bls::PrivateKey>;
%template(ByteArrayVec) std::vector<uint8_t*>;
%template(BigIntegerVec) std::vector<bn_t*>;
%template(PrivateKeyVec) std::vector<bls::AggregationInfo>;
*/
%template(CBLSPrivateKey) CBLSWrapper< bls::PrivateKey,int,CBLSSecretKey >;

// declaration of class X, e.g. %include X.h
/*
%extend bls::PublicKey {
    X(T a) {
        X* newX = new X();
        newX->init(a);
        return newX;
    }
};*/