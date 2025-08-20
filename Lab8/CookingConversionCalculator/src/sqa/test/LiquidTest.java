// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sqa.main.LiquidVolumeConverter;

public class LiquidTest {

    private LiquidVolumeConverter converter;

    @BeforeEach
    void setUp() {
        converter = new LiquidVolumeConverter();
    }

    @Test
    void testCupToMl() {
        double expected = 500.0;
        double actual = converter.convert(2, "cup", "ml");
        assertEquals(expected, actual);
    }

    @Test
    void testCupToOz() {
        double expected = 24.0;
        double actual = converter.convert(3, "cup", "oz");
        assertEquals(expected, actual);
    }

    @Test
    void testTablespoonToMl() {
        double expected = 60.0;
        double actual = converter.convert(4, "tablespoon", "ml");
        assertEquals(expected, actual);
    }

    @Test
    void testTeaspoonToMl() {
        double expected = 25.0;
        double actual = converter.convert(5, "teaspoon", "ml");
        assertEquals(expected, actual);
    }

    @Test
    void testOzToMl() {
        double expected = 59.148; 
        double actual = converter.convert(2, "oz", "ml");
        assertEquals(expected, actual);
    }

    @Test
    void testPintToMl() {
        double expected = 473.176; 
        double actual = converter.convert(1, "pint", "ml");
        assertEquals(expected, actual);
    }

    @Test
    void testQuartToLiter() {
        double expected = 1.892; 
        double actual = converter.convert(2, "quart", "liter");
        assertEquals(expected, actual);
    }

    @Test
    void testMlToOz() {
        double expected = 3.4; 
        double actual = converter.convert(100, "ml", "oz");
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void testLiterToPint() {
        double expected = 6.339; 
        double actual = converter.convert(3, "liter", "pint");
        assertEquals(expected, actual);
    }

    @Test
    void testLiterToQuart() {
        double expected = 2.114;
        double actual = converter.convert(2, "liter", "quart");
        assertEquals(expected, actual);
    }

    @Test
    void testLiterToGallon() {
        double expected = 1.056; 
        double actual = converter.convert(4, "liter", "gallon");
        assertEquals(expected, actual);
    }

 
}
