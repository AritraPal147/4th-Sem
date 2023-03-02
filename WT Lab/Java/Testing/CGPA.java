// 1) Write a program in
// java to input the details of a student having roll, name, full_mark and
// secured_mark as data members using constructor, then calculate the CGPA
// and display the details of student with CGPA.

import java.util.Scanner;

class Calculator {
    int roll, fullMarks, securedMarks;
    String name;
    float CGPA;

    Calculator(int roll, String name, int full_mark, int secured_mark) {
        this.roll = roll;
        this.name = name;
        this.fullMarks = full_mark;
        this.securedMarks = secured_mark;
    }

    void calculateCGPA() {
        CGPA = (float) securedMarks * 10 / fullMarks;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("CGPA: " + CGPA);
    }
}

class CGPA {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter roll: ");
        int roll = input.nextInt();
        System.out.print("Enter full marks: ");
        int full_mark = input.nextInt();
        System.out.print("Enter marks secured: ");
        int secured_mark = input.nextInt();

        Calculator obj = new Calculator(roll, name, full_mark, secured_mark);
        obj.calculateCGPA();
        obj.displayDetails();
        input.close();
    }
}