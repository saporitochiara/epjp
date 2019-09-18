package s045;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExerciseTest {
	
	@Test
	void ToUpperNull() {
		String result = Exercise.toUpper(null);
		
		assertNull(result);
	}
	
	@Test
	void ToUpperEmpty() {
		String result = Exercise.toUpper("");
		
		assertTrue(result.isEmpty());
	}
	
	@Test
	void ToUpperBob() {
		String result = Exercise.toUpper("Bob");
		
		assertEquals("BOB",result);
	}
}
