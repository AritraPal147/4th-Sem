// 2) Create three classes: Phone, SmartPhone and CellularPhone.
//    The Phone is the parent class and SmartPhone, CellularPhone are the child classes. 
//    The method on() of the parent class is overridden inside the child
//    classes.

class Phone {
	public void on() {
		System.out.println("In parent class: Phone");
	}
}

class SmartPhone extends Phone {
	public void on() {
		System.out.println("In child class: SmartPhone");
	}
}

class CellularPhone extends Phone {
	public void on() {
		System.out.println("In child class: CellularPhone");
	}
}

public class Q2_Dynamic_Method1 {
	public static void main(String[] args) {
		Phone p = new Phone();
		SmartPhone sp = new SmartPhone();
		CellularPhone cp = new CellularPhone();
		
		Phone ref;
		ref = p;	ref.on();
		ref = sp;	ref.on();
		ref = cp;	ref.on();
	}
}