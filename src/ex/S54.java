package ex;

public class S54 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		if (value == 0) {
			return "zero";
		} else if (value > 0) {
			return "positive";
		} else {
			return "negative";
		}
	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		String word = new String();
		switch (value) {
		case 0:
			word = "zero";
			break;
		case 1:
			word = "one";
			break;
		case 2:
			word = "two";
			break;
		case 3:
			word = "three";
			break;
		case 4:
			word = "four";
			break;
		case 5:
			word = "five";
			break;
		case 6:
			word = "six";
			break;
		case 7:
			word = "seven";
			break;
		case 8:
			word = "eight";
			break;
		case 9:
			word = "nine";
			break;
		default:
			word = "other";
			break;
		}
		return word;
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {
		if (percentile > 90) {
			return 'A';
		} else if (percentile > 80 && percentile <= 90) {
			return 'B';
		} else if (percentile > 70 && percentile <= 80) {
			return 'C';
		} else if (percentile > 60 && percentile <= 70) {
			return 'D';
		} else if (percentile > 50 && percentile <= 60) {
			return 'E';
		} else {
			return 'F';
		}
	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		if (year % 2 == 1 || year % 100 == 0 && year % 400 != 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isLeapYear2(int year) {
		if (year % 100 == 0 && year % 400 != 0) {
			return false;
		} else if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = { a, b, c };
		for (int i = 0; i < result.length - 1; i++) {
				if (result[i] >= result[i + 1]) {
					int max = result[i];
					result[i] = result[i + 1];
					result[i + 1] = max;
				}
			}
			return result;
		}
}
