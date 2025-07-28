package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import sqa.main.Income;

public class StrongRobustEquivalenceClassTesting {

    @ParameterizedTest
    @CsvFileSource(resources = "/StrongRobustEC.csv", numLinesToSkip = 1)
    void testCalculateIncome(int impeller, int motor, int cover, double expected) {
        Income incomeCalculator = new Income();
        double actual = incomeCalculator.calculateIncome(impeller, motor, cover);
        assertEquals(expected, actual, 0.001);
    }
}
