#!/bin/bash

rm -rf build
mkdir build

cp -r src/main/java/org build/
cp -r src/main/resources/META-INF build/

cd build

javac org/apache/taglibs/extended/*.java &&

jar cvf ../lib/extended.jar org/apache/taglibs/extended/*.class META-INF