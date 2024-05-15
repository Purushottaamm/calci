package calculator_dev;

import java.util.Scanner;

public class calculator_dev {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double div(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Number can not divide by 0");		
		}
		return num1 / num2;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int input = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter second Number: ");
		int input1 = sc.nextInt();
		
		System.out.println("The Addition is: "  + calculator_dev.add(input, input1));
		System.out.println("The Substraction is: "  + calculator_dev.sub(input, input1));
		System.out.println("The Multiplication is: "  + calculator_dev.mul(input, input1));
		System.out.println("The Divison is: "  + calculator_dev.div(input, input1));
	}
}
