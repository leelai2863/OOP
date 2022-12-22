package T56_bai1;

public class Circle {
	double radius;
	public String color;
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) {
		radius = r; 
	}
	
	public Circle(double r, String c) {
		radius = r;
		color = c;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	public double getArea() {
		return this.radius*radius*2*3.14;
	}
	
	public String toString() {
		return "Circle[radius = " + radius + "]" + ", color " + "red";
	}
}
