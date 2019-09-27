package ex;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

class NumArmTest {
	@Test
	void ArmTestOne() {
		assertTrue(NumArm.isArmstrong(153));
	}

	@Test
	void ArmTestTwo() {
		assertFalse(NumArm.isArmstrong(15));
	}

	@Test
	void ArmTestThree() {
		assertTrue(NumArm.isArmstrong(8));
	}

	@Test
	void ArmTestFour() {
		int value = -7;
		IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () -> NumArm.isArmstrong(value));
		assertThat(exc.getMessage(), is("The number " + value + " is negative so is not an Armstrong number"));
	}
}
