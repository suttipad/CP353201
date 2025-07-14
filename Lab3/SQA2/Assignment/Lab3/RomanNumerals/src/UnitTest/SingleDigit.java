package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.RomanNumerals;

class SingleDigit {
	
	 RomanNumerals rn = new RomanNumerals();

	@Test
	void TC01() {
		assertEquals(1, rn.convertRomanNumToInt("I"));   
	}
	
	@Test
	void TC02() {
		assertEquals(5, rn.convertRomanNumToInt("V")); 
	}
	
	@Test
	void TC03() {
		assertEquals(50, rn.convertRomanNumToInt("L"));     
	}
	
	@Test
	void TC04() {
		assertEquals(500, rn.convertRomanNumToInt("D"));   
	}
	
	@Test
	void TC05() {
		assertEquals(1000, rn.convertRomanNumToInt("M"));   
	}

}
