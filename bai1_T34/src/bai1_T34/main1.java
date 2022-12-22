package bai1_T34;

public class main1 {

	public static void main(String[] args) {
		Author nhuctrieu;
		nhuctrieu = new Author("nhuctrieu", "trieusgu@edu.com", 'F');
		Book d;
		d = new Book("database", nhuctrieu, 3);
		System.out.println(d);
	}
}
