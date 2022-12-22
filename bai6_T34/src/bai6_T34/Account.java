package bai6_T34;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Account {
	int id;
	Customer customer;
	double balance = 0.0;
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public Account(int i, Customer c, double b) {
		id = i;
		customer = c;
		balance = b;
	}
	public Account(int i, Customer c) {
		id = i;
		customer = c;
	}
	public int getID() {
		return this.id;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double b) {
		balance = b;
	}
	public String toString() {
		return customer + ", balance = " + df.format(balance);
	}
	public String getCustomerName() {
		return this.customer.name;
	}
	public Account deposit(double amount) {
		balance += amount;
		return this;
	}
	public Account withdraw(double amount) {
		if(balance >= amount) {
			balance-=amount;
			return this;
		}
		else {
			System.out.print("amount withdraw exceeds the current balance!");
			return this;
		}
	}
}