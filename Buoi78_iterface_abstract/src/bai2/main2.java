package bai2;

public class main2 {

	public static void main(String[] args) {
		Movable m1 = new MovablePoint(4, 6, 10, 5);
		System.out.println(m1);
		m1.moveDown();
		System.out.println(m1);
		
		Movable m2 = new MovableCircle(2, 1, 2, 20, 20);
		System.out.println(m2);
		m2.moveDown();
		System.out.println(m2);
		
		//bai 3
		Movable m3 = new MovableRectangle(2, 1, 2, 20, 20, 12);
		System.out.println(m3);
		m3.moveDown();
		System.out.println(m3);

	}

}
