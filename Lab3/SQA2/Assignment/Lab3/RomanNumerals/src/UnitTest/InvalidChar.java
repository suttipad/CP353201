package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.RomanNumerals;

class InvalidChar {
	
	RomanNumerals rn = new RomanNumerals();

	@Test
	void TC34() {
		assertThrows(NullPointerException.class, () -> rn.convertRomanNumToInt("J"));   
	}
	
	@Test
	void TC35() {
		assertThrows(NullPointerException.class, () -> rn.convertRomanNumToInt("K"));   
	}
	
}
