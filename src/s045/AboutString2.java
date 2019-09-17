package s045;

public class AboutString2 {
	public static void main(String[] args) {
		int GAP = 'a' - 'A';
		String a = "BoB";

		for (int i = 0; i < a.length(); i++) {
			char current = a.charAt(i);

			if (current >= 'A' && current <= 'Z') {
				// a.charAt(i)==a.charAt(i) + 32;
				System.out.print((char) (current + GAP));
			} else {
				System.out.print(current);
			}
		}
		System.out.println();
		for (int i = 0; i < a.length(); i++) {
			char current = a.charAt(i);

			if (current >= 'a' && current <= 'z') {
				// a.charAt(i)==a.charAt(i) + 32;
				System.out.print((char) (current - GAP));
			} else {
				System.out.print(current);
			}
		}
		System.out.println();
	}

}
