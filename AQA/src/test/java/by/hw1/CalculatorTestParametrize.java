package test.java.by.hw1;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import main.java.by.hw1.Calculator;
import junit.framework.Assert;

@RunWith(value = Parameterized.class)
public class CalculatorTestParametrize  extends Assert{
	private double valueA;
	private double valueB;
	private char operation;
	private double expected;
	
	Calculator calculatorTest = new Calculator();
	
	public CalculatorTestParametrize(double valueA, double valueB, char operation, double expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.operation = operation;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Iterable<?> dataForTestSub() {
		return Arrays.asList(new Object[][] {{0, 59, '*', 0}, 
											{10, 2.0, '*', 20},
											{14.5, 10.1, '*', 146.45},
											{100, 34.6789, '*', 3467.89},
											{45, 20, '*', 900},
											{-4, -3, '*', 12},
											{-10, 45, '*', -450},
											{34, 12, '+', 46},
											{23.5, 1.39, '+', 24.89},
											{5.005, 70, '+', 75.005},
											{5, 6, '+', 11},
											{-1.25, -11, '+', -12.25},
											{-15, 4, '+', -11},
											{30, 0, '+', 30},
											{100, 50, '-', 50},
											{11.11, 1.1, '-', 10.01},
											{2, 0.0003, '-', 1.9997},
											{5, 1, '-', 4},
											{-10, -2, '-', -8},
											{-10, 3, '-', -13},
											{3, 0, '-', 3},
											{10, 2, '/', 5},
											{2.66, 1.1, '/', 2.418181818181818},
											{0.5, 0.25, '/', 2},
											{22,11, '/', 2},
											{-4, -4, '/', 1},
											{-10, 2.5, '/', -4},
											{ 8,    4, '/', 2},
											{1.5, 2.1, '+', 3.6},
											{2., 3., '+', 5},});
	}
	
	@Test
	public void parametrizeTest() {
		assertEquals(expected, calculatorTest.calculate(valueA, valueB, operation));
	}
}
