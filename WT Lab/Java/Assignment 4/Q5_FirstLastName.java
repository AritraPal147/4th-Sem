// 5) Write a program in Java to take first name and last name from
// 	  user and print both in one line as last name followed by first name.

import java.util.Scanner;

class Q5_FirstLastName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First name:");
		String FName = sc.nextLine();
		
		System.out.print("Enter Last Name: ");
		String LName = sc.nextLine();
		
		System.out.println(LName + " " + FName);
		sc.close();
	}
}