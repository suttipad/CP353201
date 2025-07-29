package sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import sqa.main.ShippingVehicle;

class test_category_partition {

    ShippingVehicle test;

    @BeforeEach
    void setup() {
        test = new ShippingVehicle();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/ShippingVehicleTestCases.csv", numLinesToSkip = 1)
    void test_category(int small, int medium, int large, String expected) {
        List<Integer> result = test.calculate(small, medium, large);
        assertEquals(expected, result.toString());
    }
}
