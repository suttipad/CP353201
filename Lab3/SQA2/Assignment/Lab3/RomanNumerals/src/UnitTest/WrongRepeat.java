package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.RomanNumerals;

class WrongRepeat {

	RomanNumerals rn = new RomanNumerals();
	
	@Test
	void TC36() {
		assertNotEquals(10, rn.convertRomanNumToInt("VV"));  
	}
	
	@Test
	void TC37() {
		assertNotEquals(100, rn.convertRomanNumToInt("LL")); 
	}

	@Test
	void TC38() {
		assertNotEquals(1000, rn.convertRomanNumToInt("DD")); 
	}
}
