package com.develhope.deployEnvironmentVariables1.controllers;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class DevController {
    @Autowired
    private Environment enviroment;


    @GetMapping
    public ResponseEntity<String> sayHello() {
        String authCode = enviroment.getProperty("authCode");
        String devName = enviroment.getProperty("devName");
        return ResponseEntity.ok( "Hello, " + devName + "! Your auth code is: " + authCode);
    }
}
