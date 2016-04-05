package com.calculator.example.controller;

import com.calculator.example.model.expression.ExpressionProcessor;

public abstract class App {

    public static void main(String[] args) {

	ExpressionProcessor procesador = new ExpressionProcessor();
	String expresion = "50 + -20 * 2 + CE - 5.00 * 8 / 2 =";
	procesador.calcular(expresion.split(" "));

    }
}
