package s110b;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Abc {
	public static void main(String[] args) {
		String s = "chiara";
		System.out.println(s);
		System.out.println("Sorted char: " + achar(s));

	}

	public static TreeSet<Character> achar(String s) {
		List<Character> oneChar = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			oneChar.add(cur);

		}
		TreeSet<Character> sortedChar = new TreeSet<>(oneChar);
		return sortedChar;
	}

}