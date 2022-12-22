package bai5_T34;

public class Customer {
	int ID;
	String name;
	int discount;
	
	public Customer(int id, String n, int d) {
		ID = id;
		name = n;
		discount = d;
	}
	public int getID() {
		return this.ID;
	}
	public String getName() {
		return this.name;
	}
	public int getDiscount() {
		return this.discount;
	}
	public void setDiscount(int d) {
		discount = d;
	}
	public String toString() {
		return name+"(" + ID + ")";
	}
}
