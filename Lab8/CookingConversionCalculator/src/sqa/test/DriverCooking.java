// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import sqa.main.CookingConversionCalculator;


public class DriverCooking {


    public static void main(String[] args) {

        double originalValue = 10.0;
        double convertedValue = 0.0; 
        String choice = "liquid";   
        String from = "teaspoon";
        String to = "ml";

        CookingConversionCalculator converter = new CookingConversionCalculator();

        // Liquid
        convertedValue = converter.convert(originalValue, choice, from, to);
        System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);

        // Mass
        choice = "mass";
        from = "oz";
        to = "gram";
        convertedValue = converter.convert(originalValue, choice, from, to);
        System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);

        // Temperature
        choice = "temperature";
        from = "celsiusfahrenheit";
        to = "fahrenheit";
        convertedValue = converter.convert(originalValue, choice, from, to);
        System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);
    }
}
