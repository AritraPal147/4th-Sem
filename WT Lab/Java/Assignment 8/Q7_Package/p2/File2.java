package p2;
class Class4 extends Class1 {
	public Class4() {
		System.out.println("\nDifferent package, Derived class");
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}

class Class5 {
	public Class5() {
		System.out.println("\nDifferent package, Different class");
		System.out.println("n_pub = " + n_pub);
	}
}