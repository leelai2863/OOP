package T56_bai3;

public class Ball {
	Point3D p;
	double R;

	
	public Ball(Point3D P, double r) {
		p = P;
		R = r;
	}
	public double getArea() {
		return 4*Math.PI*R*R;
	}
	public double getVolume() {
		return (4.0/3) * Math.PI * R*R*R;
	}
	@Override
	public String toString() {
		return "Ball [p=" + p + ", R=" + R + "]";
	}
}
