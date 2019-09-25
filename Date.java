public class Date{
	private int day, year; //initialize
	private String month; //initialize

	public Date() { //constructor
		month=" ";
		day=0;
		year=0;
	}

	public Date(String m, int d, int y) { //constructor overloading; accepts initial inputs
		month=m;
		day=d;
		year=y;
	}

	public void set_date(String m, int d, int y) { //mutator method
		month=m;day=d;year=y;
	}

	public void set_month(String m) { //mutator method
		month=m;
	}

	public void set_day(int d) { //mutator method
		day=d;
	}

	public void set_year(int y) { //mutator method
		year=y;
	}

	public String get_month() { //accessor method
		return month;
	}

	public int get_day() { //accessor method
		return day;
	}

	public int get_year() { //accessor method
		return year;
	}

	public String toString() { //output to string (essentially a get_date method)
			return (month+"/"+day+"/"+year);
		}


}