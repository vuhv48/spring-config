package com.microservice.configurations.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ConfigController {

    @Value("${build.version}")
    private String buildVersion;

    private final Environment env;

    @RequestMapping(method = RequestMethod.GET, value = "/build-info")
    public String value(){
        return  buildVersion;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/java-version")
    public ResponseEntity<String> getJavaVersion(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(env.getProperty("JAVA_HOME"));
    }

}
