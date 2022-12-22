package T56_bai5;

public class Shape {
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
	public String toString() {
		return "Shape[color = " + color + ", filled = " + filled + "]"; 
	}
}
