public class Midterm_Time_alt {
	private int hour;
	private int minute;
	private int second;

/*
constructor 1: a copy constructor; 
Parameters
*/
	public Midterm_Time_alt(Midterm_Time_alt t) {
		hour = t.hour;
		minute = t.minute;
		second = t.second;
	}

/*
constructor 2 (alternative): a constructor that takes hour, minute, and second as parameters and assigns these values to respective variables; ADJUSTS invalid inputs 
Parameters: hour, minute, second
Return type: none
*/
	public Midterm_Time_alt(int h, int m, int s) {
		/*
		if (h>=0 && h<24)
			hour = h;
		else if (h>24) {
			do {
				h=h-24;
			} while (h)
			
		}*/
		while (s>=60) {
			s=s-60;
			m++;
		}
		while (m>=60) {
			m=m-60;
			h++;
		}
		while (h>=24) {
			h=h-24;
		}

		if (h>=0 && h<24)
			hour = h;
		else hour=0;
		if (m>=0 && m<60)
			minute = m;
		else minute=0;
		if (s>=0 && s<60)
			second = s;
		else second=0;
	}

/*
getHour: return hours
Parameters: none
Return type: int
*/
	public int getHour() {
		return hour;
	}

/*
getMinute: return minutes
Parameters: none
Return type: int
*/
	public int getMinute() {
		return minute;
	}

/*
getSecond: return seconds
Parameters: none
Return type: int
*/
	public int getSecond() {
		return second;
	}

/*
setHour (alternative): set hours; ADJUST invalid input
Parameters: int h
Return type: none
*/
	public void setHour(int h) {
		while (h>=24) {
			h=h-24;
		}
		if (h>=0 && h<24)
			hour = h;
		else hour=0;
	}

/*
setMinute (alternative): set minutes; ADJUST invalid input
Parameters: int m
Return type: void
*/
	public void setMinute(int m) {
		while (m>=60) {
			m=m-60;
			hour++;
		}
		while (hour>=24) {
			hour=hour-24;
		}
		if (m>=0 && m<60)
			minute = m;
		else minute=0;
	}

/*
setSecond (alternative): set seconds; ADJUST invalid input
Parameters: int s
Return type: none
*/
	public void setSecond(int s) {
		while (s>=60) {
			s=s-60;
			minute++;
		}
		while (minute>=60) {
			minute=minute-60;
			hour++;
		}
		while (hour>=24) {
			hour=hour-24;
		}
		if (s>=0 && s<60)
			second = s;
		else second=0;
	}

/*
addHour: add specified number of hours; ADJUSTS excessive input; IGNORES negative input
Parameters: int h
Return type: none
*/
	public void addHour(int h) {
		if (h>=0) {
			hour += h;
			while (hour>=24) {
				hour=hour-24;
			}
		}
	}

/*
addMinute: add specified number of minutes; ADJUSTS excessive input; IGNORES negative input
Parameters: int m
Return type: none
*/
	public void addMinute(int m) {
		if (m>=0) {
			minute += m;
			while (minute>=60) {
				minute=minute-60;
				hour++;
			}
			while (hour>=24) {
				hour=hour-24;
			}
		}
	}

/*
addSecond: add specified number of seconds; ADJUSTS excessive input; IGNORES negative input
Parameters: int s
Return type: none
*/
	public void addSecond(int s) {
		if (s>=0) {
			second += s;
			while (second>=60) {
				second=second-60;
				minute++;
			}
			while (minute>=60) {
				minute=minute-60;
				hour++;
			}
			while (hour>=24) {
				hour=hour-24;
			}
		}
	}

/*
toString: print time
Parameters: none
Return type: String
*/
	public String toString() {
		return("Time is: " + hour + ":" + minute + ":" + second);
	}


/*
main: 
	1. make an object of Time class
	2. Use this object to create another object (use copy constructor)
	3. Display both objects
	4. Invoke set methods for all instance variables and to test if the validations work
	5. Display the modified object
	6. Invoke addHour() with any object
	7. Invoke addMinute() with any object
	8. Invoke addSecond() with any object
	9. Display the modiied object
*/

/*	public static void main(String [] args) {
		Time t1 = new Time(10,40,30);
		Time t2 = new Time(t1);
		System.out.println("[t1] " + t1.toString());
		System.out.println("[t2] " + t2.toString());
		System.out.println();
		t1.setHour(12);
		t1.setMinute(59);
		t1.setSecond(50);
		t2.setHour(23);
		t2.setMinute(19);
		t2.setSecond(5);
		System.out.println("MODIFIED [t1] " + t1.toString());
		System.out.println("MODIFIED [t2] " + t2.toString());
		System.out.println();
		t2.addHour(2);
		t2.addMinute(20);
		t2.addSecond(65);
		System.out.println("MODIFIED [t2] " + t2.toString());	

	 Exam example
		Time t1 = new Time(20,40,50);
		System.out.println("[t1] " + t1.toString());
		t1.addHour(2);
		System.out.println("[t1] " + t1.toString());
		t1.addHour(4);
		System.out.println("[t1] " + t1.toString());
		t1.addMinute(30);
		System.out.println("[t1] " + t1.toString());
		t1.addSecond(45);
		System.out.println("[t1] " + t1.toString());
		System.out.println();
		Time t2 = new Time(t1);
		System.out.println("[t2] " + t2.toString());
	}*/
}
