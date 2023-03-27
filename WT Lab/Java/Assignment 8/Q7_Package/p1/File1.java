package p1;
public class C1ass1 {
	int n = 1;
	private int n_pri = 2;
	protected int n_pub = 3;
	public int n_pub = 4;
	
	public Class1() {
		System.out.println("Same package, Same class");
		System.out.println("n = " + n);
		System.out.println("n_pri = " + n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}

public class Class2 extends Class1 {
	public Class2() {
		System.out.println("\nSame package, Derived class");
		System.out.println("n = " + n);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}

public class Class3 {
	public Class3() {
		System.out.println("Same package, Different class");
		System.out.println("n = " + n);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}
	