#!/usr/bin/bash

swagger-codegen generate -t api-templates/ -o ./target/client -l java --library okhttp-gson -i swagger.yaml -c config.json