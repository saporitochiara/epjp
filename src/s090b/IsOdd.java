package s090b;

import java.util.Scanner;

public class IsOdd {
	public static void main(String[] args) {
		System.out.println("Inserisci un numero");

		// try-with-resources
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNextInt()) {
				int value = scanner.nextInt();
				if (value == 0) {
					System.out.println("Fine");
				} else if (value % 2 != 0) {
					System.out.println("Il numero è dispari");
				} else {
					System.out.println("Il numero è pari");
				}
			}
			System.out.println("Bad input");
		}
	}
}
