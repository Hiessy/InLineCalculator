package com.calculator.example.model.operaciones;

public final class OperationFactory {

    public Operation getOperacion(String signo) {

	switch (signo) {
	case "+":
	    return new Addition();
	case "/":
	    return new Division();
	case "*":
	    return new Multiplication();
	case "-":
	    return new Subtraction();
	case "=":
	    return new Equals();
	default:
	    return null;
	}

    }
}
