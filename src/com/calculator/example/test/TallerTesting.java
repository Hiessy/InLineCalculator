package com.calculator.example.test;

import com.calculator.example.model.expression.ExpressionProcessor;

public class TallerTesting {

    public static void main(String[] args) {
	// contemplar parentesis

	ExpressionProcessor procesador = new ExpressionProcessor();
	String expresion = "999999 + - .3444 =";
	procesador.calcular(expresion.split(" "));

	

    }

 /*   public static double calcular(String[] args) {

	OperationFactory fabricaOperaciones = new OperationFactory();
	String operacion = "+";
	double numeroAnterior = 0.0;

	for (int i = 0; i < args.length; i++) {

	    if (!esFin(args[i])) {

		System.out.println(" procesando: " + args[i]);

		if (!esNumero(args[i])) {
		    operacion = args[i];
		} else {
		    try {
			numeroAnterior = fabricaOperaciones.getOperacion(operacion).calcular(numeroAnterior, Double.valueOf(args[i]));
			System.out.println(numeroAnterior);
		    } catch (IllegalArgumentException e) {
			System.err.println("El numero ingresado fue un 0, no se puede dividir por 0");
		    }

		}
	    }
	}
	return numeroAnterior;

    }

    private static boolean esNumero(char ch) {
	if (ch >= 48 && ch <= 57)
	    return true;
	return false;
    }

    private static boolean esSigno(char ch) {
	if ('+' == ch || '-' == ch)
	    return true;
	return false;
    }

    private static boolean esPunto(char ch) {
	if ('.' == ch) {
	    return true;
	}
	return false;
    }

    private static boolean esFin(String ch) {
	if ("=".equals(ch)) {
	    return true;
	}
	return false;
    }

    // TODO: compliance con lo que piden en taller
    public static boolean esNumero(String s, String s1) {
	boolean result = true;
	boolean tienePunto = true;

	if (s.length() == 0) {
	    result = false;
	}

	for (int i = 0; i < s.length(); i++) {
	    if (i == 0) {
		if (esSigno(s.charAt(i))) {
		    if (s.length() == 1) {
			result = false;
		    }
		} else if (!esNumero(s.charAt(i))) {
		    result = false;
		}
	    } else {
		if (esPunto(s.charAt(i))) {

		    if (!tienePunto) {
			result = false;
		    }
		    tienePunto = false;
		} else if (!esNumero(s.charAt(i))) {
		    result = false;
		}
	    }
	}
	return result;
    }

    public static boolean esNumero(String s) {
	boolean tienePunto = true;

	if (s.length() == 0) {
	    return false;
	}

	for (int i = 0; i < s.length(); i++) {
	    if (i == 0) {
		if (esSigno(s.charAt(i))) {
		    if (s.length() == 1) {
			return false;
		    }
		} else if (!esNumero(s.charAt(i))) {
		    return false;
		}
	    } else {
		if (esPunto(s.charAt(i))) {
		    if (!tienePunto) {
			return false;
		    }
		    tienePunto = false;
		} else if (!esNumero(s.charAt(i))) {
		    return false;
		}
	    }
	}
	return true;
    }*/

}