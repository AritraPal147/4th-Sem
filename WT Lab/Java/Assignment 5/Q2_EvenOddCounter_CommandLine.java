// 2. Accept 10 numbers from command line and check how many of
//	  them are even and how many odd.

class Q2_EvenOddCounter_CommandLine {
	public static void main(String[] args) {
		//System.out.println("Enter 10 integers: ");
		int countEven = 0;
		int countOdd = 0;
		
		for (int i=0; i<10; i++) {
			if (Integer.parseInt(args[i]) % 2 == 0)
				countEven++;
			else
				countOdd++;
		}
		
		System.out.println(countEven + " Even numbers and " + countOdd + " Odd numbers.");
	}
}