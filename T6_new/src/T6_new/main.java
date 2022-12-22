package T6_new;

public class main {

	public static void main(String[] args) {
		Point p1 = new Point(2, 4);
		Point p2 = new Point(2, 6);
		Point p3 = new Point(3, 7);
		Point list[] = {p1, p2, p3};
		PolyLine PL1 = new PolyLine(list);
		System.out.println(PL1.getLength());
		
		System.out.println(PL1.PerimeterPolyLine());
		System.out.println(PL1.AreaPolyline());
	}

}
