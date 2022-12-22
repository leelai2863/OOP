package tét;

public class Testjava {
	static int x = 0;
	int  y = 0;
	public Testjava()
	{
		x++;
		y++;
	}
	public static void main(String arg[])
	{
		Testjava a, b, c;
		a = new Testjava();
		System.out.println("x = " + Testjava.x + "y = " + a.y );
		b = new Testjava();
		System.out.println("x = " + Testjava.x +"y = " + b.y );
		c = new Testjava();
		System.out.println("x = " + Testjava.x +"y = " + c.y );
	}
}
