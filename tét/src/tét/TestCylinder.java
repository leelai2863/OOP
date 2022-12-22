package tét;

public class TestCylinder {
	public static void main(String[] args) {
		Cylinder cy1 = new Cylinder();
		System.out.println("Radius is " + cy1.getRadius() + ", Height is " + cy1.getHeight()
		+ ", Color is " + cy1.getColor() + ", Volume is " + cy1.getVolume());
		
		Cylinder cy2 = new Cylinder(5.0, 2.0);
		
		System.out.println("Radius is " + cy2.getRadius() + ", Height is " + cy2.getHeight()
		+ ", Color is " + cy2.getColor() + ", Volume is " + cy2.getVolume());
		
		System.out.println(cy2.getVolume());
		System.out.println(cy2.getArea());
		System.out.println(cy2);
		}
}
