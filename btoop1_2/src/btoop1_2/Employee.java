package btoop1_2;

public class Employee {
	int id;
	String firstName;
	String lastName;
	int salary;
	
	public Employee(int a, String b, String c, int d) {
		id = a;
		firstName = b;
		lastName = c;
		salary = d;
	}
	public int getID() {
		return this.id;
	}
	public String getFirestName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getName() {
		return this.firstName + lastName; 
	}
	public int setSalary() {
		return this.salary;
	}
	public void setSalary(int d) {
		salary = d;
	}
	public int getAnnualSalary() {
		return this.salary * 12;
	}
	public int raiseSalary(int percent) {
		return this.salary + salary*percent/100;
	}
	public String toString() {
		return "Employee[" + id + ", " + firstName + lastName + ", " + salary + "]";
	}
}
