package btoop1_2;

public class bai1 {
	double radius;
	static double pi = 3.14;
	public String color;
	
	public bai1() {
		radius = 1.0;
		color = "red";
	}
	
	public bai1(double r) {
		radius = r; 
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return this.radius*radius*2*pi;
	}
}
