// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import sqa.main.TemperatureConverter;

public class DriverTemperature {

    public static void main(String[] args) {

        double originalValue = 100.0;
        double convertedValue = 0.0;
        String from = "celsiusfahrenheit";
        String to = "fahrenheit";

        TemperatureConverter converter = new TemperatureConverter();

        // celsiusfahrenheit to fahrenheit
        convertedValue = converter.convert(originalValue, from, to);
        System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);

        // Fahrenheit to Celsius
        originalValue = 212.0;
        from = "fahrenheit";
        to = "celsius";
        convertedValue = converter.convert(originalValue, from, to);
        System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);
    }
}
