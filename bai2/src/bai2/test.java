package bai2;

public class test {

	public static void main(String[] args) {
		POINT p1, p2, p3;
		p1 = new POINT(3, 4);
		p2 = new POINT(-1, 2);
		p3 = new POINT(1, 2);
		LINE l1 = new LINE(p1, p2);
		LINE l2 = new LINE(1, 2, -2, -3);
		System.out.println(l1.distance(p3));
		System.out.println(l1.interesct(l1));
		System.out.println(l1.inside(p3));
	}
}