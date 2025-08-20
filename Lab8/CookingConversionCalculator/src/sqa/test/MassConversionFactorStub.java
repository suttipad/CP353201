// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import sqa.main.MassConverter;

public class MassConversionFactorStub extends MassConverter {

    @Override
    public double getConversionFactor(String fromUnit, String toUnit) {
    	
        if (fromUnit.equals("cup") && toUnit.equals("gram")) {
            return 125.0;
            
        } else if (fromUnit.equals("tablespoon") && toUnit.equals("gram")) {
            return 8.0;
            
        } else if (fromUnit.equals("teaspoon") && toUnit.equals("gram")) {
            return 3.0;
            
        } else if (fromUnit.equals("oz") && toUnit.equals("gram")) {
            return 28.349;
            
        } else if (fromUnit.equals("pound") && toUnit.equals("kilogram")) {
            return 0.454;
            
        } else if (fromUnit.equals("gram") && toUnit.equals("oz")) {
            return 0.035;
            
        } else if (fromUnit.equals("kilogram") && toUnit.equals("pound")) {
            return 2.205;
            
        }
        return 0.0;
    }
}
