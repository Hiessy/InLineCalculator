package com.calculator.example.controller;

public abstract class App {

    public static void main(String[] args) {

	ExpressionProcessor procesador = new ExpressionProcessor();
	String expresion = "50 + -20 * 2 - 5.00 * 8 / 2 =";
	procesador.calcular(expresion.split(" "));

    }
}
