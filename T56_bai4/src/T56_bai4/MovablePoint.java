package T56_bai4;

public class MovablePoint extends Point{
	float xSpeed;
	float ySpeed;
	
	public MovablePoint(float X, float Y, float xS, float yS) {
		x = X;
		y = Y;
		xSpeed = xS;
		ySpeed = yS;
	}
	public MovablePoint(float xS, float yS) {
		xSpeed = xS;
		ySpeed = yS;
	}
	public float getXSpeed() {
		return this.xSpeed;
	}
	public void setXSpeed(float xS) {
		xSpeed = xS;
	}
	public float getYSpeed() {
		return this.ySpeed;
	}
	public void setYSpeed(float yS) {
		ySpeed = yS;
	}
	public void setSpeed(float xS, float yS) {
		xSpeed = xS;
		ySpeed = yS;
	}
	public float[] getSpeed() {
		return new float[] {this.xSpeed, this.ySpeed};
	}
	@Override
	public String toString() {
		return "(" + super.toString() + ", " + "speed = (" + xSpeed + ", " + ySpeed + ")";
	}
}
