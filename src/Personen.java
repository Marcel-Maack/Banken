
public class Personen {
	
	private String firstName;
	private String lastname;
	private double money;
	private Banken myBank;
	
	public Personen(String fn, String ln, double geld) {
		this.firstName = fn;
		this.lastname = ln;
		this.money = geld;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastname(String ln) {
		this.lastname = ln;
	}
	public String getLastname() {
		return this.lastname;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Banken getMyBank() {
		return myBank;
	}

	public void setMyBank(Banken myBank) {
		this.myBank = myBank;
	}

	
	
	
	
}
