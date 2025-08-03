package sqa.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestEEDT {

	@ParameterizedTest(name = "[{index}] Package={0}, AddOn={1}, Contract={2} → Expect={3}")
	@CsvFileSource(resources = "/EEDT_CSV.csv", numLinesToSkip = 1)
	void testPriceWithCondition(String pkg, String addon, String contract, double expected) {
		
	    boolean isStandard = "P1".equals(pkg);
	    boolean isPremium = "P2".equals(pkg);
	    boolean isFamily = "P3".equals(pkg);

	    TVPlan.TVPackage selectedPackage = null;
	    
	    if (isStandard) selectedPackage = TVPlan.TVPackage.STANDARD;
	    else if (isPremium) selectedPackage = TVPlan.TVPackage.PREMIUM;
	    else if (isFamily) selectedPackage = TVPlan.TVPackage.FAMILY;


	    boolean offline = "A1".equals(addon) || "A3".equals(addon);
	    boolean live = "A2".equals(addon) || "A3".equals(addon);

	    boolean hasContract = "C1".equals(contract);

	    TVPlan plan = new TVPlan(offline, live, hasContract);
	    double actual = plan.pricePerMonth(selectedPackage);

	    assertEquals(expected, actual, 0.01);
	}
}
