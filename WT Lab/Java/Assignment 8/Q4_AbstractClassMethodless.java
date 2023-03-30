// 4) Java program to create an abstract class without any abstract method.

import java.util.Scanner;
abstract class Summer {
	int num1, num2;
	
	Summer(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
}

class TestingSum extends Summer {
	TestingSum(int num1, int num2) {
		super(num1, num2);
	}
	
	void sum() {
		System.out.println("Sum: " + (num1+num2));
	}
}

public class Q4_AbstractClassMethodless {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Enter 2 integers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		TestingSum obj = new TestingSum(num1, num2);
		obj.sum();
		input.close();
	}
}
