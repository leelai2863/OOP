package T8_bt;

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
		return "Name = " + name + ", (address = " + address + ")";
	}
}
