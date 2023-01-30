package main.java.by.hw1;

import java.util.Scanner;

public class Calculator {
	static Scanner scan = new Scanner(System.in);
	
	public Calculator() {
		super();
	}

	public double getNum() {
		System.out.println("Please enter the number!");
		double num;
		if(scan.hasNextDouble()){
            num = scan.nextDouble();
        } else {
            System.out.println("You made a mistake when entering a number. Try again.");
            scan.next();
            num = getNum();
        }
        return num;
	}

	public char getOperation() {
		System.out.println("Please enter the operation!");
		char operation;
		if(scan.hasNext()){
            operation = scan.next().charAt(0);
        } else {
            System.out.println("You made a mistake when entering an operation. Try again.");
            scan.next();
            operation = getOperation();
        }
        return operation;
	}
	
	public double calculate(double num1, double num2, char operation) {
		double result;
		switch (operation){
        case '+':
            result = num1+num2;
            break;
        case '-':
            result = num1-num2;
            break;
        case '*':
            result = num1*num2;
            break;
        case '/':
        	if (num2 == 0) {
                System.out.println("Division by zero");
                return 0;
            } else {
            	result = num1 / num2;
            }
            break;
        default:
            System.out.println("Wrong operation. Try again.");
            result = calculate(num1, num2, getOperation());
		}
		return result;
	}
}

