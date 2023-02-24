// 5. Write a program in Java to define a class Number with appropriate data
//    members and member functions to input n number of integers and
//    swap the biggest and smallest elements. Use member functions read(),
//    swap() and display().

import java.util.Scanner;

class Number {
	Scanner input = new Scanner(System.in);
	int[] array;
	int n, maxIndex, minIndex;
	
	public void read() {
		System.out.print("Enter size of array: ");
		this.n = input.nextInt();
		array = new int[n];
		
		System.out.println("Enter " + n + " numbers: ");
		for (int i=0; i<n; i++)
			array[i] = input.nextInt();
	}
	
	public void swap() {
		maxIndex = 0;
		minIndex = 0;
		for (int i=0; i<n; i++) {
			if (array[i] > array[maxIndex]) 
				maxIndex = i;
			if (array[i] < array[minIndex])
				maxIndex = i;
		}
		
		int temp = array[minIndex];
		array[minIndex] = array[maxIndex];
		array[maxIndex] = temp;
		System.out.println("Swap Successful");
	}
	
	public void display() {
		System.out.println();
		System.out.print("Required Array: ");
		for (int i=0; i<n; i++)
			System.out.print(array[i] + " ");
	}
}

class Q5_Swap_MaxMin {
	public static void main(String[] args) {
		Number numberList = new Number();
		numberList.read();
		numberList.swap();
		numberList.display();
	}	
}