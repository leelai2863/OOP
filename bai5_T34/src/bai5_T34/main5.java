package bai5_T34;

public class main5 {

	public static void main(String[] args) {
		Customer c1 = new Customer(1, "game", 3);
		//System.out.println(c1);
		
		Invoice i1 = new Invoice(1, c1, 2000);
		System.out.println(i1.getAmountAfterDiscount());
	}

}
