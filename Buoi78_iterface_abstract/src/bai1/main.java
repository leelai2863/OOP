package bai1;

public class main {

	public static void main(String[] args) {
		Shape c1 = new Circle(3);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		
		Rectangle r1 = new Rectangle(3, 4);
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
		
		Square s1 = new Square(4);
		System.out.println(s1.getSide());
		System.out.println(s1);
		
		Triangle t1 = new Triangle(3, 4, 2);
		System.out.println(t1.getPerimeter());
		System.out.println(t1.getPerimeter1());
		System.out.println(t1.getArea());
	}

}
