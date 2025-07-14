package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.RomanNumerals;

class MultipleFirstLarger {
	
	RomanNumerals rn = new RomanNumerals();

	@Test
	void TC24() {
		assertEquals(26, rn.convertRomanNumToInt("XXVI"));  
	}
	
	@Test
	void TC25() {
		assertEquals(27, rn.convertRomanNumToInt("XXVII"));   
	}
	
	@Test
	void TC26() {
		assertEquals(67, rn.convertRomanNumToInt("LXVII")); 
	}
	
	@Test
	void TC27() {
		assertEquals(206, rn.convertRomanNumToInt("CCVI")); 
	}

	@Test
	void TC28() {
		assertEquals(2400, rn.convertRomanNumToInt("MMCD")); 
	}

}
