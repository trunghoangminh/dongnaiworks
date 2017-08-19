#!/bin/bash
echo "Start Dong Nai Works application"
mvn clean install -DskipTests
java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8889,suspend=n -jar target/DongNaiWorks-0.0.1-SNAPSHOT.jar
echo "Execute command successfully"​