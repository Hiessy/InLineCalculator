package com.calculator.example.model.operaciones;

public class Logarithm extends Operation {

    @Override
    public double calcular(double value1, double value2) {

	return Math.log(value1)/Math.log(value2);
    }


}
