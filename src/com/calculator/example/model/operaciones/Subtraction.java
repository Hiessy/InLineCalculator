package com.calculator.example.model.operaciones;

public class Subtraction extends Operation {

    @Override
    public double calcular(double value1, double value2) {
	return (value1 - value2);
    }

}
