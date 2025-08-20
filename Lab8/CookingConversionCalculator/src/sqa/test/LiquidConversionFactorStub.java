// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import sqa.main.LiquidVolumeConverter;

public class LiquidConversionFactorStub extends LiquidVolumeConverter {

    @Override
    public double getConversionFactor(String fromUnit, String toUnit) {

        if (fromUnit.equals("cup") && toUnit.equals("ml")) {
            return 250.0; 
            
        } 
        else if (fromUnit.equals("cup") && toUnit.equals("oz")) {
            return 8.0;
            
        } 
        else if (fromUnit.equals("tablespoon") && toUnit.equals("ml")) {
            return 15.0;
            
        } 
        else if (fromUnit.equals("teaspoon") && toUnit.equals("ml")) {
            return 5.0;
            
        } 
        else if (fromUnit.equals("oz") && toUnit.equals("ml")) {
            return 29.574;
            
        } 
        else if (fromUnit.equals("pint") && toUnit.equals("ml")) {
            return 473.176;
            
        } 
        else if (fromUnit.equals("quart") && toUnit.equals("liter")) {
            return 0.946;
            
        } 
        else if (fromUnit.equals("ml") && toUnit.equals("oz")) {
            return 0.034;
            
        } 
        else if (fromUnit.equals("liter") && toUnit.equals("pint")) {
            return 2.113;
            
        } 
        else if (fromUnit.equals("liter") && toUnit.equals("quart")) {
            return 1.057;
            
        } 
        else if (fromUnit.equals("liter") && toUnit.equals("gallon")) {
            return  0.264;
        }

        return 0.0;
    }
}
