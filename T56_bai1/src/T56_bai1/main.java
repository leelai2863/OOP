package T56_bai1;

public class main {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		
		Cylinder c2 = new Cylinder(3, 4);
		
		System.out.println(c1.getArea());
		System.out.println(c2.getVolume());
	}

}
