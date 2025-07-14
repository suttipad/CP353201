package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.RomanNumerals;

class TwoSameDigits {

	RomanNumerals rn = new RomanNumerals();
	
	@Test
	void TC16() {
		assertEquals(2, rn.convertRomanNumToInt("II"));  
	}
	
	@Test
	void TC17() {
		assertEquals(20, rn.convertRomanNumToInt("XX"));   
	}
	
	@Test
	void TC18() {
		assertEquals(200, rn.convertRomanNumToInt("CC")); 
	}
	
	@Test
	void TC19() {
		assertEquals(2000, rn.convertRomanNumToInt("MM")); 
	}
	

}
