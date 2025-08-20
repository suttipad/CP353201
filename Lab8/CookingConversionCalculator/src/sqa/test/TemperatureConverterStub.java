// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import sqa.main.TemperatureConverter;

public class TemperatureConverterStub extends TemperatureConverter {

    @Override
    public double convert(double tempValue, String fromUnit, String toUnit) {
        // Fixed, predictable values for testing
        if (fromUnit.equals("fahrenheit") && toUnit.equals("celsius")) {
            return 10.0; 
            
        } 
        else if (fromUnit.equals("celsiusfahrenheit") && toUnit.equals("fahrenheit")) {
            return 50.0;
            
        } 
            return 0.0; 
   
    }
}
