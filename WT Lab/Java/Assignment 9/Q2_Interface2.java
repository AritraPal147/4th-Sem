/*
	2. Define an interface with three methods – earnings(), deductions() and
	   bonus() and define a Java class "Manager" which uses this
	   interface without implementing bonus() method. Also define another
	   Java class "Substaff" which extends from "Manager" class and
	   implements bonus() method. Write the complete program to find
	   out earnings, deduction and bonus of a sbstaff with basic salary amount
	   entered by the user as per the following guidelines –
	   earnings = basic + DA (80% of basic) + HRA (15% of basic)
	   deduction = 12% of basic 
	   bonus = 50% of basic
*/

import java.util.Scanner;
interface EmployeeBasics {
	abstract double earnings();
	abstract double deductions();
	abstract double bonus();
}

abstract class Manager implements EmployeeBasics {
	double basicSalary;
	Manager(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	@Override
	public double earnings() {
		double da = 0.8 * basicSalary;
		double hra = 0.15 * basicSalary;
		return (basicSalary + da + hra);
	}
	
	@Override
	public double deductions() {
		return (0.12 * basicSalary);
	}
}

class SubStaff extends Manager {
	SubStaff(double basicSalary) {
		super(basicSalary);
	}
	
	@Override
	public double bonus() {
		return (0.5 * basicSalary);
	}
}

public class Q2_Interface2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double basicSalary;
		
		System.out.print("Enter basic salary for sub staff: ");
		basicSalary = input.nextDouble();
		SubStaff subStaff = new SubStaff(basicSalary);
		input.close();
		
		System.out.println("\nEarnings: " + subStaff.earnings());
		System.out.println("Deduction: " + subStaff.deductions());
		System.out.println("Bonus: " + subStaff.bonus());
	}
}