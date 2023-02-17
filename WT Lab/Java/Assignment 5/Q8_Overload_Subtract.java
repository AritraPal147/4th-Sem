// 8. Write a program to overload subtract method with various parameters
//    in a class in Java

import java.util.Scanner;

class Q8_Overload_Subtract {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		double num3, num4;
		
		System.out.print("Enter 2 integers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.print("Enter 2 floating point numbers: ");
		num3 = input.nextDouble();
		num4 = input.nextDouble();
		
		int diff1 = subtract(num1, num2);
		double diff2 = subtract(num3, num4);
		
		System.out.println(diff1 + " " + diff2);
		input.close();
	}
	
	static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	static double subtract(double num1, double num2) {
		return num1 - num2;
	}
}