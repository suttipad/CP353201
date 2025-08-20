// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MassConversionFactorStubTest {

    private MassConversionFactorStub converter;

    @BeforeEach
    void setUp() {
        converter = new MassConversionFactorStub();
    }

    @Test
    void testCupToGram() {
        double expected = 125.0; 
        double actual = converter.getConversionFactor("cup", "gram");
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void testTablespoonToGram() {
        double expected = 8.0;  
        double actual = converter.getConversionFactor("tablespoon", "gram");
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void testTeaspoonToGram() {
        double expected = 3.0; 
        double actual = converter.getConversionFactor("teaspoon", "gram");
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void testOzToGram() {
        double expected = 28.349; 
        double actual = converter.getConversionFactor("oz", "gram");
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void testPoundToKilogram() {
        double expected = 0.454;  
        double actual = converter.getConversionFactor("pound", "kilogram");
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void testGramToOz() {
        double expected = 0.035;  
        double actual = converter.getConversionFactor("gram", "oz");
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void testKilogramToPound() {
        double expected = 2.205; 
        double actual = converter.getConversionFactor("kilogram", "pound");
        assertEquals(expected, actual, 0.001);
    }

  
}
