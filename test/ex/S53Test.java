package ex;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S53Test {

    @Test
    void checkSignPositive() {
        String actual = S53.checkSign(42);

        assertThat(actual, is("positive"));
    }

    @Test
    void checkSignNegative() {
        String actual = S53.checkSign(-42);

        assertThat(actual, is("negative"));
    }

    @Test
    void checkSignZero() {
        String actual = S53.checkSign(0);

        assertThat(actual, is("zero"));
    }

    @Test
    void isOddTrue() {
        boolean actual = S53.isOdd(19);

        assertThat(actual, is(true));
    }

    @Test
    void isOddFalse() {
        boolean actual = S53.isOdd(-12);

        assertThat(actual, is(false));
    }

    @Test
    void asWordZero() {
        String actual = S53.asWord(0);

        assertThat(actual, is("zero"));
    }

    @Test
    void asWordOther() {
        String actual = S53.asWord(42);

        assertThat(actual, is("other"));
    }
}
