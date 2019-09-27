package ex;

public class Hamming {
	public static void main(String[] args) {

		System.out.println(hammingDistance("cadsd", "cffff"));
	}

	public static int hammingDistance(String s, String t) {
		if (s.isEmpty() || t.isEmpty()) {
			throw new NullPointerException("One of the strings is null");
		}
		if (s.length() != t.length()) {
			throw new IllegalArgumentException("Strings have not the same length");
		}
		int dist = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != t.charAt(i))
				dist++;
		}
		return dist;
	}

}
