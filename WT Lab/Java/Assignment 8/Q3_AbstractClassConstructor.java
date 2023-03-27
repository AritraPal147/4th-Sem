// 3) Java program to create an abstract class with constructor

import java.util.Scanner;
abstract class A {
	int a;
	
	A(int num) {
		a = num;
	}
	
	abstract void print();
}

class B extends A {
	int b;
	
	B(int num1, int num2) {
		super(num1);
		b = num2;
	}
	
	@Override
	void print() {
		System.out.println("The numbers are: " + a + ", " + b);
	}
}

public class Q3_AbstractClassConstructor {
	public static void main(String[] args) {
		int num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		B obj = new B(num1, num2);
		obj.print();
		input.close();
	}
}