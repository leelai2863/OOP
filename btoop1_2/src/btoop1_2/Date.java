package btoop1_2;

public class Date {
	int day;
	int month;
	int year;
	
	public Date(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}
	public int getDay() {
		return this.day;
	}
	public int getmonth() {
		return this.month;
	}
	public int getYear() {
		return this.year;
	}
	public void setDay(int d) {
		day = d;
	}
	public void setMonth(int m) {
		month = m;
	}
	public void setYear(int y) {
		year = y;
	}
	public void setDate(int dd, int mm, int yy) {
		day = dd;
		month = mm;
		year = yy; 
	}
	public boolean checkYear(int year) {
		 if (year % 4==0)
			 return true;
		 else
			 return false;
	}
	public Date nextDay() {
		if(day > 31 || day == 0) {
			System.out.print("khong ton tai ngay ");
			return this;
		}
		else {
			day = day + 1;
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
				if(day ==32)
				{
					day = 1;
					++month;
				}
			}
			else if (month == 12 ) {
				if(day == 32) {
					day = 1;
					month = 1;
					++year;
				}
			}
	        else if (month == 4 || month == 6 || month == 9 || month == 11 ) {
	        	if(day == 31) {
	        		day = 1;
		        	++month;
	        	}
	        } else if (month == 2) {
	        	if (checkYear(year) ){
	        		if(day == 30) {
		        		day = 1;
		        		++month;
	        		}
	        	} else {
	        		if(day == 29) {
	        			day = 1;
	        			++month;
	        		}
	        	}
	        }
		}
		if(!checkYear(year) && month == 2 && day >= 29) {
			System.out.print("khong ton tai ngay ");
			return this;
		}
		return this;
	}
	public String toString() {
			if(month < 10) {
				if(day < 10)
					return year+"/0"+month+"/0"+day;
				else
					return year+"/0"+month+"/"+day;
			}
			else
				if(day < 10)
					return year+"/"+month+"/0"+day;
				else
					return year+"/"+month+"/"+day;
	}
}
