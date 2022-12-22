package VD1Sx;

public class PhanSo implements Comparable{
	double ts, ms;
	
	public PhanSo(double tuso, double mauso) {
		ts = tuso;
		ms = mauso;
	}
	public String toString() {
		return ts + "/" + ms;
	}
	public double getMauSo() {
		return ms;
	}
	public double getTuSo() {
		return ts;
	}
	public boolean equals (Object ps) {
		return (this.ts == ((PhanSo)ps).getTuSo()) && (this.ms == ((PhanSo)ps).getMauSo());
	}
	public int compareTo(Object ps) {
		int result;
		double psTuSo = ((PhanSo)ps).getTuSo();
		double psMauSo = ((PhanSo)ps).getMauSo();
		
		if(psTuSo/psMauSo > ts/ms)
			result = 1;
		else if(psTuSo/psMauSo == ts/ms) 
			result = 0;
		else
			result = -1;
		return result;
	}
}
