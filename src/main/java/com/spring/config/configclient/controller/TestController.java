package com.spring.config.configclient.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/prop")

public class TestController {

    @Value("${message: Default Hello}")
    private String message;

    @GetMapping("/data")
    public String data() {
        return message;
    }
}
