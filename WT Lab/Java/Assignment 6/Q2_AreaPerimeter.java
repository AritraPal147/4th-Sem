// 2. Write a program in Java to define a class Rectangle having data
//    member: length and breadth; to calculate the area and perimeter of the
//    rectangle. Use member functions to read, calculate and display.

import java.util.Scanner;

class Rectangle {
	double length, breadth, area, perimeter;
	
	void getData() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length and breadth of rectangle: ");
		this.length = input.nextDouble();
		this.breadth = input.nextDouble();
		input.close();
	}
	
	void findAreaPerimeter() {
		this.area = length * breadth;
		this.perimeter = 2 * (length + breadth);
	}
	
	void display() {
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}
}

class Q2_AreaPerimeter {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.getData();
		rectangle.findAreaPerimeter();
		rectangle.display();
	}
}