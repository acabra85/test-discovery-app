package com.acabra.testdiscoveryapp.web;

import com.acabra.testdiscoveryapp.control.Calculator;
import com.acabra.testdiscoveryapp.dto.CalculationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    final Calculator calculator;

    @Autowired
    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    public CalculationResponse add(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return new CalculationResponse(calculator.add(Double.parseDouble(num1), Double.parseDouble(num2)));
    }
}