package btoop1_2;

public class InvoiceItem {
	String id;
	String desc;
	int qty;
	double unitPrice;
	
	public InvoiceItem(String a, String b, int c, double d) {
		id = a;
		desc = b;
		qty = c;
		unitPrice = d;
	}
	public String getID() {
		return this.id;
	}
	public String getDesc() {
		return this.desc;
	}
	public int getQty() {
		return this.qty;
	}
	public void setQty(int c) {
		qty = c;
	}
	public double getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(double d) {
		unitPrice = d;
	}
	public double getTatal() {
		return this.unitPrice*qty;
	}
	public String toString() {
		return "InvoiceItem[" + id + ", " + qty + ", " + unitPrice + "]";
	}
}
