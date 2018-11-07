#!/usr/bin/env bash

java -jar ../OrderMicro/target/orderMicro-0.0.1-SNAPSHOT.jar >& ../logs/ordersmicro.log &
sleep 2 ; echo -n .
