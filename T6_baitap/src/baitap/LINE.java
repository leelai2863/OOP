package baitap;

public class LINE {
	POINT A, B;
	
	public LINE() {
		A = new POINT();
		B = new POINT();
	}
	public LINE(POINT p1, POINT p2) {
		this.A = p1;
		this.B = p2;
	}
	public POINT getA() {
		return A;
	}
	public void setA(POINT p) {
		A = p;
	}
	public POINT getB() {
		return B;
	}
	public void setB(POINT p) {
		B = p;
	}
	public double distance()
	{
		return A.distance(B);
	}
	public double xIntercept() {
		double a = 1.0*(A.y - B.y)/(A.x - B.x);
		double b =A
	}
	public double yIntercept() {
		return
	}
	public String toString() {
		return 
	}
}
