#!/bin/zsh

export JAVA_HOME=`/usr/libexec/java_home -v 1.8.0`
java -version
mvn clean
mvn install -DskipTests 
if [ $? -eq 0 ]
then
    osascript -e 'display notification "TeaVM was installed succesfully" with title "TeaVM Builder"'
else
    osascript -e 'display notification "TeaVM install produced an error" with title "TeaVM Builder"'
fi