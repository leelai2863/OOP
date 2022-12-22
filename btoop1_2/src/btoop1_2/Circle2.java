package btoop1_2;

public class Circle2 {
	double radius;
	double O;
	static double pi = 3.14;
	
	public Circle2() {
		radius = 1.0;
		O = 0;
	}
	
	public Circle2(double o, double r) {
		radius = r;
		O = o;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public double getArea() {
		return this.radius*radius*2*pi;
	}
	
	public double getCircumference() {
		return this.radius*2*pi;
	}
	
	public String toString() {
		return "Circle[radius = " + radius + "]";
	}
}
