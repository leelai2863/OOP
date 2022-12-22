package btoop1_2;

public class Ball {
	float x;
	float y;
	int radius;
	float xDelta;
	float yDelta;
	
	public Ball(float a, float b, int r, int speed, int direction) {
		x = a;
		y = b;
		radius = r;
		xDelta = speed;
		yDelta = direction;
	}
	public float getX() {
		return this.x;
	}
	public void setX(float a) {
		x = a;
	}
	public float getY() {
		return this.y;
	}
	public void setY(float b) {
		y = b;
	}
	public int getRadius() {
		return this.radius;
	}
	public void setRadius(int r) {
		radius = r; 
	}
	public float getXDelta() {
		return this.xDelta;
	}
	public void getXDelta(float delta1) {
		xDelta = delta1;
	}
	public float getYDelta() {
		return this.yDelta;
	}
	public void setYDelta(float delta2) {
		yDelta = delta2;
	}
	public void move() {
		x += xDelta;
		y += yDelta;
	}
	public void reflecHorizontal() {
		xDelta = -xDelta;
	}
	public void reflectVertical() {
		yDelta = -yDelta;
	}
	public String toString() {
		return "Ball[(" + x + "," + y + ", speed=(" + xDelta + "," + yDelta +")]";
	}
}
