package com.calculator.example.model;

import com.calculator.example.model.operaciones.OperationFactory;

/*
 * 
 * Calculator class implementing the Singleton design pattern.  
 *	By Martin Diaz 
 */
public class Calculator {

    private static Calculator instanciaCalculadoraLienal = new Calculator();
    private OperationFactory operationFactory = new OperationFactory();
    private double total = 0.0;
    private String sign = "+";

    // For the definition of singleton there should be a none parameterize
    // constructor and it should be private
    private Calculator() {
    }

    // This will return the only available object
    public static Calculator getInstance() {
	return instanciaCalculadoraLienal;
    }

    public double getTotal() {

	return this.total;
    }

    // resets all value to there initial setting
    public void clear() {
	total = 0.0;
	sign = "+";
    }

    public void addnumber(double value) {
	this.total = operationFactory.getOperacion(sign).calcular(total, value);
    }

    public void addOperation(String sign) {
	this.sign = sign;
    }

}