#! /bin/sh
 javac -cp src/java -d out/javabuild src/java/org/dash/bls/DashBlsJni.java src/java/org/dash/blssignatures/*.java
 java -cp out/javabuild -Djava.library.path=lib org.dash.bls.DashBlsJni