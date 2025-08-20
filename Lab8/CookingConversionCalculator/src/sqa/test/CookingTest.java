// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CookingTest {

    private CookingStub converter;

    @BeforeEach
    void setUp() {
        converter = new CookingStub();
    }

    @Test
    void testTemperatureConversion() {
        double expected = 212; 
        double actual = converter.convert(100, "temperature", "celsiusfahrenheit", "fahrenheit");
        assertEquals(expected, actual);
    }

    @Test
    void testMassConversion() {
        double expected = 7; 
        double actual = converter.convert(200, "mass", "gram", "oz");
        assertEquals(expected, actual);
    }

    @Test
    void testLiquidConversion() {
        double expected = 500;
        double actual = converter.convert(250, "liquid", "cup", "ml");
        assertEquals(expected, actual);
    }

}
