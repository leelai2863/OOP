package ThiGK_bai1;
import java.util.ArrayList;
import java.util.List;

public class PolyLine {
	List <Point> points = new ArrayList<Point>();
	
	public PolyLine() {
		this.points = new ArrayList<Point>();
	}
	
	public PolyLine(List<Point> points) {
		this.points = points;
	}
	
	public void appendPoint(int x, int y) {
		 this.points.add(new Point(x, y));
	}
	
	public void appendPoint(Point p) {
		this.points.add(p);
	}

	@Override
	public String toString() {
		return points.toString();
	}
	
	public double getLength() {
		double l = 0;
		for(int i = 0; i < points.size() -1; i++) {
			l = l + points.get(i).distance(points.get(i + 1));
		}
		return l;
	}
	public double PerimeterPolyLine() {
		if(points.size() < 2)
			return 0;
		else {
			double sum = 0;
			for(int i = 0; i < points.size() - 1; i++) {
				sum = sum + points.get(i) .distance(points.get(i+1));
			}
			sum = sum + points.get(0).distance(points.get(points.size() - 1));
			return sum;
		}
	}
	public double AreaPolyline() {
		if(points.size() < 2) {
			return 0;
		}
		else {
			double sumX = 0;
			for(int i = 0; i < points.size() - 1; i++)
				sumX = sumX + points.get(i).x * points.get(i+1).y;
			double sumY = 0;
			for(int i = 0; i < points.size() - 1; i++)
				sumY = sumY + points.get(i).y * points.get(i+1).x;
			double area = (Math.abs(sumX - sumY))/2;
			return area;
		}
	}
}
