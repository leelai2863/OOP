package bai2_T34;
import java.util.*;
public class main2 {

	public static void main(String[] args) {
		Author[] a1 = new Author[10];
		Author[] a2 = new Author[10];
		a1[0] = new Author("aa", "bb", 'm');
		a1[1] = new Author("aB", "bB", 'f');
		a2[0] = new Author("bB", "cC", 'f');
		a2[1] = new Author("BB", "cc", 'f');
		
		Book2 b[] = new Book2[3];
		b[0] = new Book2("Aabb", a1, 3, 3);
		b[1] = new Book2("AaBb", a2, 3, 3);
		
		System.out.println(b[0]);
		
		String tg = "Lai";
		b = b[0].deleteTG(b, tg);
		
		//String tg = "aB";
		//System.out.println(b[0].author[0].name);
		//b = b[0].deleteBook(b, tg);
		//System.out.println(b[1].author[1]);
		//System.out.println(b[1]);
	}

}
