// นายสุทธิภัทร รสหอม 663380241-1

package sqa.test;

import sqa.main.LiquidVolumeConverter;

public class DriverLiquid {

    public static void main(String[] args) {

        double originalValue = 2.0;
        double convertedValue = 0.0;
        String from = "cup";
        String to = "ml";

        LiquidVolumeConverter converter = new LiquidVolumeConverter();

        // cup to ml
        convertedValue = converter.convert(originalValue, from, to);
        System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);

        // pint to ml
        originalValue = 3.0;
        from = "pint";
        to = "ml";
        convertedValue = converter.convert(originalValue, from, to);
        System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);
    }
}
