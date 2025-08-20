// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import sqa.main.MassConverter;

public class DriverMass {

    public static void main(String[] args) {

        double originalValue = 10.0;
        double convertedValue = 0.0;
        String from = "oz";
        String to = "gram";

        MassConverter converter = new MassConverter();

        // oz to gram
        convertedValue = converter.convert(originalValue, from, to);
        System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);

        // kilogram to pound
        originalValue = 5.0;
        from = "kilogram";
        to = "pound";
        convertedValue = converter.convert(originalValue, from, to);
        System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);
    }
}
