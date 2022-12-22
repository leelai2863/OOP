package T56_bai2;

public class Student extends Person{
	String program;
	int year;
	double fee;
	
	public Student(String n, String ad, String p, int y, double f) {
		name = n;
		address = ad;
		program = p;
		year = y;
		fee = f;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String p) {
		program = p;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		year = y;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double f) {
		fee = f;
	}
	@Override
	public String toString() {
		return "Student[ " + super.toString() + ", program = " + program + ", year = " + year + ", fee = " + fee +"]";   
	}
}
