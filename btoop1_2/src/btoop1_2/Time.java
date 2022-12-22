package btoop1_2;

public class Time {
	int hour;
	int minute;
	int second;
	
	private boolean timeCheck(int h, int m, int s) {
		if (h >= 0 && h <= 23 && m >= 0 && m < 60 && s >=0 && s <60) 
			return true;
		else
			return false;
	}
	public Time(int h, int m, int s) {
		if(timeCheck(h, m, s)) {
			hour = h; 
			minute = m ;
			second = s ;
		}
		else {
			System.out.println("wrong input");
		}		
	}
	public int getHour() {
		return this.hour;
	}
	public int getMinute() {
		return this.minute;
	}
	public int getSecond() {
		return this.second;
	}
	public void setHour(int hh) {
		hour = hh;
	}
	public void setMinute(int mm) {
		minute = mm;
	}
	public void setSecond(int ss) {
		second = ss;
	}
	public void setTime(int hh, int mm, int ss) {
		hour = hh;
		minute = mm;
		second = ss;
	}
	public String toString() {
		if(hour < 10) {
			if(minute < 10) {
				if(second < 10)
					return "0"+hour+":0"+minute+":0"+second;
				else
					return "0"+hour+":0"+minute+":"+second;
			}
			else
				if(second < 10)
					return "0"+hour+":"+minute+":0"+second;
				else
					return "0"+hour+":"+minute+":"+second;
		}
		else
		{
			if(minute < 10) {
				if(second < 10)
					return hour+":0"+minute+":0"+second;
				else
					return hour+":0"+minute+":"+second;
			}
			else
				if(second < 10)
					return hour+":"+minute+":0"+second;
				else
					return hour+":"+minute+":"+second;
		}
	}
	public Time nextSecond() {
		++second;
		if(second == 60) {
			second = 0;
			++minute;
			if(minute == 60) {
				minute = 0;
				++hour;
				if(hour == 24)
					hour = 0;
			}
		}
		return this;
	}
	public Time previousSecond() {
		--second;
		if(second == -1) {
			second = 59;
			--minute;
			if(minute == -1) {
				minute = 59;
				--hour;
				if(hour == -1)
					hour = 23;
			}
		}
		return this;
	}
}
