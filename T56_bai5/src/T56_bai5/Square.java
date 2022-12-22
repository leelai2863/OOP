package T56_bai5;

public class Square extends Rectangle {
	double side;

	public Square() {
		side = 1.0;
	}
	public Square(double s) {
		side = s;
	}
	public Square(double s, String c, boolean f) {
		side = s;
		color = c;
		filled = f;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double s) {
		side = s;
	}
	public void setWidth(double s) {
		side = s;
	}
	public void setLength(double s) {
		side = s;
	}
	public String toString() {
		return "Square[ " + super.toString() + ", width" + width + ", length" + length +"]";
	}
}
	