package ex;

enum PerfectConst {
	ABB, DIF, PER
}

public class PerfectNumber {
	public static PerfectConst isPerfect(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("il numero è negativo");
		}
		int sum = 1;
		for (int i = 2; i <= (number / 2); i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (number == sum) {
			return PerfectConst.PER;
		} else if (number >= sum) {
			return PerfectConst.DIF;
		} else {
			return PerfectConst.ABB;
		}
	}

}
