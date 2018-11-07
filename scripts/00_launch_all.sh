#!/usr/bin/env bash
echo This will take a few seconds
java -jar ../namingserver/target/namingserver-0.0.1-SNAPSHOT.jar >& ../logs/namingserver.log &
sleep 2 ; echo -n .
java -jar ../configserver/target/config_server-0.0.1-SNAPSHOT.jar >& ../logs/configserver.log &
sleep 2 ; echo -n .
java -jar ../ApiGateway/target/api-gateway-server-0.0.1-SNAPSHOT.jar >& ../logs/ApiGateway.log &
sleep 20 ; echo -n .
java -jar ../OrderMicro/target/orderMicro-0.0.1-SNAPSHOT.jar >& ../logs/ordersmicro.log &
sleep 2 ; echo -n .
echo ""
ps | grep java | grep jar
echo ""
echo done now try http://localhost:8080/reports to get Token and http://localhost:9002/services/tolldata to pass token
