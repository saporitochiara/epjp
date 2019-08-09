package b07;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

// Run as test for Test runner JUnit 4!
public class S78Test {
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void negateMinInt() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Can't negate MIN_VALUE");

		S77 sample = new S77();
		sample.negate(Integer.MIN_VALUE);
	}
}
