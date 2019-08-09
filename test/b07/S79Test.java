package b07;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.jupiter.api.Test;

public class S79Test {
	@Test
	public void negateMinInt() {
		S77 sample = new S77();

	    IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, //
	            () -> sample.negate(Integer.MIN_VALUE));
	    assertThat(exc.getMessage(), is("Can't negate MIN_VALUE"));
	}
}
