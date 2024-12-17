package com.microservice_book.hola_springboot.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/api")
@ConfigurationProperties(prefix="helloapp")
public class HolaRestController {

    private String saying;

    @RequestMapping(method = RequestMethod.GET, value = "/hola", produces = "text/plain")
    public String hola() throws UnknownHostException {
        String hostName = null;
        try {
            hostName = InetAddress.getLocalHost().getHostAddress();
        }catch (UnknownHostException unknownHostException) {
            hostName = "Unknown1";
        }
        return saying + hostName;
    }

	public String getSaying() {
		return saying;
	}

	public void setSaying(String saying) {
		this.saying = saying;
	}

}
