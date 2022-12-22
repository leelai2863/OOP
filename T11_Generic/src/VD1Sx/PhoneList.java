package VD1Sx;

public class PhoneList {

	public static void main(String[] args) {
		Contact test;
		Contact found;
		
		Contact[] friends = new Contact[4];
		friends[0] = new Contact ("Tony", "Esme", "098-989-9999");
		friends[1] = new Contact ("Michale", "nike", "873-378-7777");
		friends[2] = new Contact ("Persie", "Nedterroy", "765-567-8888");
		friends[3] = new Contact ("Like", "Gucci", "949-444-3333");
		//những mãng khác mún xếp đc phải làm sao ???
		Sorting.selectionSort(friends);
		for(int i = 0; i < friends.length; i++)
			System.out.println(friends[i]);
		
		PhanSo[] life = new PhanSo[4];
		life[0] = new PhanSo (3, 4);
		life[1] = new PhanSo (1, 4);
		life[2] = new PhanSo (5, 4);
		life[3] = new PhanSo (3, 2);
		
		Sorting.insertionSort(life);
		for(int i = 0; i < life.length; i++)
			System.out.println(life[i]);
		
		test = new Contact ("Persie", "Nedterroy", "");
		found = (Contact) Searching.linearSearch(friends, test);
		if (found != null)
			System.out.println ("found: " + found);
		else 
			System.out.println("The contact was not found.");
		System.out.println();
		
		Sorting.selectionSort(friends);
		test = new Contact ("Like", "Gucci", "");
		found = (Contact) Searching.binarySearch(friends, test);
		if(found != null)
			System.out.println("Found: " + found);
		else 
			System.out.print("the contact was not found.");
		
		
		Circle[] c = new Circle[4];
		c[0] = new Circle(3, "red");
		c[1] = new Circle(-1, "pink");
		c[2] = new Circle(4, "blue");
		c[3] = new Circle(1.5, "red");

		System.out.println("\nKq tim kiem: " + Searching.linearSearch(c, c[3]));

		Sorting.insertionSort(c);
		for(int i = 0; i < c.length; i++)
			System.out.println(c[i]);
		System.out.println();
		
		Sorting.selectionSort(c);
		for(int i = 0; i < c.length; i++)
			System.out.println(c[i]);
		System.out.println();
		

		System.out.println("Kq tim kiem: " + Searching.binarySearch(c, c[3]));
	}

}
