// 3. Write a program in java to define a class Shape which has data member
//    "area" and a member function showArea(). Derive two classes Circle
//    and Rectangle from Shape class. Add appropriate data members and
//    member functions to calculate and display the area of Circle and
//    Rectangle.

import java.lang.Math;
import java.util.Scanner;

class Shape {
	double area;
	
	public void showArea() {
		System.out.println("Area: " + area);
	}
}

class Circle extends Shape {
	double rad;
	
	Circle(double rad) {
		this.rad = rad;
	}
	
	void calcArea() {
		area = Math.PI * rad * rad;
	}
}

class Rectangle extends Shape {
	double len, bre;
	
	Rectangle(double len, double bre) {
		this.len = len;
		this.bre = bre;
	}
	
	void calcArea() {
		area = len * bre;
	}
}

class Q3_Dynamic_Method2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius of circle: ");
		double rad = input.nextDouble();
		Circle cir = new Circle(rad);
		cir.calcArea();
		
		System.out.print("Enter length and breadth of rectangle: ");
		double len = input.nextDouble();
		double bre = input.nextDouble();
		Rectangle rec = new Rectangle(len, bre);
		rec.calcArea();
		
		Shape ref;
		ref = cir;	ref.showArea();
		ref = rec;	ref.showArea();
		input.close();
	}
}