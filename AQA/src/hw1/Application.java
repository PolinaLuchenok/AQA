package hw1;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first numeric value!");
		String firstStr = scan.nextLine();
		
		RegEx value1 = new RegEx(firstStr);
		if(value1.checkValue() == false) {
			System.out.println("You entered a non-numeric value or character \",\"!");
			return;
		}
		
		System.out.println("Please enter the second numeric value!");
		String secondStr = scan.nextLine();
		
		RegEx value2 = new RegEx(secondStr);
		if(value2.checkValue() == false) {
			System.out.println("You entered a non-numeric value or character \",\"!");
			return;
		}
		
		Values sumVal = (x, y) -> x + y;
		Values subVal = (x, y) -> x - y;
		Values multVal = (x, y) -> x * y;
		Values divVal = (x, y) -> x / y;
		
		System.out.println("Addition: " + sumVal.getValue(Double.valueOf(firstStr), Double.valueOf(secondStr)));
		System.out.println("Subtraction: " + subVal.getValue(Double.valueOf(firstStr), Double.valueOf(secondStr)));
		System.out.println("Multiplication: " + multVal.getValue(Double.valueOf(firstStr), Double.valueOf(secondStr)));
		System.out.println("Division: " + divVal.getValue(Double.valueOf(firstStr), Double.valueOf(secondStr)));
		
		scan.close();
	}

}
