package bai1_T34;

public class Author {
	String name;
	String email;
	char gender;
	
	public Author(String n, String e, char g) {
		name = n;
		email = e;
		gender = g;
	}
	public boolean checkGT() {
		if(gender == 'm' || gender == 'f')
			return true;
		else 
			return false;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String em) {
		email = em;
	}
	public char getGender() {
		return this.gender;
	}
	public String toString() {
		return "Author[" + name + ", " + email + ", " + gender + "]";
	}
}
