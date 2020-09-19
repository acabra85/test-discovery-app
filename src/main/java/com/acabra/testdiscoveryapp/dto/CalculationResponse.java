package com.acabra.testdiscoveryapp.dto;

public class CalculationResponse {
    private double value;
    private boolean error;

    public CalculationResponse(double value) {
        this.value = value;
        this.error = false;
    }

    public CalculationResponse(double val, boolean isError) {
        this.value = val;
        this.error = isError;
    }

    public static CalculationResponse ofError(){
        return new CalculationResponse(Double.NaN, true);
    }

    public double getValue() {
        return value;
    }

    public boolean isError() {
        return error;
    }
}
