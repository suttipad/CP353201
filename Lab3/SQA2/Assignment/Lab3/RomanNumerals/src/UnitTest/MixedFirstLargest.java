package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.RomanNumerals;

class MixedFirstLargest {
	
	RomanNumerals rn = new RomanNumerals();

	@Test
	void TC29() {
		assertEquals(74, rn.convertRomanNumToInt("LXXIV"));   
	}
	
	@Test
	void TC30() {
		assertEquals(76, rn.convertRomanNumToInt("LXXVI"));   
	}
	
	@Test
	void TC31() {
		assertEquals(78, rn.convertRomanNumToInt("LXXVIII")); 
	}
	
	@Test
	void TC32() {
		assertEquals(84, rn.convertRomanNumToInt("LXXXIV"));
	}

	@Test
	void TC33() {
		assertEquals(855, rn.convertRomanNumToInt("DCCCLV"));
	}

}
