package hw1;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите Введите, пожалуйста, первое числовое значение!");
		String firstStr = scan.nextLine();
		
		RegEx value1 = new RegEx(firstStr);
		value1.checkValue();
		if(value1.checkValue() == false) {
			System.out.println("Вы ввели нечисловое значение либо знак \",\"!");
			return;
		}
		
		System.out.println("Введите, пожалуйста, второе числовое значение!");
		String secondStr = scan.nextLine();
		
		RegEx value2 = new RegEx(secondStr);
		value2.checkValue();
		if(value2.checkValue() == false) {
			System.out.println("Вы ввели нечисловое значение либо знак \",\"!");
			return;
		}
		
		Values sumVal = (x, y) -> x + y;
		Values subVal = (x, y) -> x - y;
		Values multVal = (x, y) -> x * y;
		Values divVal = (x, y) -> x / y;
		
		System.out.println("Сложение: " + sumVal.getValue(Double.valueOf(firstStr), Double.valueOf(secondStr)));
		System.out.println("Вычитание: " + subVal.getValue(Double.valueOf(firstStr), Double.valueOf(secondStr)));
		System.out.println("Умножение: " + multVal.getValue(Double.valueOf(firstStr), Double.valueOf(secondStr)));
		System.out.println("Деление: " + divVal.getValue(Double.valueOf(firstStr), Double.valueOf(secondStr)));
		
		scan.close();
	}

}
