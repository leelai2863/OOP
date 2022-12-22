package bai3_T34;

public class main3 {

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(1,2);
		MyPoint p2 = new MyPoint(-3,4);
		System.out.println(p1.distance(p2));
		
		MyCircle c1 = new MyCircle(p1, 2);
		int center[] = new int[2];
		center = c1.getCenterXY();
		c1.xuat(center);
	}
}
