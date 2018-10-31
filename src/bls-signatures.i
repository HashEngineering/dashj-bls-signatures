%module blssignatures
%{
#include "bls-signatures/src/bls.hpp"
#include "bls-signatures/src/chaincode.hpp"
#include "bls-signatures/src/extendedprivatekey.hpp"
#include "bls-signatures/src/extendedpublickey.hpp"
#include "bls-signatures/src/privatekey.hpp"
#include "bls-signatures/src/publickey.hpp"
#include "bls-signatures/src/signature.hpp"

using namespace bls; //this fixes many undefined symbols
%}

%include various.i
%apply char *BYTE { const uint8_t* key };
%apply char *BYTE { const uint8_t* seed };
%include "bls-signatures/src/bls.hpp"
%include "bls-signatures/src/chaincode.hpp"
%include "bls-signatures/src/extendedprivatekey.hpp"
%include "bls-signatures/src/extendedpublickey.hpp"
%include "bls-signatures/src/privatekey.hpp"
%include "bls-signatures/src/publickey.hpp"
%include "bls-signatures/src/signature.hpp"
