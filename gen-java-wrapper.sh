#! /bin/sh
swig -c++ -java -cppext cpp -package org.dash.swigbls -outdir src/java/org/dash/swigbls -o src/cpp/swig-bls-signature-wrapper.cpp src/bls-signatures.i
swig -c++ -java -cppext cpp -package org.dashcore.blssignatures -outdir src/java/org/dashcore/blssignatures -o src/cpp/bls-dash-core-wrapper.cpp src/bls-dash.i
javah -o src/blssignatures.h -cp src/java org.dash.blssignatures.blssignaturesJNI