// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemperatureStubTest {

    private TemperatureConverterStub converter;
    
    @BeforeEach
    void setUp() {
        converter = new TemperatureConverterStub();
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
