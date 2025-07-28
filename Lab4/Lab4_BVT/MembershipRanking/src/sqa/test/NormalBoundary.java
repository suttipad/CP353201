package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import sqa.main.Ranking;

class NormalBoundary {
	
	Ranking rn = new Ranking();

	@ParameterizedTest
	@CsvSource({
	"0,		15, 500, Standard",
	"1,		15, 500, Standard",
	"50000,	15, 500, Standard",
	"99999,	15, 500, Standard",
	"100000,15, 500, Standard",
	
	"50000, 0, 	500, Standard",
	"50000, 1, 	500, Standard",
	"50000, 29, 500, Standard",
	"50000, 30, 500, Standard",
	
	"50000, 15, 0, Standard",
	"50000, 15, 1, Standard",
	"50000, 15, 999, Standard",
	"50000, 15, 1000, Standard",
	
	//Special Silver test
	"10000, 1, 100, Silver",
	
	//Special Platinum test
	"100000, 6, 1000, Platinum" 
	})
	void NormalBoundaryTest(int purchaseTotal, int frequency, int pointCollected, String result) {
		assertEquals(result, rn.CalculateMembershipRank(purchaseTotal, frequency, pointCollected));
	}

}