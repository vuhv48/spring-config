package com.microservice.cloud_config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ConfigController {
	
	@Value("${build.version}")
    private String buildVersion;

    @RequestMapping(method = RequestMethod.GET, value = "/build-info")
    public String value(){
        return  buildVersion;
    }
}
