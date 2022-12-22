package T56_bai5;

public class Rectangle extends Shape {
	double width;
	double length;
	
	public Rectangle() {
		width = 1.0;
		length = 1.0;
	}
	public Rectangle(double w, double l) {
		width = w;
		length = l;
	}
	public Rectangle(double w, double l, String c, boolean f) {
		width = w;
		length = l;
		color = c;
		filled = f;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double w) {
		width  = w;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double l) {
		length = l;
	}
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return (width + length) * 2;
	}
	@Override
	public String toString() {
		return "Rectangle[" + super.toString() + ", width = " + width + ", length" + length + "]";
	}
}
