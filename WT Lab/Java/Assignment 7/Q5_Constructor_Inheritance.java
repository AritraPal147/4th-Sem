// 5. Write a program in java using inheritance to show how to call the
//    base class parameterized constructors from the derived class using
//    super.

class A {
	int num1;
	A (int num) {
		this.num1 = num;
	}
}

class B extends A {
	int num2;
	B (int num1, int num2) {
		super(num1);
		this.num2 = num2;
	}
	
	public void sum() {
		int sum = num1 + num2;
		System.out.println("Sum of 2 numbers: " + sum);
	}
}

class Q5_Constructor_Inheritance {
	public static void main(String[] args) {
		B b = new B(1, 2);
		b.sum();
	}
}