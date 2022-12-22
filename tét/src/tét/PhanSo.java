package tét;

public class PhanSo {
	int ts, ms;
	public PhanSo() {
		ts = 0;
		ms = 1;
	}
	public PhanSo(int t, int m) {
		ts = t;
		ms = m;
	}
	public PhanSo cong(PhanSo ps) {
		PhanSo kq = new PhanSo();
		kq.ts = ts * ps.ms  + ms * ps.ts;
		kq.ms = ms * ps.ms ;
		return kq;
	}
	public String toString() {
			return "phan so " + ts + "/" + ms;
	}
}
