package T56_bai3;

public class main {

	public static void minVolumeBall(Ball b[]) {
		double min = b[0].getArea();
		for (Ball ball : b) {
			if(ball.getVolume() < min)
				min = ball.getVolume();
		}
		for (Ball ball : b) {
			if(min == ball.getVolume())
				System.out.println(ball);
		}
	}
	public static void main(String[] args) {
		
		//Point2D p1 = new Point2D(2, 3);
		Point3D p2 = new Point3D(2, 4, 5);
		Point3D p3 = new Point3D(3, 4, 6);
		Point3D p4 = new Point3D(1, 2, 5);
		
		Ball b[] = new Ball[3];
		b[0] = new Ball(p2, 4);
		b[1] = new Ball(p3, 3);
		b[2] = new Ball(p4, 5);
		
		
		for (Ball ball : b) {
			System.out.println(ball.getVolume());
		}
		
		minVolumeBall(b);
		
		Box b1 = new Box(p2, p3);
		
		
		System.out.println(b1.getArea());
		System.out.println(b1.getVolume());
		System.out.println(b1);
		
		Ball1 p = new Ball1(p2, 4);
		
		System.out.println(p);
		System.out.println(p.getArea());
		System.out.println(p.getVolume());
		
//		System.out.println(b);
//		System.out.println(b.getArea());
//		System.out.println(b.getVolume());
		
	}

}
