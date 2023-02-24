// 1. Write a program which will overload the area () method and display the
//    area of a circle, triangle and square as per user choice and user entered
//    dimensions.

import java.util.Scanner;
import java.lang.Math;

class Q1_Area_Overloading {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 for circle: ");
		System.out.println("Enter 2 for square: ");
		System.out.println("Enter 3 for triangle: ");
		int choice = input.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("Enter radius of circle: ");
				int rad = input.nextInt();
				area(rad, 0);
				break;
			case 2:
				System.out.println("Enter side of square: ");
				int side = input.nextInt();
				area(side);
				break;
			case 3:
				System.out.println("Enter 3 sides of triangle: ");
				int side1 = input.nextInt();
				int side2 = input.nextInt();
				int side3 = input.nextInt();
				area(side1, side2, side3);
				break;
		}
		input.close();
	}
	
	static void area(int rad, int numOfSides) {
		if (numOfSides == 0) {
			double area = Math.PI * rad * rad;
			System.out.println("Area: " + area);
		}
	}
	
	static void area(int side) {
		double area = Math.pow(side, 3);
		System.out.println("Area: " + area);
	}
	
	static void area(int side1, int side2, int side3) {
		int s = side1 + side2 + side3 / 2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Area: " + area);
	}
}