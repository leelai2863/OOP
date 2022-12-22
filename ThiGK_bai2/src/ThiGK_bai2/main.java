package ThiGK_bai2;

public class main {

	public static String xuat(PTB2[] a) {
		String index = "";
		for(int i = 0; i<a.length; i++ ) {
			index = index + a[i].getSolution() + "\n";
		}
		return index;
	}

	public static void main(String[] args) {
		PTB2[] a = new PTB2[2];
		a[0] = new PTB2(4, 2, -2);
		a[1] = new PTB2(1, 4, 5);
		
		System.out.println(a[0].getSolution());
		System.out.println(a[0].toString());
		
		System.out.println(xuat(a));
	}

}
