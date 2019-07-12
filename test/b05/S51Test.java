package b05;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class S51Test {
    private S51 sample;

    @BeforeEach
    public void init() {
        sample = new S51();
    }

    @Test
    public void negatePositive() {
        int value = 42;

        int result = sample.negate(value);

        assertThat(result, equalTo(-42));
    }
}
