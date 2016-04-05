package com.calculator.example.model.operaciones;

public class Percentaje extends Operation {

    @Override
    public double calcular(double value1, double value2) {

	return (value2/value1)*100;
    }

}
