package T56_bai1;

public class Cylinder extends Circle {
	double height;
	
	public Cylinder() {
		height = 1.0;
	}
	public Cylinder(double r) {
		radius = r;
	}
	public Cylinder(double r, double h) {
		radius = r;
		height = h;
	}
	public Cylinder(double r, double h, String c) {
		radius = r;
		height = h;
		color = c;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double h) {
		height = h;
	}
	public double getVolume() {
		return getArea()*height;
	}
	public String toString() {
		return "Cylinder[" + super.toString() + ", height=" + height + "]";
	}
}
