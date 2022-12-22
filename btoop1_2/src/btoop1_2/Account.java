package btoop1_2;

public class Account {
	String id;
	String name;
	int balance;
	public Account () {
		balance = 0;
	}
	public Account(String a, String b, int c) {
		id = a;
		name = b;
		balance = c;
	}
	public String getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getBalance() {
		return this.balance;
	}
	public int credit(int amount) {
		balance = amount;
		return this.balance;
	}
	public int debit(int amount) {
		if(amount <= balance)
			balance -= amount;
		else 
			System.out.println("amount exceeded");
		return balance;
	}
	public int transferTo(Account another, int amount) {
		if(amount <= balance) {
			another.balance = balance - amount;
			another.balance = balance + another.balance;
		}
		else
			System.out.println("amount exceeded");
		return balance;			
	}
	public String toString() {
		return "Account[" + id + ", " + name + ", " + balance + "]";
	}

}
