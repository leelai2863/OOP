package bai1;

public class Triangle extends Shape{
	double sideA, sideB, sideC;
	
	public Triangle(double a, double b, double c) {
		sideA = a;
		sideB = b;
		sideC = c;
	}
	public Triangle(double a, double b, double c, String color, boolean filled) {
		super(color, filled);
		this.sideA = a;
		this.sideB = b;
		this.sideC = c;
	}
	public double getSideA() {
		return sideA;
	}
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	public double getSideC() {
		return sideC;
	}
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	public double getPerimeter1() {
		return this.getPerimeter()/2;
	}
	public double getArea() {
		return Math.sqrt(this.getPerimeter1()*(this.getPerimeter1() - sideA)*(this.getPerimeter1() - sideB)*(this.getPerimeter1() - sideC));
	}
	public double getPerimeter() {
		return sideA + sideB + sideC;
	}
}
