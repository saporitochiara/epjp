package s79;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.*;
import org.junit.jupiter.api.Test;

public class SimpleTest {
	@Test
	public void negateMinInt() {
		s077.Simple sample = new s077.Simple();

	    IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, //
	            () -> sample.negate(Integer.MIN_VALUE));
	    assertThat(exc.getMessage(), is("Can't negate MIN_VALUE"));
	}
}
