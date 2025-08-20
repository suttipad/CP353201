// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import sqa.main.MassConverter;

public class MassConverterStub extends MassConverter {

    @Override
    public double convert(double massValue, String fromUnit, String toUnit) {

        if (fromUnit.equals("cup") && toUnit.equals("gram")) {
            return 250.0; 
            
        } 
        else if (fromUnit.equals("tablespoon") && toUnit.equals("gram")) {
            return 24.0; 
            
        } 
        else if (fromUnit.equals("teaspoon") && toUnit.equals("gram")) {
            return 12.0; 
            
        } 
        else if (fromUnit.equals("oz") && toUnit.equals("gram")) {
            return 85.047; 
            
        } 
        else if (fromUnit.equals("pound") && toUnit.equals("kilogram")) {
            return 2.27; 
            
        } 
        else if (fromUnit.equals("gram") && toUnit.equals("oz")) {
            return 0.35; 
            
        } 
        else if (fromUnit.equals("kilogram") && toUnit.equals("pound")) {
            return 15.435; 
            
        } 
  
            return 0.0; 
        
    }
}
