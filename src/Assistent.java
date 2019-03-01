
public class Assistent extends Emoloyee {
	
	private int hoursPerWeek;
	
	public Assistent(String fn,String ln,long employeeId,int hpw) {
		super(fn,ln,employeeId);
		this.hoursPerWeek =hpw;
		
		
	}
	
	public Assistent() {
		
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	 
	public void ausgabe() {
		System.out.println(hoursPerWeek);
	}
}
