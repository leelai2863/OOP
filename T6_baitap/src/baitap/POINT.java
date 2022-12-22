package baitap;

public class POINT {
	int x, y;
	public POINT() {
		x = 0;
		y = 0;
	}
	public POINT(int X, int Y) {
		x = X;
		y = Y;
	}
	public int getX() {
		return this.x;
	}
	public void setX(int X) {
		x = X;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int Y) {
		y = Y;
	}
	public double distance(POINT p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2)) + Math.pow(y - p.y, 2);
	}
	public String toString() {
		return "(" + x + ", " + y + ") ";
	}
}
