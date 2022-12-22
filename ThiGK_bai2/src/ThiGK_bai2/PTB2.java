package ThiGK_bai2;

public class PTB2 extends PTB1{
	double a;
	
	public PTB2(double a1, double b1, double c1) {
		super(b1, c1);
		a = a1;
	}
	public String getSolution() {
		if(a == 0)
			return super.getSolution();
		else {
			double delta = b*b - 4*a*c;
			if(delta < 0) {
				return "Phuong trinh vo nghiem";
			}	
			else if(delta > 0) {
				double x1 = (-b + Math.sqrt(delta))/(2*a);
				double x2 = (-b - Math.sqrt(delta))/(2*a);
				return "x1 = " + x1 + ", x2 = " + x2;
			}
			else{
				double x = -b/2*a;
				return "x = " + x; 
			}
		}
	}
	public String toString() {
		return a + "x^2 + " + b + "x + " +c + " = 0";
	}
}
