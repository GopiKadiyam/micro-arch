package com.gk.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/test")
    public ResponseEntity<Map<String,String>> test(){
        return ResponseEntity.ok(Map.of("status",appName+" working"));
    }

}
