package Interface_btLop;

public class PhanSoPlus implements Relatable{
	float ts, ms;
	
	public PhanSoPlus() {
		ts = 0;
		ms = 0;
	}
	public PhanSoPlus(float a, float b) {
		ts = a;
		ms = b;
	}
	public float getTs() {
		return ts;
	}
	public void setTs(float ts) {
		this.ts = ts;
	}
	public float getMs() {
		return ms;
	}
	public void setMs(float ms) {
		this.ms = ms;
	}
	@Override
	public String toString() {
		return "PhanSoPlus [ts=" + ts + ", ms=" + ms + "]";
	}
	public int isLargerThan(Relatable other) {
		PhanSoPlus otherP = (PhanSoPlus)other;
		if(this.getTs() / this.getMs() > otherP.getTs() / otherP.getMs())
			return -1;
		else if (this.getTs() / this.getMs() == otherP.getTs() / otherP.getMs())
			return 0;
		else 
			return 0;
	}
}
