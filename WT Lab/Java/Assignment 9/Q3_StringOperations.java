/*
	3. Write a program to perform following operations on user entered
	   strings –
		i) Change the case of the string
		ii) Reverse the string
		iii) Compare two strings
		iv) Insert one string into another string
*/

import java.util.Scanner;
public class Q3_StringOperations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1, str2;
		
		System.out.print("Enter a string: ");
		str1 = input.nextLine();
		
		// i) Changing case of string
		System.out.println("String in uppercase: " + str1.toUpperCase());
		System.out.println("String in lowercase: " + str1.toLowerCase());
		
		// ii) Reversing the string
		StringBuffer reversedString = new StringBuffer(str1).reverse();
		System.out.println("Reversed String: " + reversedString);
		
		// iii) Comparing 2 strings
		System.out.print("\nEnter another string: ");
		str2 = input.nextLine();
		int flag = str1.compareTo(str2);
		if (flag == 0)
			System.out.println("The strings are the same.");
		else if (flag == 1)
			System.out.println(str2 + " is lexicographically greater than " + str1);
		else
			System.out.println(str1 + " is lexicographically greater than " + str2);
		
		/// iv) Insert one string into another string
		System.out.print("\nEnter index at which to insert " + str2 + " into " + str1 + ": ");
		int index = input.nextInt();
		StringBuffer insertedString = new StringBuffer(str1);
		insertedString.insert(index, str2);
		System.out.println("Required String: " + insertedString);
		
		input.close();
	}
}