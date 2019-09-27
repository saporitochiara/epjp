package s78;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import s077.Simple;

// Run as test for Test runner JUnit 4!
public class SimpleTest {
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void negateMinInt() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Can't negate MIN_VALUE");

		Simple sample = new Simple(); //TODO
//		sample.negate(Integer.MIN_VALUE);
	}
}
