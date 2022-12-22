package ThiGK_bai1;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(3, 4));
		points.add(new Point(5, 6));
		points.add(new Point(3, -4));
		points.add(new Point(5, -6));
		points.add(new Point(-5, 4));
		
		PolyLine p = new PolyLine(points);
		
		System.out.println(p.toString());
		System.out.println(p.getLength());
		System.out.println(p.PerimeterPolyLine());
		System.out.println(p.AreaPolyline());

	}

}
