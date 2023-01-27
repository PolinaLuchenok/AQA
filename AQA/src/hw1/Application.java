package hw1;

public class Application {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		double num1 = calc.getNum();
		double num2 = calc.getNum();
		char operation = calc.getOperation();
		double result = calc.calculate(num1, num2, operation);
		
		System.out.println("Operation result = " + result);
	}
}
