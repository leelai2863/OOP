package baitap;

public class CYLINDER extends CIRCLE{
	int height;
	
	public CYLINDER() {
		height = 0;
	}
	public CYLINDER(POINT p, int r, int h) {
		super(p, r);
		height = h;
	}
	public void getHeight(int h) {
		height = h;
	}
	public double getArea() {
		return 2*getArea() + 2*Math.PI*getR()*height;
	}
	public double getVolume() {
		return getArea()*height;
	}
	public String toString() {
		return "Cylinder[" + super.toString() + ", height-" + height + "]";
	}
}
