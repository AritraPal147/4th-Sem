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