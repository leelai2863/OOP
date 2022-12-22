package bai4;

public class Circle implements GeometricObject{
	double radius = 1.0;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	public double getPerimeter() {
		return this.radius*2*3.14;
	}
	public double getArea() {
		return this.radius*radius*3.14;
	}
}
