// 6) Java program to create an abstract class with static method

import java.util.Scanner;
abstract class A {
	int num1, num2;
	
	A(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
		
	abstract void sum();
	public static void printMsg() {
		System.out.println("In static method of abstract class.");
	}
}

class B extends A {
	B(int num1, int num2) {
		super(num1, num2);
	}
	
	@Override
	void sum() {
		System.out.println(num1 + " + " + num2 + ": " + (num1+num2));
	}
}

public class Q6_AbstractClassStaticMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Enter 2 integers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		B obj = new B(num1, num2);
		obj.sum();
		A.printMsg();
		input.close();
	}
}