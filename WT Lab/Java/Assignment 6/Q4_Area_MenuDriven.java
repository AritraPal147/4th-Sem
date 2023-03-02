// 4. Write a program to calculate area according to user input, whether it is
//    circle, square or triangle (Menu Driven).

import java.util.Scanner;
import java.lang.Math;

class Q4_Area_MenuDriven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Continue = "y";
		
		while (Continue.equals("y")) {
			System.out.println("Enter 1 for circle ");
			System.out.println("Enter 2 for square ");
			System.out.println("Enter 3 for triangle ");
			System.out.print("Enter your choice: ");
			int choice = input.nextInt();
			
			switch (choice) {
				case 1:
					System.out.print("Enter radius of circle: ");
					double rad = input.nextDouble();
					area(rad, 0);
					break;
				case 2:
					System.out.print("Enter side of square: ");
					double side = input.nextDouble();
					area(side);
					break;
				case 3:
					System.out.print("Enter 3 sides of triangle: ");
					double side1 = input.nextDouble();
					double side2 = input.nextDouble();
					double side3 = input.nextDouble();
					area(side1, side2, side3);
					break;
			}
			
			System.out.print("Do you want to continue (y/n): ");
			input.nextLine();
			Continue = input.nextLine();
			System.out.println();
		}
		input.close();
	}
	
	static void area(double rad, int numOfSides) {
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