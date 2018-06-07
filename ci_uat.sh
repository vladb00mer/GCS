#!/usr/bin/env bash

cp ../gcs-ui/gcs-ui-app-spring-boot/target/gcs-ui-app-spring-boot-1.0.0.jar .

USER1=tbright
USER2=test-3

export GCS_DATASTORE_USERNAME="db2inst1"
export GCS_DATASTORE_PASSWORD="db2inst1-pwd"
export GCS_TEST_H2_DB_DIR="~/GCS"
export GCS_SERVER_PORT=9080
PROXY1_PORT=9081
PROXY2_PORT=9082

java -Dspring.profiles.active=ci-uat-test -jar gcs-ui-app-spring-boot-1.0.0.jar &

SERVER_UP_RESPONSE=$(curl --write-out %{http_code} --silent --output /dev/null http://localhost:$GCS_SERVER_PORT/api/v1/health)
c=1
while [ $c -le 30 ]
do
   (( c++ ))
   echo $c
   sleep 1
done

### choose the node executables
if [[ "$OSTYPE" =~ "darwin" ]]; then
 echo "running ci test on mac"
 NODE_EXE=./node-v8.9.3-darwin-x64/bin/node
elif [[ "$OSTYPE" =~ "linux" ]]; then
 echo "running ci test on linux"
 NODE_EXE=./node-v8.9.3-linux-x64/bin/node
fi
echo "using $NODE_EXE"

# assume node is on path
# starts up the first proxy
bash -c "exec -a proxy1 $NODE_EXE iv-user-proxy.js $GCS_SERVER_PORT $USER1 $PROXY1_PORT &"
export PROXY_1_PID=$(echo $!)
echo "proxy1 pid $PROXY_1_PID"

# starts up the second proxy
bash -c "exec -a proxy2 $NODE_EXE iv-user-proxy.js $GCS_SERVER_PORT $USER2 $PROXY2_PORT &"
export PROXY_2_PID=$(echo $!)
echo "proxy2 pid $PROXY_2_PID"

# see if proxy is working against the target gcs server
sleep 3 # just to make sure the node process started up already
curl --connect-timeout 60 --max-time 60 "http://localhost:$PROXY1_PORT/api/v1/health"
curl --connect-timeout 60 --max-time 60 "http://localhost:$PROXY2_PORT/api/v1/health"

echo ""

echo "This is suppose to do run the actual ci test here"

## kill the proxy server and gcs server
if pgrep -x "proxy1" > /dev/null
then
   echo "killing proxy1 process"
   pkill -f proxy1
   echo $?
else
   echo "process proxy1 does not exit, cannot pkill, try killing pid $PROXY_1_PID"
   kill $PROXY_1_PID
   echo $?
fi

if pgrep -x "proxy2" > /dev/null
then
  echo "killing process proxy2"
  pkill -f proxy2
  echo $?
else
  echo "process proxy2 does not exit, cannot pkill, try killing with pid $PROXY_2_PID"
  kill $PROXY_2_PID
  echo $?
fi

GCS_PID=$(pgrep -f ".*gcs-ui-app.*")
if [ "$GCS_PID" != "" ]; then
   echo "killing gcs ci test server"
   kill $GCS_PID
   echo $?
fi