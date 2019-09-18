package s045;

public class Exercise {
	final static int GAP = 'a' - 'A';

	public static void main(String[] args) {
		exercise("Bob");
		System.out.println("toUpper(): " + toUpper("Bob"));
		System.out.println("toUpper2(): " + toUpper2("Bob"));
		System.out.println("toUpper3(): " + toUpper3("Bob"));
		
	}

	public static String toUpper(String s) {

		StringBuilder sb = new StringBuilder(s.length());

		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (current >= 'a' && current <= 'z') {
				// a.charAt(i)==a.charAt(i) + 32;
				sb.append((char) (current - GAP));
			} else {
				sb.append(current);
			}
		}

		return sb.toString();
	}

	public static String toUpper2(String s) {

		StringBuilder sb = new StringBuilder(s);

		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (current >= 'a' && current <= 'z') {
				// a.charAt(i)==a.charAt(i) + 32;
				sb.setCharAt(i, (char) (current - GAP));
			}
		}

		return sb.toString();
	}

	public static String toUpper3(String s) {
		StringBuilder sb=new StringBuilder(s.length());
		
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (current >= 'a' && current <= 'z') {
				sb.insert(i, (char)(current-GAP));
			} else {
				sb.insert(i, (char)(current));
	}
		}
		return sb.toString();
	}
	public static void exercise(String sample) {
		System.out.println(sample + " to uppercase and lowercase");
		for (int i = 0; i < sample.length(); i++) {
			char cur = sample.charAt(i);
			if (cur >= 'a' && cur <= 'z') {
				System.out.print((char) (cur - GAP));
			} else {
				System.out.print(cur);
			}
		}

		System.out.print(", ");

		for (int i = 0; i < sample.length(); i++) {
			char cur = sample.charAt(i);

			if (cur >= 'A' && cur <= 'Z') {
				System.out.print((char) (cur + GAP));
			} else {
				System.out.print(cur);
			}
		}
		System.out.println();

	}
}