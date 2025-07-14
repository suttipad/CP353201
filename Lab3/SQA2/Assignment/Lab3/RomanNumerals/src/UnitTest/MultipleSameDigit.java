package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.RomanNumerals;

class MultipleSameDigit {
	
	RomanNumerals rn = new RomanNumerals();

	@Test
	void TC20() {
		assertEquals(3, rn.convertRomanNumToInt("III"));  
	}
	
	@Test
	void TC21() {
		assertEquals(30, rn.convertRomanNumToInt("XXX"));   
	}
	
	@Test
	void TC22() {
		assertEquals(300, rn.convertRomanNumToInt("CCC")); 
	}
	
	@Test
	void TC23() {
		assertEquals(3000, rn.convertRomanNumToInt("MMM")); 
	}

}
