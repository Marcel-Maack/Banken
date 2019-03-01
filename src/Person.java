
public class Person {
	
		private String firstname;
		private String lastname;
	
	
	public Person(String fn,String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}
	public Person() {
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
