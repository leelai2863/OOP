package T13_bt;

public abstract class Shape {
	String color;
	boolean filled;
	
	public Shape() {
		color = "red";
		filled = true;
	}
	public Shape(String c, boolean f) {
		color = c;
		filled = f;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color = c;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean f) {
		filled = f;
	}
	abstract void getArea();
	
	
	public String toString() {
		return "Shape[color = " + color + ", filled = " + filled + "]"; 
	}
}
