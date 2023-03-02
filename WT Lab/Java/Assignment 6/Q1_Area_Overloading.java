// 1. Write a program which will overload the area() method and display the
//    area of a circle, triangle and square as per user choice and user entered
//    dimensions.

import java.util.Scanner;
import java.lang.Math;

class Q1_Area_Overloading {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius of circle: ");
		double rad = input.nextDouble();
		area(rad, 0);

		System.out.println("Enter side of square: ");
		double side = input.nextDouble();
		area(side);

		System.out.println("Enter 3 sides of triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		area(side1, side2, side3);

		input.close();
	}
	
	static void area(double rad, double numOfSides) {
		if (numOfSides == 0) {
			double area = Math.PI * rad * rad;
			System.out.println("Area: " + area);
		}
	}
	
	static void area(double side) {
		double area = Math.pow(side, 3);
		System.out.println("Area: " + area);
	}
	
	static void area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Area: " + area);
	}
}