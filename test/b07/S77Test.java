package b07;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.core.Is.is;
import org.junit.jupiter.api.Test;

class S77Test {
	@Test
	void negateException() {
		S77 sample = new S77();

		try {
			sample.negate(Integer.MIN_VALUE);
		} catch (IllegalArgumentException iae) {
			String message = iae.getMessage();
			assertThat(message, is("Can't negate MIN_VALUE"));
			return;
		}
		fail("An IllegalArgumentException was expected");
	}
}
