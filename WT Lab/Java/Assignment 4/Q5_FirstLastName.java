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