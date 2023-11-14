#!/bin/bash

#200 rps target
#200 concurrent client threads
#25 connections
#1 minute duration
ghz --insecure --proto=src/main/proto/hello_service.proto --call example.grpc.hello.HelloService.Hello -d '{"name": "load_test"}' localhost:8000 -r 200 -n 0 -c 200 --lb-strategy='round_robin' --connections=25 -z 1m
