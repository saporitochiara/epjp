package th.s050;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    public void negatePositive() {
        Sample sample = new Sample();
        int value = 42;

        int result = sample.negate(value);

        assertThat(result, equalTo(-42));
    }
}
