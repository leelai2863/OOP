package T6_new;

public class PolyLine {
	Point[] points;
	public PolyLine() {
		this.points = new Point[1];
		this.points[0] = new Point(0, 0);
	}
	
	public PolyLine(Point[] list) {
		this.points = list;
	}
	
	public void appendPoint(int x, int y) {
		Point p = new Point(x, y);
		Point[] index = new Point[points.length + 1];
		for(int i = 0; i< index.length; i++) {
			index[i] = points[i];
		}
		index[points.length] = p;
		points = index;
	}
	
	public void appendPoint(Point p) {
		Point[] index = new Point[points.length + 1];
		for(int i = 0; i< index.length; i++) {
			index[i] = points[i];
		}
		index[points.length] = p;
		points = index;
	}

	@Override
	public String toString() {
		String index = "{";
		for(int i=0; i<points.length; i++) {
			index = index + "(" + points[i].x + ", " + points[i].y + "), ";
		}
		index = index + "}";
		return index;
	}
	
	public double getLength() {
		double l = 0;
		for(int i = 0; i < points.length -1; i++) {
			l = l + points[i].distance(points[i+1]);
		}
		return l;
	}
	public double PerimeterPolyLine() {
		if(points.length < 2)
			return 0;
		else {
			double sum = 0;
			for(int i = 0; i < points.length - 1; i++) {
				sum = sum + points[i] .distance(points[i+1]);
			}
			return sum;
		}
	}
	public double AreaPolyline() {
		if(points.length < 2) {
			return 0;
		}
		else {
			double sumX = 0;
			for(int i = 0; i < points.length - 1; i++)
				sumX = sumX + points[i].x * points[i+1].y;
			double sumY = 0;
			for(int i = 0; i < points.length - 1; i++)
				sumY = sumY + points[i].y * points[i+1].x;
			double area = (Math.abs(sumX - sumY))/2;
			return area;
		}
	}
}
