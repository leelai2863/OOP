package bai2;

public class POINT {
	double x, y;
	
	public POINT()
	{
		x = 0;
		y = 0;
	}
	public POINT(int xx, int yy)
	{
		x = xx;
		y = yy;
	}
	public POINT(double x1, double y1)
	{
		x = x1;
		y = y1;
	}
	public double distance(POINT p)
	{
		return Math.sqrt(x - p.x)*(x - p.x) + (y - p.y)*(y - p.y);
	}
	public String toString()
	{
		return "Toa do x = " + x + "y = " + y;
	}
}
