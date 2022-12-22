package T13_bt;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int max = 2;
		int min = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Shape[] s = new Shape[100];
		
		
		for(int i = 0; i < n; i++) {
			int random = (int)Math.floor(Math.random()*(max-min+1)+min);
			System.out.println(random);
			if(random == 0)
				s[i] = new Circle(3);
			else if(random == 1)
				s[i] = new Rectangle(2, 6);
			else if(random == 2)
				s[i] = new Triangle(3, 5, 1);
			System.out.println(s[i]);
		}
		
		double sum = 0;
		for(int i = 0; i < n; i ++) {
			sum = sum + s[i].getArea();
		}
	}

}
