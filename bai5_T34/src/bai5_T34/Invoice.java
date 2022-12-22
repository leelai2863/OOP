package bai5_T34;

public class Invoice {
	int ID;
	Customer customer;
	double amount;
	
	public Invoice(int id, Customer c, double a) {
		ID = id;
		customer = c;
		amount = a;
	}
	public int getID() {
		return this.ID;
	}
	public void getCustomer(Customer c) {
		customer = c;
	}
	public double getAmount() {
		return this.amount;
	}
	public void setAmount (double a) {
		amount = a;
	}
	public String getCustomerName() {
		return this.customer.name;
	}
	public double getAmountAfterDiscount() {
		return amount - amount/customer.discount;
	}
}
