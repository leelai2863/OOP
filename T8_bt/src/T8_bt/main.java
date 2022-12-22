package T8_bt;

public class main {

	public static void main(String[] args) {
		Teacher Tri = new Teacher("Tri", "phuoc long B");
		
		Tri.addCourse("CSDL");
		Tri.addCourse("Giai Tich 2");
		Tri.addCourse("Tieng anh");
		Tri.addCourse("CTDL");
		
		Tri.printCourse();
		System.out.println(Tri);
		
	}
}
