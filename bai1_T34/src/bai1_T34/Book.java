package bai1_T34;

public class Book {
	String name;
	Author author;
	double price;
	int qty = 0;
	
	public Book(String n, Author a, double p) {
		name = n;
		author = a;
		price = p;
	}
	public Book(String nn, Author aa, double pp, int q) {
		name = nn;
		author = aa;
		price = pp;
		qty = q;
	}
	public String getName() {
		return this.name;
	}
	public Author getAuthor() {
		return this.author;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double p) {
		price = p;
	}
	public int getQty() {
		return this.qty;
	}
	public void setQty(int q) {
		qty = q;
	}
	public String toString() {
		return"Book[ " + name + ", " + author + ", " + price + ", " + qty + "]";
	}
}
