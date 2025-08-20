// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MassConverterTest {

    private MassConverterStub converter;

    @BeforeEach
    void setUp() {
        converter = new MassConverterStub();
    }

    @Test
    void testCupToGram() {
        double expected = 250.0;
        double actual = converter.convert(2, "cup", "gram");
        assertEquals(expected, actual);
    }

    @Test
    void testTablespoonToGram() {
        double expected = 24.0;
        double actual = converter.convert(3, "tablespoon", "gram");
        assertEquals(expected, actual);
    }

    @Test
    void testTeaspoonToGram() {
        double expected = 12.0; 
        double actual = converter.convert(4, "teaspoon", "gram");
        assertEquals(expected, actual);
    }

    @Test
    void testOzToGram() {
        double expected = 85.047;
        double actual = converter.convert(3, "oz", "gram");
        assertEquals(expected, actual);
    }

    @Test
    void testPoundToKilogram() {
        double expected = 2.27; 
        double actual = converter.convert(5, "pound", "kilogram");
        assertEquals(expected, actual);
    }

    @Test
    void testGramToOz() {
        double expected = 0.35; 
        double actual = converter.convert(10, "gram", "oz");
        assertEquals(expected, actual);
    }

    @Test
    void testKilogramToPound() {
        double expected = 15.435; 
        double actual = converter.convert(7, "kilogram", "pound");
        assertEquals(expected, actual);
    }

}
