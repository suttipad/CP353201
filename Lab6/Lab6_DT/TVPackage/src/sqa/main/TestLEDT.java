package sqa.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestLEDT {

    @ParameterizedTest(name = "[{index}] S={0} P={1} F={2} OFF={3} LIVE={4} CON={5} → Expect={6}")
    @CsvFileSource(resources = "/LEDT_CSV.csv", numLinesToSkip = 1)
    void testPriceFromCsvFile(boolean isStandard, boolean isPremium, boolean isFamily,
                               boolean offline, boolean live, boolean contract,
                               double expected) {

        TVPlan.TVPackage selectedPackage = null;

        if (isStandard) selectedPackage = TVPlan.TVPackage.STANDARD;
        else if (isPremium) selectedPackage = TVPlan.TVPackage.PREMIUM;
        else if (isFamily) selectedPackage = TVPlan.TVPackage.FAMILY;

        TVPlan plan = new TVPlan(offline, live, contract);
        double actual = plan.pricePerMonth(selectedPackage);

        assertEquals(expected, actual, 0.01);
    }
}
