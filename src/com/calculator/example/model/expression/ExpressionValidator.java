package com.calculator.example.model.expression;

public class ExpressionValidator {

	// TODO contemplar parentesis
	private static boolean isNumber(char ch) {
		if (ch >= 48 && ch <= 57)
			return true;
		return false;
	}

	private static boolean isSign(char ch) {
		if ('+' == ch || '-' == ch)
			return true;
		return false;
	}

	private static boolean isDot(char ch) {
		if ('.' == ch) {
			return true;
		}
		return false;
	}

	public static boolean isEquals(String ch) {
		if ("=".equals(ch)) {
			return true;
		}
		return false;
	}
	
	public static boolean isParenthesisOpen(String ch) {
		if ("(".equals(ch)) {
			return true;
		}
		return false;
	}
	
	public static boolean isParenthesisClose(String ch) {
		if (")".equals(ch)) {
			return true;
		}
		return false;
	}

	public static boolean isClear(String ch) {
		if ("CE".toUpperCase().equals(ch)) {
			return true;
		}
		return false;
	}
	
	public static boolean isOperation(String ch) {
		if ("/".equals(ch) || "*".equals(ch) || "-".equals(ch) || "+".equals(ch)) {
			return true;
		}
		return false;
	}

	// TODO: compliance con lo que piden en taller
	public static boolean isNumber(String s, String s1) {
		boolean result = true;
		boolean hasPeriod = true;

		if (s.length() == 0) {
			result = false;
		}

		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				if (isSign(s.charAt(i))) {
					if (s.length() == 1) {
						result = false;
					}
				} else if (!isNumber(s.charAt(i))) {
					result = false;
				}
			} else {
				if (isDot(s.charAt(i))) {

					if (!hasPeriod) {
						result = false;
					}
					hasPeriod = false;
				} else if (!isNumber(s.charAt(i))) {
					result = false;
				}
			}
		}
		return result;
	}

	// TODO could be better improved, need a more performant way of implementing
	// this.
	public static boolean isNumber(String s) {
		boolean hasPeriod = false;

		if (s.length() == 0) {
			return false;
		}

		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				if (isSign(s.charAt(i))) {
					if (s.length() == 1) {
						return false;
					}
				} else if (isDot(s.charAt(i))) {
					if (hasPeriod) {
						return false;
					}
					hasPeriod = true;
				} else if (!isNumber(s.charAt(i))) {
					return false;
				}
			} else if (isDot(s.charAt(i))) {
				if (hasPeriod) {
					return false;
				}
				hasPeriod = true;
			} else if (!isNumber(s.charAt(i))) {
				return false;
			}
		}

		return true;
	}
	
	

}
