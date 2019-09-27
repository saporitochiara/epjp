package ex;

import java.util.HashSet;

public class Pangram {
	public static boolean isPangram(String s) {
		s = s.toLowerCase();
		int size = 0;
		HashSet<Character> pan = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				char cur = s.charAt(i);
				pan.add(cur);
			}
		}
		size = pan.size();
		if (size == 26) {
			return true;
		} else {
			return false;
		}

	}
}
