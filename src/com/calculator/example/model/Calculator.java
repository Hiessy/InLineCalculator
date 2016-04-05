package com.calculator.example.model;

import java.util.ArrayList;
import java.util.List;

import com.calculator.example.model.operaciones.OperationFactory;

/*
 * 
 * Calculator class implementing the Singleton design pattern.  
 *	By Martin Diaz 
 */
public class Calculator {

	private static final double PI = Math.PI;
	private static final double E = Math.E;
	private static Calculator inLineCalculatorInstance = new Calculator();
	private static List<Double> totalList = new ArrayList<Double>();
	private static List<String> signList = new ArrayList<String>();
	private OperationFactory operationFactory = new OperationFactory();
	private double total = 0.0;
	private String sign = "+";

	// For the definition of singleton there should be a none parameterize
	// constructor and it should be private
	private Calculator() {
	}

	// This will return the only available object
	public static Calculator getInstance() {
		return inLineCalculatorInstance;
	}

	// public static Calculator getparenthesesInstance() {
	// return parenthesesCalculatorInstance;
	// }

	public double getTotal() {
		return this.total;
	}

	public double getPI() {
		return PI;
	}

	public double getE() {
		return E;
	}

	// resets all value to there initial setting
	public void clear() {
		total = 0.0;
		sign = "+";
	}

	public void addNumber(double value) {
		this.total = operationFactory.getOperacion(sign).calcular(total, value);
	}

	public void addNumberEndParenthesis(double value) {
		this.total = operationFactory.getOperacion(sign).calcular(value, total);
	}

	public void addOperation(String sign) {
		this.sign = sign;
	}

	public String getOperation() {
		return this.sign;
	}

	public void addTotal(Double value) {
		totalList.add(value);
	}

	public Double removeTotal() {
		return totalList.remove(totalList.size() - 1);
	}

	public void addSign(String sign) {
		signList.add(sign);
	}

	public String removeSign() {
		return signList.remove(signList.size() - 1);
	}
}