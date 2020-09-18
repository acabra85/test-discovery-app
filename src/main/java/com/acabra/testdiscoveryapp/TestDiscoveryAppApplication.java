package com.acabra.testdiscoveryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestDiscoveryAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestDiscoveryAppApplication.class, args);
    }
}