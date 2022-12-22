package bai2_T34;
import java.util.Arrays;


public class Book2 {
	String name;
	Author[] author;
	double price;
	int qty = 0;
	Book2[] book;
	public Book2(String n, Author[] a, double p) {
		name = n;
		author = a;
		price = p;
	}
	public Book2(String nn, Author[] aa, double pp, int q) {
		name = nn;
		author = aa;
		price = pp;
		qty = q;
	}
	public String getName() {
		return this.name;
	}
	public Author[] getAuthor() {
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
	public String getData(Author a[]) {
		String index = "";
		int i=0;
		while(a[i] != null) {
			index += a[i] + ", ";
			i++;
		}
		return index;
	}
	public Book2[] delete(Book2[] b, int vt) {
		int i, k;
		Book2[] index = new Book2[b.length];
 		for(i=0, k=0; i<b.length; i++ ) {
			if(i==vt) {
				i+=1;
			}
			index[k++] = b[i];
		}
 		return index;
	}
	public Book2[] deleteTG(Book2[] b, String tg) {
		if(b[b.length-1].author[author.length-1].name == tg) {
			b = Arrays.copyOf(b, b.length-1);
		}
		for(int i=0; i<b.length-1; i++) {
			if(b[i].author[author.length-1].name == tg) {
				b = b[i].delete(b, i);
			}
			for(int j=0; j<b[i].author.length-1; j++) {
				if (b[i].author[j].name == tg) {
					b = b[i].delete(b, i);
				}
			}
			b = Arrays.copyOf(b, b.length-1);
		}
		return b;
	}
	
	public String toString() {
		return "Book[" + name + ", authors = {" + getData(author) + "}, price = " + price + ", qty = " + qty + "]";
	}
}

