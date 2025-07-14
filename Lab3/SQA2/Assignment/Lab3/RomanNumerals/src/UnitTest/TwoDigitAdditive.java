package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.RomanNumerals;

class TwoDigitAdditive {
	
	RomanNumerals rn = new RomanNumerals();

	@Test
	void TC11() {
		assertEquals(6, rn.convertRomanNumToInt("VI"));   
	}
	
	@Test
	void TC12() {
		assertEquals(11, rn.convertRomanNumToInt("XI"));   
	}
	
	@Test
	void TC13() {
		assertEquals(60, rn.convertRomanNumToInt("LX")); 
	}
	
	@Test
	void TC14() {
		assertEquals(600, rn.convertRomanNumToInt("DC")); 
	}
	
	@Test
	void TC15() {
		assertEquals(1500, rn.convertRomanNumToInt("MD"));  
	}

}
