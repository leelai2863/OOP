package ThiGK_bai1;

public class Point {
	int x;
	int y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	public Point(int xx, int yy) {
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
	public double distance(Point p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	public String toString() {
		return "(" + x +", " + y + ")";
	}
}
