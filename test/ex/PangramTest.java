package ex;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PangramTest {

	@Test
	void PanTestFalse() {
		String actual = "abababab";
		assertFalse(Pangram.isPangram(actual));
	}

	@Test
	void PanTestTrue() {
		String actual = "The quick brown fox jumps over the lazy dog";
		assertTrue(Pangram.isPangram(actual));
	}

	@Test
	void PanTestTrueExtra() {
		String actual = "The quick brown fox jumps over he lazy dog";
		assertTrue(Pangram.isPangram(actual));
	}
}
