package T13_bt;

public class Circle extends Shape{
	double radius;
	
	public Circle() {
		radius = 1.0;
	}
	
	public Circle(double r) {
		radius = r; 
	}
	
	public Circle(double r, String c, boolean f) {
		radius = r;
		color = c;
		filled = f;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public double getArea() {
		return this.radius*radius*2*3.14;
	}
	
	public double getPerimeter() {
		return 2*3.14*radius;
	}
	@Override
	public String toString() {
		return "Circle[" + super.toString() + ", radius " + radius + "]";
	}
}
