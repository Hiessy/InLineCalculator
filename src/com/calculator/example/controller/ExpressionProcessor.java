package com.calculator.example.controller;

import com.calculator.example.model.Calculator;

public class ExpressionProcessor {

    private Calculator calculator = Calculator.getInstance();

    public void calcular(String[] expresionArray) {
	Double total = 0.0;

	for (int i = 0; i < expresionArray.length; i++) {

	    if (!ExpressionValidator.isEquals(expresionArray[i])) {

		if (!ExpressionValidator.isNumber(expresionArray[i])) {
		    calculator.addOperation(expresionArray[i]);
		} else {
		    try {
			calculator.addnumber(Double.valueOf(expresionArray[i]));
			total = calculator.getTotal();
			System.out.println("SubTotal = " + total);
		    } catch (IllegalArgumentException e) {
			System.err.println("0 cant be the divisor in this ecuation");
		    }

		}
	    } else {
		if (!(i == expresionArray.length - 1))
		    System.out.println("Total = " + total);
		calculator.clear();
	    }
	}
	System.out.println("Total = " + total);
    }

}
