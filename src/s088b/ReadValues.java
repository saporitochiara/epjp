package s088b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadValues {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("/tmp/values.txt");

		try (Scanner scanner = new Scanner(f)) {
			while (scanner.hasNext()) {
				if (scanner.hasNextInt()) {
					int value = scanner.nextInt();
					if (value == 0) {
						System.out.println("Fine");
					} else if (value % 2 != 0) {
						System.out.println("Il numero " + value + " è dispari");
					} else {
						System.out.println("Il numero " + value + " è pari");
					}
				} else {
					System.out.println("Bad input");
				}
			}
		}
	}
}