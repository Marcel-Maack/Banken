
public class Banken {
	
	private String name;
	private double limit;
	
	public Banken(double limit) {
		this.limit = limit;
	}
	
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	public void openBankAccound(Personen p) {
		
		System.out.println();
		System.out.println("Hallo Frau/Herr "+p.getLastname()+" "+p.getFirstName());
		System.out.println("Sie haben Ihr Konto erfolgreich eröffnet.");
		System.out.println();
		
		p.setMyBank(this);		
		
		System.out.println("Name der Bank "+this.getName());
		System.out.println("Ihr Kontostand "+p.getMoney());
		System.out.println("Das Kreditlimit beträgt "+this.limit);
		System.out.println("***************************************");
	}
}
