package practice2;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
		if(this.day < 1)
			this.isValid = false;
		
		switch(this.month) {
		case 1: case 3:	case 5:	case 7:	case 8:	case 10:	case 12:
			if(this.day > 31)
				this.isValid = false;
			break;
		case 4:	case 6:	case 9:	case 11:
			if(this.day > 30)
				this.isValid = false;
			break;
		case 2:
			if(this.year % 400 == 0) {
				if(this.day > 29)
					this.isValid = false;
				break;
			}
			else if(this.year % 100 == 0) {
				if(this.day > 28)
					this.isValid = false;
				break;
			}
			else if(this.year % 4 == 0) {
				if(this.day > 29)
					this.isValid = false;
				break;
			}
			else {
				if(this.day > 28)
					this.isValid = false;
				break;
			}
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
		if(this.month < 1 || this.month > 12)
			this.isValid = false;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
		if(this.year < 1)
			this.isValid = false;
	}
	
	public MyDate(int day, int month, int year) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}	
	
	public String isValid() {
		if(this.isValid)
			return "유효한 날짜입니다.";
		else
			return "유효하지 않은 날짜입니다.";
	}
	
}
