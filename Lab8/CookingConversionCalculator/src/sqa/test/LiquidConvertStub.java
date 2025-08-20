// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import sqa.main.LiquidVolumeConverter;

public class LiquidConvertStub extends LiquidVolumeConverter {

    @Override
    public double convert(double liquidValue, String fromUnit, String toUnit) {
        if (fromUnit.equals("cup") && toUnit.equals("ml")) {
            return 500.0;
            
        } 
        else if (fromUnit.equals("cup") && toUnit.equals("oz")) {
            return 24.0;
            
        } 
        else if (fromUnit.equals("tablespoon") && toUnit.equals("ml")) {
            return 60.0;
            
        } 
        else if (fromUnit.equals("teaspoon") && toUnit.equals("ml")) {
            return 25.0;
            
        } 
        else if (fromUnit.equals("oz") && toUnit.equals("ml")) {
            return 59.148;
            
        } 
        else if (fromUnit.equals("pint") && toUnit.equals("ml")) {
            return 473.176;
            
        } 
        else if (fromUnit.equals("quart") && toUnit.equals("liter")) {
            return 1.892; 
            
        } 
        else if (fromUnit.equals("ml") && toUnit.equals("oz")) {
            return 3.4; 
            
        } 
        else if (fromUnit.equals("liter") && toUnit.equals("pint")) {
            return 6.339; 
            
        } 
        else if (fromUnit.equals("liter") && toUnit.equals("quart")) {
            return 2.114;
            
        } 
        else if (fromUnit.equals("liter") && toUnit.equals("gallon")) {
            return 1.056;
        }

        return 0.0; 
    }
}
