// 4) Program to check if a given number is Palindrome or not.

import java.util.Scanner;

class Q4_CheckPalindrome {
	public static void main(String[] args) {
		System.out.print("Enter a number to be checked: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int revNum = 0;
		int temp = num;
		
		while (temp > 0) {
			revNum = revNum*10 + temp%10;
			temp /= 10;
		}
		
		if (num == revNum)
			System.out.println("Palindrome");
		else
			System.out.println("NOT Palindrome");
		sc.close();
	}
}