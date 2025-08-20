// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import sqa.main.CookingConversionCalculator;

public class CookingStub extends CookingConversionCalculator {

    @Override
    public double convert(double value, String choice, String fromUnit, String toUnit) {
        switch (choice) {
            case "temperature":
                return 212.0;   
            case "mass":
                return 7.0; 
            case "liquid":
                return 500.0; 
            default:
                return 0.0;   
        }
    }
}
