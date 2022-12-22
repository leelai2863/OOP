package btoop1_2;

public class Circle {
	double radius;
	static double pi = 3.14;
	public String color;
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) {
		radius = r; 
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	public String toString() {
		return "Circle[radius = " + radius + "]" + ", color " + "red";
	}
	
	public double getArea() {
		return this.radius*radius*2*pi;
	}
}
