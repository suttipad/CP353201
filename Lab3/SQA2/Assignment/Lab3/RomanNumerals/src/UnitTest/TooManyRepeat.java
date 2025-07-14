package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.RomanNumerals;

class TooManyRepeat {
	
	RomanNumerals rn = new RomanNumerals();

	@Test
	void TC39() {
		assertNotEquals(4, rn.convertRomanNumToInt("IIII")); 
	}
	
	@Test
	void TC40() {
		assertNotEquals(40, rn.convertRomanNumToInt("XXXX"));
	}

	@Test
	void TC41() {
		assertNotEquals(400, rn.convertRomanNumToInt("CCCC"));
	}
	
	@Test
	void TC42() {
		assertNotEquals(4000, rn.convertRomanNumToInt("MMMM")); 
	}

}
