// 2) Program to print the corresponding grade for given mark
// 	  using if..else statement in Java.

import java.util.Scanner;

class Q2_Find_Grade {
	public static void main(String[] args){
		System.out.println("Enter marks out of 100: ");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		String grade = " ";
		
		if (marks <= 100){
			if (marks >= 90)
				grade = "O";
			else if (marks >= 80)
				grade = "E";
			else if (marks >= 70)
				grade = "A";
			else if (marks >= 60)
				grade = "B";
			else if (marks >= 50)
				grade = "C";
			else if (marks >= 40)
				grade = "D";
			else if (marks < 40)
				grade = "F";
			System.out.println("Grade: " + grade);
		}
		else
			System.out.println("Invalid Marks. The input mark is greater than 100");
		
		sc.close();
	}
}