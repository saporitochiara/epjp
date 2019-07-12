package th.s051;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import b05.s051.Sample;

class SampleTest {
    private Sample sample;

    @BeforeEach
    public void init() {
        sample = new Sample();
    }

    @Test
    public void negatePositive() {
        int value = 42;

        int result = sample.negate(value);

        assertThat(result, equalTo(-42));
    }
}
