// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sqa.main.TemperatureConverter;

public class TemperatureTest {

    private TemperatureConverter converter;
    
    @BeforeEach
    void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    void testFahrenheitToCelsiusStub() {
    	double expect = 10;
        double actual = converter.convert(50, "fahrenheit", "celsius");
        assertEquals(expect, actual);
    }
    
    @Test
    void testCelsiusToFahrenheitStub() {
    	double expect = 50;
        double actual = converter.convert(100, "celsiusfahrenheit", "fahrenheit");
        assertEquals(expect, actual);
    }
    
}
