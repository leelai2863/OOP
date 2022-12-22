package T56_bai3;

public class Point2D {
	float x, y;
	
	public Point2D(float X, float Y) {
		x = X;
		y = Y;
	}
	public Point2D() {
		x = 0.0f;
		y = 0.0f;
	}
	public float getX() {
		return x;
	}
	public void setX(float X) {
		x = X;
	}
	public float getY() {
		return y;
	}
	public void setY(float Y) {
		y = Y;
	}
	public void setXY(float X, float Y) {
		x = X;
		y = Y;
	}
	public float[] getXY() {
		System.out.println("(" + x + ", " + y +")");
		float arr[] = {this.x, this.y};
		return arr;
	}
	public String toString() {
		return "(" + x +", " + y + ")";
	}
}
