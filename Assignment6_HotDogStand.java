/*
Author: Chase Darlington
Date: 10/11/2019
*/

// You operate several hot dog stands distributed throughout town. 
// Define a class named HotDogStand that has an instance variable for 
// the hot dog stand’s ID number and an instance variable for how many 
// hot dogs the stand has sold that day. Create a constructor that allows 
// a user of the class to initialize both values.

// Also create a method named justSold that increments by one the number of 
// hot dogs the stand has sold. The idea is that this method will be invoked 
// each time the stand sells a hot dog so that you can track the total number 
// of hot dogs sold by the stand. Add another method that returns the number 
// of hot dogs sold.

// Finally, add a static variable that tracks the total number of hot dogs 
// sold by all hot dog stands and a static method that returns the value 
// in this variable.

// Write a main method to test your class with at least three hot dog stands that each sell a variety of hot dogs.

public class Assignment6_HotDogStand {
	private int id; //hot dog stand id number; starts with 1
	private int sales_today; //hot dogs sold, specific to each stand (each HotDogStand object)
	private static int total_sales_today; //hot dogs sold across all stands (static)

/*
HotDogStand: constructor, automatically sets the id and sales to default if no input is entered or available
Parameters: none
Return Type: none
*/
	public Assignment6_HotDogStand() {
		id=0; //Hot dog stand 1
		sales_today=0;
	}

/*
HotDogStand: constructor, accepts id and sets sales to 0
Parameters: int id
Return Type: none
*/
	public Assignment6_HotDogStand(int id) { //constructor overloading
		this.id = id;
		sales_today = 0;
	}

/*
HotDogStand: constructor, accepts id and sales
Parameters: int id, int sales_today
Return Type: none
*/
	public Assignment6_HotDogStand(int id, int sales_today) { //constructor overloading
		this.id = id;
		this.sales_today = sales_today;
		total_sales_today += sales_today;
	}

/*
setId: set id
Parameters: int id
Return Type: none
*/
	public void setId(int id) {
		this.id = id;
	}

/*
setSalesToday: set today's sales, specific to each stand (each HotDogStand object)
Parameters: int sales_today
Return Type: none
*/
	public void setSalesToday(int sales_today) {
		this.sales_today = sales_today;
		total_sales_today += sales_today;
	}

/*
getId: return id
Parameters: none
Return Type: int
*/
	public int getId() {
		return id;
	}

/*
getSalesToday: return today's sales, specific to each stand (each HotDogStand object)
Parameters: none
Return Type: int
*/
	public int getSalesToday() {
		return sales_today;
	}

/*
getTotalSalesToday (static): return total sales today, across all stands (all HotDogStand objects)
Parameters: none
Return Type: int
*/
	public static int getTotalSalesToday() {
		return total_sales_today;
	}

/*
justSold: increments by one the number of hot dogs the stand has sold. This method will be invoked 
	each time the stand sells a hot dog so that you can track the total number 
	of hot dogs sold by the stand.
Parameters: none
Return Type: none
*/
	public void justSold() {
		sales_today++;
		total_sales_today++;
	}

	public String toString() {
		return ("Stand " + id + ": " + sales_today + " Hot dogs sold");
	}

	public static void main(String [] args) { 
		Assignment6_HotDogStand stand1 = new Assignment6_HotDogStand();
		stand1.setSalesToday(400);
		stand1.setId(1);
		Assignment6_HotDogStand stand2 = new Assignment6_HotDogStand(2);
		stand2.justSold();
		stand2.justSold();
		stand2.justSold();
		stand2.justSold();
		stand2.justSold();
		Assignment6_HotDogStand stand3 = new Assignment6_HotDogStand(3,300);
		stand3.justSold();

		System.out.println("Stand " + stand1.getId() + ": " + stand1.getSalesToday() + " hot dogs sold");
		System.out.println("Stand " + stand2.getId() + ": " + stand2.getSalesToday() + " hot dogs sold");
		System.out.println("Stand " + stand3.getId() + ": " + stand3.getSalesToday() + " hot dogs sold");
		System.out.println("Total: " + getTotalSalesToday() + " hot dogs sold");

	}


}
