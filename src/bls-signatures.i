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

%include "bls-signatures/src/bls.hpp"
%include "bls-signatures/src/chaincode.hpp"
%include "bls-signatures/src/extendedprivatekey.hpp"
%include "bls-signatures/src/extendedpublickey.hpp"
%include "bls-signatures/src/privatekey.hpp"
%include "bls-signatures/src/publickey.hpp"
%include "bls-signatures/src/signature.hpp"
