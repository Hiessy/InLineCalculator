package com.calculator.example.model.operaciones;

public class Power extends Operation {

    @Override
    public double calcular(double value1, double value2) {

	return (Math.pow(value1, value2));
    }

}
