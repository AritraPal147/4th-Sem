// 1. Find the largest among 3 user entered nos. at 
// the command prompt using Java.


import java.util.Scanner;

class Q1_LargestNum_CommmandPrompt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter 3rd number: ");
		int num3 = sc.nextInt();
		
		int max = num1;
		
		if (num2 > max) {
			max = num2;
		}
		
		if (num3 > max) {
			max = num3;
		}
		sc.close();
		System.out.println("Largest Number: " + max);
	}
}