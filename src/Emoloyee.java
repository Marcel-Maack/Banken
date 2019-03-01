
public class Emoloyee extends Person {
	
	private long employeeId;
	
	public Emoloyee(String fn,String ln,long employeeId) {
		super(fn,ln);
		this.employeeId = employeeId;
	}
	public Emoloyee() {
		
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
}
