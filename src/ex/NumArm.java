package ex;

public class NumArm {

	public static boolean isArmstrong(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("The number " + number + " is negative so is not an Armstrong number");
		}
		int count = 0;
		int sum = 0;
		int value = number;
		int val = number;
		while (value != 0) {
			value = value / 10;
			count++;
		}
		while (val != 0) {
			int cifra = val % 10;
			val = val / 10;
			sum += Math.pow(cifra, count);
		}
		if (sum == number) {
			return true;
		} else {
			return false;
		}
	}
}