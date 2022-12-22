package T56_bai2;

public class Person {
	String name;
	String address;
	
	public Person() {
		
	}
	public Person(String n, String a) {
		name = n;
		address = a;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String a) {
		address = a;
	}
	public String toString() {
		return "Person[name = " + name + ", address = " + address + "]";
	}
}
