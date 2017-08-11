#!/usr/bin/env bash
gradle clean build

name=$1

docker build -t ${name} .