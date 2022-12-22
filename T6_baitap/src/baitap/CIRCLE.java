package baitap;

public class CIRCLE {
	POINT center;
	int r;
	
	public CIRCLE() {
		center = new POINT();
		r = 0;
	}
	public CIRCLE(POINT p, int R) {
		center = p;
		r = R;
	}
	public POINT getCenter() {
		return this.center;
	}
	public void setCenter(POINT p) {
		center = p;
	}
	public int getR() {
		return this.r;
	}
	public void setR(int R) {
		r = R;
	}
	public double getArea() {
		return Math.PI*r*r;
	}
	public String toString() {
		return "Circle[radius" + r + ",center" + center +"]";
	}
}
