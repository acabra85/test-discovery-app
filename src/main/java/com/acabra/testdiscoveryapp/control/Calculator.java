package com.acabra.testdiscoveryapp.control;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
}
