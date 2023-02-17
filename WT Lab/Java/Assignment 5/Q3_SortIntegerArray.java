// 3. Program to sort the user entered list of numbers of any size

import java.util.Scanner;

class Q3_SortIntegerArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of list: ");
		int size = sc.nextInt();
		
		int[] list = new int[size];
		System.out.println("Enter " + size + " numbers:");
		for (int i=0; i<size; i++) {
			list[i] = sc.nextInt();
		}
		
		System.out.print("Unsorted list: ");
		for (int i=0; i<size; i++) {
			System.out.print(list[i] + " ");
		}
		
		list = arraySorter(list, size);
		
		System.out.println();
		System.out.print("Sorted List: ");
		for (int i=0; i<size; i++) {
			System.out.print(list[i] + " ");
		}
		
		sc.close();
	}
	
	static int[] arraySorter(int[] arr, int size) {
		for (int i=0; i<size-1; i++) {
			for (int j=0; j<size-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}