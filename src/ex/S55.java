package ex;

public class S55 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		long sum = 0;
		if (last < first) {
			return 0;
		} else {
			for (int i = first; i <= last; i++) {
				sum += i;
			}
			return sum;
		}
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		long sum = 0;
		if (last < first) {
			return 0;
		} else if (first % 2 == 0) {
			for (int i = first; i <= last; i += 2) {
				sum += i;
			}
			return sum;
		} else {
			for (int i = first + 1; i <= last; i += 2) {
				sum += i;
			}
			return sum;
		}
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		if (value == 0) {
			return 1;
		} else if (value < 0) {
			return 0;
		} else {
			long factorial = value;
			for (int i = value - 1; i > 0; i--) {
				factorial *= i;
			}
			return factorial;
		}
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		if (value == 0) {
			return 0;
		} else if (value == 1) {
			return 1;
		} else {
			long Fprev = 0;
			long Fnext = 1;
			long fib = 0;
			for (int i = 2; i <= value; i++) {
				fib = Fprev + Fnext;
				Fprev = Fnext;
				Fnext = fib;
			}
			return fib;
		}
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value + 1][value + 1];
		for (int i = 0; i <= value; i++) {
			for (int j = 0; j <= value; j++) {
				result[i][j] = i * j;
			}
		}
		return result;
	}
}
