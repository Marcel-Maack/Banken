
public class Program {

	public static void main(String[] args) {
		
		DeutscheBank db = new DeutscheBank(2000.00);
		Commerzbank cb = new Commerzbank(3000.00);
		KfW kfw = new KfW(2500.00);
		UniCredit uc = new UniCredit(5000.00);
		
		Personen p1 = new Personen("Marcel", "Maack", 3400.00);
		Personen p2 = new Personen("Janine", "Maack", 2000.00);
		Personen p3 = new Personen("Laurine", "Maack", 4000.00);
		
		
		db.openBankAccound(p1);
		kfw.openBankAccound(p3);
		uc.openBankAccound(p2);
		
	}

}
