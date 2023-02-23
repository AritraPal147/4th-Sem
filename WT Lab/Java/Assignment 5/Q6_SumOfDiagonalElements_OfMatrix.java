// 6. Find sum of each diagonal (left &amp; right) elements separately of a user
// entered 3 X 3 matrix in Java.

import java.util.Scanner;

class Q6_SumOfDiagonalElements_OfMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		
		System.out.println("Enter elements into 3x3 matrix:");
		for (int i=0; i<3; i++) {
			System.out.println("Enter " + 3 + " row elements: ");
			for (int j=0; j<3; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		int leftDiagonalSum = 0;
      	int rightDiagonalSum = 0;
      	for (int i = 0; i < 3; i++) {
         	leftDiagonalSum += matrix[i][i]; 
         	rightDiagonalSum += matrix[i][2-i]; 
    	}

		System.out.println("Sum of left diagonal elements: " + leftDiagonalSum);
      	System.out.println("Sum of right diagonal elements: " + rightDiagonalSum);
		input.close();
	}
}