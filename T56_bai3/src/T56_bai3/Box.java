package T56_bai3;

public class Box {
	Point3D p1, p2;
	
	public Box(Point3D P1, Point3D P2) {
		p1 = P1;
		p2 = P2;
	}
	public double getArea() {
		return (Math.abs(p1.getX() - p2.getX()) + (p1.getY() - p2.getY()))*2*Math.abs(p1.getZ() - p2.getZ())+2*Math.abs(p1.getX() - p2.getX())*Math.abs(p1.getY() - p2.getY());
	}
	public double getVolume() {
		return Math.abs(p1.getX()-p2.getX()) * Math.abs(p1.getY() - p2.getY()) * Math.abs(p1.getZ() - p2.getZ());
	}
	@Override
	public String toString() {
		return "Box [p1=" + p1 + ", p2=" + p2 + "]";
	}
}
