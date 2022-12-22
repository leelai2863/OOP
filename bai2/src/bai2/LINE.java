package bai2;

public class LINE {
	POINT p1, p2;
	
	public LINE()
	{
		p1 = new POINT();
		p2 = new POINT();
	}
	public LINE(POINT A, POINT B)
	{
		p1 = new POINT(A.x, A.y);
		p2 = new POINT(B.x, B.y);
	}
	public LINE(int x1, int y1, int x2, int y2)
	{
		p1 = new POINT(x1, y1);
		p2 = new POINT(x2, y2);
	}
	public double distance()
	{
		return p1.distance(p2);
	}
	public POINT intersect(LINE l)
	{
		double a1, b1, a2, b2;

		POINT  p = new POINT(9999999, 9999999);
		a1 = 1.0*(p1.y - p2.y)/(p1.x - p2.x);
		a2 = 1.0*(l.p1.y - l.p2.y)/(l.p1.x - l.p2.x);
		b1 = p1.y - a1*p1.x;
		b2 = l.p1.y - a2*l.p1.x;
		if(a1 != a2)
		{
			double tdx = 1.0*(-b1 + b2) / (a1 - a2);
			double tdy = a1*tdx + b1;
			p.x = tdx;
			p.y = tdy;
			
			return p;
		}
		else 
			return p;
	}
	
	public boolean inside(POINT p)
	{
		double a, b;
		a = 1.0*(p1.y - p2.y)/(p1.x - p2.x);
		b = p1.y - a*p1.x;
		if(p.y == (a*p.x + b))
			return true;
		else 
			return false;
	}
	public double distance(POINT p)
	{
		POINT n = new POINT();
		//tim vetco phap tuyen
		n.x = -1 * (p2.y - p1.y);
		n.y = p2.x - p1.x;
		double c = -1*n.x * p1.x + n.y * -1 * p1.y;
		double d =  Math.abs(n.x * p.x + n.y * p.y + c) / Math.sqrt(n.x * n.x + n.y * n.y);
		return d;
	}
	public String toString()
	{
		double a, b;
		a = 1.0*(p1.y - p2.y)/(p1.x - p2.x);
		b = p1.y -a*p1.x;
		return "y = " + a + "*x + "+ b;
	}
}
