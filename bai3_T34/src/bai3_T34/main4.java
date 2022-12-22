package bai3_T34;

public class main4 {

	public static void main(String[] args) {
		MyPoint v1 = new MyPoint(1,1);
		MyPoint v2 = new MyPoint(1,4);
		MyPoint v3 = new MyPoint(4,1);
		
		MyTriangle t1 = new MyTriangle(v1, v2, v3);
		System.out.println(t1);
		System.out.println(v1.distance(v2));
		System.out.println(v1.distance(v3));
		System.out.println(t1.getType());
	}
}
