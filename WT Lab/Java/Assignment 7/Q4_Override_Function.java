// 4. Write a program to create an Account class containing acc_no, balance
//    as data members and disp() to display the details. Inherit it in Person
//    class with all mentioned data members and functions. Person class also
//    has name and aadhar_no as extra data members of its own. Override
//    disp() function. Create 5 persons' details.

class Account {
	int acc_no;
	double bal;
	
	Account(int acc_no, double bal) {
		this.acc_no = acc_no;
		this.bal = bal;
	}
	
	public void disp() {
		System.out.println("Account number: " + acc_no);
		System.out.println("Balance: " + bal);
	}
}

class Person extends Account {
	String name;
	int aadhar_no;
	
	Person(int acc_no, double bal, String name, int aadhar_no) {
		super(acc_no, bal);
		this.name = name;
		this.aadhar_no = aadhar_no;
	}
	
	public void disp() {
		System.out.println();
		System.out.println("Account number: " + acc_no);
		System.out.println("Balance: " + bal);
		System.out.println("Name: " + name);
		System.out.println("Aadhar Number: " + aadhar_no);
	}
}

class Q4_Override_Function {
	public static void main(String[] args) {
		Person p1 = new Person(151, 2000, "Aritra", 2500);
		Person p2 = new Person(152, 2001, "Anirban", 2800);
		Person p3 = new Person(153, 2002, "Ayush", 2700);
		Person p4 = new Person(154, 2003, "Hello", 2600);
		Person p5 = new Person(155, 2004, "World", 4000);
		
		Account ref;
		ref = p1;	p1.disp();
		ref = p2;	p2.disp();
		ref = p3;	p3.disp();
		ref = p4;	p4.disp();
		ref = p5;	p5.disp();	
	}
}	