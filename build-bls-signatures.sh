#! /bin/sh
git submodule update  --init --recursive
cd src/bls-signatures
rm -r build
mkdir build
cd build
cmake ../
cmake --build . -- -j 6
cd ../../..