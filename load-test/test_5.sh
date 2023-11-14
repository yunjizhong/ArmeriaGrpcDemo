#!/bin/bash

#400 rps target
#200 concurrent client threads
#2 connections
#1 minute duration
ghz --insecure --proto=src/main/proto/hello_service.proto --call example.grpc.hello.HelloService.Hello -d '{"name": "load_test"}' localhost:8000 -r 400 -n 0 -c 200 --lb-strategy='round_robin' --connections=2 -z 1m
