package b07;

public class S77 {
	public int negate(int value) {
		if (value == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Can't negate MIN_VALUE");
		}
		return -value;
	}
}
