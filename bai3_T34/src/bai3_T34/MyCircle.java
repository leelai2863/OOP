package bai3_T34;

public class MyCircle {
	MyPoint center;
	int radius;
	
	public MyCircle() {
		radius = 1;
		MyPoint center = new MyPoint(0,0);
	}
	public MyCircle(int xx, int yy, int r) {
		center.x = xx;
		center.y = yy;
		radius = r;
	}
	public MyCircle(MyPoint c, int r) { 
		center = c;
		radius = r;
	}
	public int setRadius() {
		return this.radius;
	}
	public void setRadius(int r) {
		radius = r;
	}
	public MyPoint getCenter() {
		return this.center;
	}
	public void setCenter(MyPoint c) {
		center = c;
	}
	public int getCenterX() {
		return this.center.x;
	}
	public void setCenterX(int x) {
		center.x = x;
	}
	public int getCenterY() {
		return this.center.y;
	}
	public void setCenterY(int y) {
		center.y = y;
	}
	public int[] getCenterXY() {
		return new int[] {this.center.x, this.center.y};
	}
	public void setCenterXY(int x, int y) {
		center.x = x;
		center.y = y;
	}
	public void xuat(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public String toString() {
		return "MyCircle[" + radius + "," + center + "]";  
	}
	public double getArea() {
		return this.radius*radius*3.14;
	}
	public double getCircumference() {
		return this.radius*2*3.14;
	}
	public double distance(MyCircle another) {
		return Math.sqrt(Math.pow(center.x - another.center.x, 2) + Math.pow(center.y - another.center.y, 2)); 
	}
}
