package T56_bai4;

public class Point {
	float x;
	float y;
	
	public Point(float X, float Y) {
		x = X;
		y = Y;
	}
	public Point() {
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
		return new float[] {x, y};
	}
	public String toString() {
		return "(" + x +", " + y + ")";
	}
}
