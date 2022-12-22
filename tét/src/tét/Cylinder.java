package tét;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
		super();
		this.height = 1.0;
		System.out.println("Construced a Cylinder with Cylinder()");
	}
	public Cylinder(double height) {
		super();
		this.height = height;
		System.out.println("Construced a Cylinder with Cylinder(height)");
	}
	public Cylinder(double height, double radius) {
		super(radius); //super cũng cho truyền tham số vào
		this.height = height;
		System.out.println("Construced a Cylinder with Cylinder(height, radius)");
	}
	public Cylinder(double height, double radius, String color) {
		super(radius, color); //lấy bộ khởi tạo của lớp cha ra thực hiện
		this.height = height;
		System.out.println("Construced a Cylinder with Cylinder(height, radius, color");
	}
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		return super.getArea()*height;
	}
	/*public String toString() {
		return "This is a cylinder";
	}*/
	public double getArea() {
		return 2*super.getArea() + 2*Math.PI*getRadius()*height;
	}
	public String toString() {
		return "Cylinder[" + super.toString() + ", height-" + height + "]";
	}
}
