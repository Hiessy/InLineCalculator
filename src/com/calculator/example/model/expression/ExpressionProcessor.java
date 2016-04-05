package com.calculator.example.model.expression;

import com.calculator.example.model.Calculator;

public class ExpressionProcessor {

	private Calculator calculator = Calculator.getInstance();

	public void calcular(String[] expresionArray) {
		Double total = 0.0;
		boolean parenthesIsOpen = false;

		for (int i = 0; i < expresionArray.length; i++) {

			// if not "=" expresion process
			if (!ExpressionValidator.isEquals(expresionArray[i])) {

				// If is clear expresion clear and continue
				if (ExpressionValidator.isClear(expresionArray[i])) {
					calculator.clear();
					total = calculator.getTotal();
					System.out.println("CE");
					continue;
				}

				if (ExpressionValidator.isParenthesisOpen(expresionArray[i])) {
					// parenthesIsOpen = true;
					calculator.addTotal(total);
					if(ExpressionValidator.isOperation(expresionArray[i - 1]))
						calculator.addSign(calculator.getOperation());
					else
						calculator.addSign("*");
					calculator.clear();
					continue;
				}
				// TODO should contemplate the posibilty of multiple parenthiss
				if (ExpressionValidator.isParenthesisClose(expresionArray[i])) {
					calculator.addOperation(calculator.removeSign());
					calculator.addNumberEndParenthesis(calculator.removeTotal());
					total = calculator.getTotal();
					System.out.println("SubTotal = " + total);
					continue;
				}

				if (!ExpressionValidator.isNumber(expresionArray[i])) {
					calculator.addOperation(expresionArray[i]);
				} else {
					try {
						calculator.addNumber(Double.valueOf(expresionArray[i]));
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
