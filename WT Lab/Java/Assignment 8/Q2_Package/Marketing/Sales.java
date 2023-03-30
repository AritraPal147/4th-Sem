package Marketing;
import General.Employee;

public class Sales extends Employee{
	public Sales(int empId, String eName, double basic) {
		super(empId, eName, basic);
	}
	
	public double tAllowance() {
		return (0.5 * earnings());
	}
}