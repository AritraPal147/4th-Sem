/*
	1. Define an interface Motor with a data member –capacity and two
	   methods such as run() and consume(). Define a Java class
	   "Washing machine" which implements this interface and write the
	   code to check the value of the interface data member thru an object of
	   the class.
*/

interface Motor {
	int capacity = 0;
	abstract void run();
	abstract void consume();
}

class WashingMachine implements Motor {
    private int capacity;
    
    public WashingMachine(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public void run() {
        System.out.println("Washing machine is running.");
    }
    
    @Override
    public void consume() {
        System.out.println("Washing machine is consuming power.");
    }
    
    public int getCapacity() {
        return capacity;
    }
}

public class Q1_Interface1 {
	public static void main(String[] args) {
		WashingMachine washingMachine = new WashingMachine(10);
		System.out.println("Capacity of Washing Machine: " + washingMachine.getCapacity());
	}
}