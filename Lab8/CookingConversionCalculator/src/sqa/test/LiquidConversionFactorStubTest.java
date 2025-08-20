// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LiquidConversionFactorStubTest {

    private LiquidConversionFactorStub converter;

    @BeforeEach
    void setUp() {
        converter = new LiquidConversionFactorStub();
    }

    @Test
    void testCupToMl() {
        double expected = 250.0;
        double actual = converter.getConversionFactor("cup", "ml");
        assertEquals(expected, actual);
    }

    @Test
    void testCupToOz() {
        double expected = 8.0;
        double actual = converter.getConversionFactor("cup", "oz");
        assertEquals(expected, actual);
    }

    @Test
    void testTablespoonToMl() {
        double expected = 15.0;
        double actual = converter.getConversionFactor("tablespoon", "ml");
        assertEquals(expected, actual);
    }

    @Test
    void testTeaspoonToMl() {
        double expected = 5.0; 
        double actual = converter.getConversionFactor("teaspoon", "ml");
        assertEquals(expected, actual);
    }

    @Test
    void testOzToMl() {
        double expected = 29.574; 
        double actual = converter.getConversionFactor("oz", "ml");
        assertEquals(expected, actual);
    }

    @Test
    void testPintToMl() {
        double expected = 473.176;
        double actual = converter.getConversionFactor("pint", "ml");
        assertEquals(expected, actual);
    }

    @Test
    void testQuartToLiter() {
        double expected = 0.946;
        double actual = converter.getConversionFactor("quart", "liter");
        assertEquals(expected, actual);
    }

    @Test
    void testMlToOz() {
        double expected = 0.034; 
        double actual = converter.getConversionFactor("ml", "oz");
        assertEquals(expected, actual);
    }

    @Test
    void testLiterToPint() {
        double expected = 2.113;
        double actual = converter.getConversionFactor("liter", "pint");
        assertEquals(expected, actual);
    }

    @Test
    void testLiterToQuart() {
        double expected = 1.057; 
        double actual = converter.getConversionFactor("liter", "quart");
        assertEquals(expected, actual);
    }

    @Test
    void testLiterToGallon() {
        double expected = 0.264; 
        double actual = converter.getConversionFactor("liter", "gallon");
        assertEquals(expected, actual);
    }

    @Test
    void testUnsupportedConversion() {
        double expected = 0.0; 
        double actual = converter.getConversionFactor("cup", "pint");
        assertEquals(expected, actual);
    }
}
