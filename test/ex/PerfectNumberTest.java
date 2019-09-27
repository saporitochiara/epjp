package ex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PerfectNumberTest {
	@Test
	void PerfNumbPER() {
		assertEquals(PerfectNumber.isPerfect(28), PerfectConst.PER);
	}

	@Test
	void PerfNumbDIF() {
		assertEquals(PerfectNumber.isPerfect(10), PerfectConst.DIF);
	}

	@Test
	void PerfNumbABB() {
		assertEquals(PerfectNumber.isPerfect(12), PerfectConst.ABB);
	}

	@Test
	void PerfNumbNeg() {
		int value = -3;
		assertThrows(IllegalArgumentException.class, () -> PerfectNumber.isPerfect(value));
	}

}
