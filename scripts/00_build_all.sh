#!/usr/bin/env bash

for SERVICE in  namingserver ApiGateway configserver OrderMicro
do
  (cd ../$SERVICE ; mvn clean package)
done
