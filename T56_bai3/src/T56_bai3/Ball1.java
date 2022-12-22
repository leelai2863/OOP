package T56_bai3;

public class Ball1 extends Point3D{
	double r;
	
	public Ball1(Point3D p, double R) {
		super(p);
		r = R;
	}
	public double getArea() {
		return 4*Math.PI*r*r;
	}
	public double getVolume() {
		return 4.0/3*Math.PI*r*r*r;
	}
	@Override
	public String toString() {
		return "Ball1 [" + super.toString() + ", r = " + r + "]";
	}

}
