package Interface_btLop;

public class main {
	
	public static void main(String[] args) {
		Point p1 = new Point(3, 5);
		
		RectanglePlus p = new RectanglePlus(p1, 4, 6);
		
		System.out.println(p.getArea());
		
		RectanglePlus[] arr = new RectanglePlus[3];
		arr[0] = new RectanglePlus(p1, 3, 5);
		arr[1] = new RectanglePlus(p1, 2, 4);
		arr[2] = new RectanglePlus(p1, 1, 1);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j].isLargerThan(arr[i]) == -1) {
					RectanglePlus index = arr[i];
					arr[i] = arr[j];
					arr[j] = index;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getArea());
		}
		
		PhanSoPlus[] a = new PhanSoPlus[3];
		a[0] = new PhanSoPlus(3, 2);
		a[1] = new PhanSoPlus(3, 4);
		a[2] = new PhanSoPlus(5, 2);
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[j].isLargerThan(a[i]) == -1) {
					PhanSoPlus index = a[i];
					a[i] = a[j];
					a[j] = index;
				}
			}
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
