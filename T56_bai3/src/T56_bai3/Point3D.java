package T56_bai3;

public class Point3D extends Point2D {
	float z;
	
	public Point3D(Point3D p) {
		super(p.x, p.y);
		this.z = p.z;
	}
	public Point3D(float X, float Y, float Z) {
		x = X;
		y = Y;
		z = Z;
	}
	public Point3D() {
		z = 0.0f;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float Z) {
		z = Z;
	}
	public void setXYZ(float X, float Y, float Z) {
		x = X;
		y = Y;
		z = Z;
	}
	public float[] getXYZ() {
		System.out.println("(" + x + ", " + y + ", " + z +")");
		float arr[] = {this.x, this.y, this.z};
		return arr;
	}
	@Override
	public String toString() {
		return "(" + super.toString() + ", " + z + ")";
	}
}
