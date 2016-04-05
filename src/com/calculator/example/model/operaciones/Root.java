package com.calculator.example.model.operaciones;

public class Root extends Operation {
    @Override
    public double calcular(double value1, double value2) {

	return Math.pow(value1, 1.0 / value2);
    }
}
