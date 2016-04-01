package com.calculator.example.model.operaciones;

public class Division extends Operation {

    @Override
    public double calcular(double value1, double value2) {
	if (value2 != 0)
	    return (value1 / value2);
	else
	    throw new IllegalArgumentException("El valor ingresado es un 0, no se puede divir por 0");
    }

}
