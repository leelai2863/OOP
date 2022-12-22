package T56_bai2;

public class Staff extends Person{
	String school;
	double pay;
	
	public Staff(String n, String ad, String sc, double p) {
		name = n;
		address = ad;
		school = sc;
		pay = p;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String sc) {
		school = sc;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double p) {
		pay = p;
	}
	@Override
	public String toString() {
		return "Staff[" +  super.toString() + ", school = " + school + "pay = " + pay;
	}
}
