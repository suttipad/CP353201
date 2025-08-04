package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import sqa.main.CountWordClumps;

class C_BC_CoverageTest {

	@ParameterizedTest
	@MethodSource("C_BC_TestCase")
	void C_BC_CountClumps(int[] nums, int expected) {
		assertEquals(expected, CountWordClumps.countClumps(nums));
	}

	static Stream<Arguments> C_BC_TestCase() {
		return Stream.of(
			Arguments.of(null, 0),                      
			Arguments.of(new int[] {}, 0),              
			Arguments.of(new int[] {1, 1, 1, 2}, 1)       
		);
	}
}
