public class Programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assistent ass1 = new Assistent();
		Assistent ass2 = new Assistent("Marcel","Maack",4711,40);
		
		
		System.out.println(ass1);
		System.out.println(ass2);
		
		ass2.ausgabe();
		
		System.out.println(ass2.getFirstname()+" "+ass2.getLastname()+" "+ass2.getEmployeeId());
	}

}
