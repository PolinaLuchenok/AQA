package hw1;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������, ����������, ������ �������� ��������!");
		String firstStr = scan.nextLine();
		
		RegEx value1 = new RegEx(firstStr);
		if(value1.checkValue() == false) {
			System.out.println("�� ����� ���������� �������� ���� ���� \",\"!");
			return;
		}
		
		System.out.println("�������, ����������, ������ �������� ��������!");
		String secondStr = scan.nextLine();
		
		RegEx value2 = new RegEx(secondStr);
		if(value2.checkValue() == false) {
			System.out.println("�� ����� ���������� �������� ���� ���� \",\"!");
			return;
		}
		
		Values sumVal = (x, y) -> x + y;
		Values subVal = (x, y) -> x - y;
		Values multVal = (x, y) -> x * y;
		Values divVal = (x, y) -> x / y;
		
		System.out.println("Сложение: " + sumVal.getValue(Double.valueOf(firstStr), Double.valueOf(secondStr)));
		System.out.println("���������: " + subVal.getValue(Double.valueOf(firstStr), Double.valueOf(secondStr)));
		System.out.println("���������: " + multVal.getValue(Double.valueOf(firstStr), Double.valueOf(secondStr)));
		System.out.println("�������: " + divVal.getValue(Double.valueOf(firstStr), Double.valueOf(secondStr)));
		
		scan.close();
	}

}
