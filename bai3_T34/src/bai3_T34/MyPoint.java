package bai3_T34;

public class MyPoint {
	int x;
	int y;
	
	public MyPoint() {
		x = 0;
		y = 0;
	}
	public MyPoint(int xx, int yy) {
		x = xx;
		y = yy;
	}
	public int getX() {
		return this.x;
	}
	public void setX(int xx) {
		x = xx;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int yy) {
		y = yy;
	}
	public int[] getXY(){
		return new int[] {this.x, this.y} ;
	}
	public void setXY(int xx, int yy) {
		x = xx;
		y = yy;
	}
	public String toString() {
		return "(" + x +", " + y + ")";
	}
	public double distance(int xx, int yy) {
		return Math.sqrt(Math.pow((this.x - xx), 2) +Math.pow((this.y - yy), 2));
	}
	public double distance(MyPoint a) {
		return Math.sqrt(Math.pow((this.x - a.x), 2) + Math.pow((this.y - a.y), 2));
	}
	public double distance() {
		return Math.sqrt(Math.pow((this.x - 0), 2) + Math.pow((this.y - 0), 2));
	}
}
