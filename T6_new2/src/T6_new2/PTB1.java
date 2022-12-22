package T6_new2;

public class PTB1 {
	double b;
	double c;
	
	public PTB1(double b1, double c1) {
		b = b1;
		c = c1;
	}
	public String getSolution() {
		return "x = " + -c / b;
	}
	public String toString() {
		return b + "x" + "+" + c + "= 0";
	}
}
