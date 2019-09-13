package s77;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.core.Is.is;
import org.junit.jupiter.api.Test;

import s077.Simple;

class SimpleTest {
	@Test
	void negateException() {
		Simple simple = new Simple();

		try {
			simple.negate(Integer.MIN_VALUE);
		} catch (IllegalArgumentException iae) {
			String message = iae.getMessage();
			assertThat(message, is("Can't negate MIN_VALUE"));
			return;
		}
		fail("An IllegalArgumentException was expected");
	}
}
