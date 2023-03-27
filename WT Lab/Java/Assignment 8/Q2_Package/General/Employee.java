package General;
public class Employee {
	protected int empId;
	private String eName;
	protected double basic;
	
	public Employee(int empId, String eName, double basic) {
		this.empId = empId;
		this.eName = eName;
		this.basic = basic;
	}

	public double earnings() {
		double da = 0.8 * basic;
		double hra = 0.15 * basic;
		return (basic + da + hra);
	}
	
	public void displayTotalEarnings() {
        double earnings = earnings();
        System.out.println("Emp Id: " + empId + ", Total Earnings: " + earnings);
    }
}