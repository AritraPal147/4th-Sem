// 5. Find the no. of occurrence of each element in an user entered list of nos.

import java.util.Scanner;

class Q5_OccurenceOfNumber_InArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of list: ");
		int size = sc.nextInt();
		int[] list = new int[size];
		
		System.out.println("Enter " + size + " integers: ");
		for (int i=0; i<size; i++) 
			list[i] = sc.nextInt();
		
		numOfOccurences(list, size);
		sc.close();
	}
	
	static void numOfOccurences(int[] arr, int n) {
		int CHECKED = -999999;
		int count = 0;
		
		for (int i=0; i<n; i++) {
			if (arr[i] != CHECKED) {
				int temp = arr[i];
				for (int j=i; j<n; j++) {
					if (arr[j] == arr[i]) {
						count++;
						arr[j] = CHECKED;
						System.out.println(arr[i] + " " + count);
					}
				}
				System.out.println("Element: " + temp + ", Occurence: " + count);
				count = 0;
			}
		}
	}
}