package bai6_T34;

public class Customer {
	int ID;
	String name;
	char gender;
	
	public boolean checkGT() {
		if(gender == 'm' || gender == 'f')
			return true;
		else 
			return false;
	}
	public Customer(int id, String n, int discount) {
		ID = id;
		name = n;
	}
	public int getID() {
		return this.ID;
	}
	public String getName() {
		return this.name;
	}
	public char getGender() {
		return this.gender;
	}
	public String toString() {
		return name + "(" + ID + ")";
	}
}
