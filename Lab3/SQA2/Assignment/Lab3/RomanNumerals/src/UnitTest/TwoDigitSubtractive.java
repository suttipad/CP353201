package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.RomanNumerals;

class TwoDigitSubtractive {

	RomanNumerals rn = new RomanNumerals();
	
	@Test
	void TC06() {
		assertEquals(4, rn.convertRomanNumToInt("IV"));     
	}
	
	@Test
	void TC07() {
		assertEquals(9, rn.convertRomanNumToInt("IX"));  
	}
	
	@Test
	void TC08() {
		assertEquals(40, rn.convertRomanNumToInt("XL"));     
	}
	
	@Test
	void TC09() {
		assertEquals(400, rn.convertRomanNumToInt("CD"));    
	}
	
	@Test
	void TC10() {
		assertEquals(900, rn.convertRomanNumToInt("CM"));   
	}

}
