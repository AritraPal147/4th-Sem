// 3. Write a program in java to input and display the details of n number of
//    students having roll, name and cgpa as data members. Also display the
//    name of the student having lowest cgpa.

import java.util.Scanner;

class Student {
	int roll;
	String name;
	double cgpa;
	Scanner input = new Scanner(System.in);
	
	void getData() {
		System.out.print("Name: ");
		this.name = input.nextLine();
		System.out.print("Roll: ");
		this.roll = input.nextInt();
		System.out.print("Cgpa: ");
		this.cgpa = input.nextDouble();
	}
	
	void display() {
		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Roll: " + roll);
		System.out.println("Cgpa: " + cgpa);
	}
	
	double getCgpa() {
		return this.cgpa;
	}
	
	String getName() {
		return this.name;
	}
}

public class Q3_ArrayofObjects {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = input.nextInt();
		System.out.println();
		
		Student[] students = new Student[n];
		for (int i=0; i<n; i++) {
			students[i] = new Student();
			System.out.println("Enter details of student " + (i+1));
			students[i].getData();
		}
		
		double minCgpa = students[0].getCgpa();
		String minCgpaName = students[0].getName();
		for (int i=0; i<n; i++) {
			if (students[i].getCgpa() < minCgpa) {
				minCgpa = students[i].getCgpa();
				minCgpaName = students[i].getName();
			}
			students[i].display();
		}
		
		System.out.println(minCgpaName + " has lowest CGPA.");
		input.close();
	}
}