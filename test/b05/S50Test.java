package b05;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S50Test {
    @Test
    public void negatePositive() {
        S50 sample = new S50();
        int value = 42;

        int result = sample.negate(value);

        assertThat(result, equalTo(-42));
    }
}
