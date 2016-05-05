#!/bin/sh

if [ "$1" == "--cleanup" ]; then
	rm -f $(find src/ | grep .class)
	rm -f openmcauth.jar
	exit 0
fi

for i in $(find src/ | grep .java); do
	javac -cp gson.jar:src/ $i
done

find src/ | grep .class | zip -@ openmcauth.jar
