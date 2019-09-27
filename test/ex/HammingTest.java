package ex;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class HammingTest {
	@Test
	void HammingTestEquals() {
		int actual = Hamming.hammingDistance("ataaata", "ataaata");

		assertEquals(actual, 0);

	}

	@Test
	void HammingTestOne() {
		int actual = Hamming.hammingDistance("ataaaaa", "atatata");

		assertEquals(actual, 2);

	}

	@Test
	void HammingTestNull() {
		String s = "ataaaaa";
		String t = null;
		assertThrows(NullPointerException.class, () -> Hamming.hammingDistance(s, t));

	}

	@Test
	void HammingTestDiff() {
		String s = "ataaaaa";
		String t = "ata";
		assertThrows(IllegalArgumentException.class, () -> Hamming.hammingDistance(s, t));
	}

}
