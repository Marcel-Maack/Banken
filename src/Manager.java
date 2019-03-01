
public class Manager extends Emoloyee {
	
	private int numberOfEmployee;
	
	public Manager(String fn,String ln,long employeeId,int noe) {
		super(fn,ln,employeeId);
		this.numberOfEmployee = noe;
		
	}
	
	public Manager() {
		
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}
	

}
