public class Midterm_Time_demo {
/*
main: 
	1. make an object of Midterm_Time class
	2. Use this object to create another object (use copy constructor)
	3. Display both objects
	4. Invoke set methods for all instance variables and to test if the validations work
	5. Display the modified object
	6. Invoke addHour() with any object
	7. Invoke addMinute() with any object
	8. Invoke addSecond() with any object
	9. Display the modiied object
*/
	public static void main(String [] args) {
		Midterm_Time t1 = new Midterm_Time(10,40,30);
		Midterm_Time t2 = new Midterm_Time(t1);
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

	/* Exam example
		Midterm_Time t1 = new Midterm_Time(20,40,50);
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
		Midterm_Time t2 = new Midterm_Time(t1);
		System.out.println("[t2] " + t2.toString());
		*/
	}
}