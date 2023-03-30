/*
	1. Illustrate the usage of abstract class with following Java classes –
		i) An abstract class “Student” with data members roll no, reg
		   no and a abstract method course()
		ii) A subclass “Kiitian” with course() method implementation
 */

abstract class Student {
	int roll;
	int regNo;
	abstract void course();
}

class Kiitian extends Student {
	void course() {
		System.out.println("Computer Science");
	}
}

public class Q1_AbstractClass {
	public static void main(String[] args) {
		Kiitian student = new Kiitian();
		student.course();
	}
}