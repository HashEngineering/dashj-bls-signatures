#! /bin/sh
swig -c++ -java -cppext cpp -package org.dash.blssignatures -outdir src/java/org/dash/blssignatures -o src/cpp/bls-signature-wrapper.cpp src/bls-signatures.i