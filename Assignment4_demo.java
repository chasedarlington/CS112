import java.util.Scanner; //import scanner package

public class Assignment4_demo { //create class

	public static void main(String [] args) { //declare main method
	Scanner input = new Scanner(System.in); //invoke Scanner class; allocate memory for the instance variables of Scanner class
	boolean x;

	float miles; //initialize public miles variable
	Assignment4_Odometer odo = new Assignment4_Odometer(); //invoke Odometer class constructor and allocate memory for the instance variables of Odometer class
	/* TESTING ONLY
	System.out.println(); //print spacing
	System.out.println("Fuel efficiency (mpg): " + odo.getMpg()); //implement accessor method for mpg and print (confirm constructor works)
	System.out.println("Odometer: " + odo.getOdometer()); //implement accessor method and print (confirm constructor works)
	System.out.println("Total fuel used: " + odo.getFuelUsed()); //implement accessor method and print (confirm constructor works)
	System.out.println("Trip odometer: " + odo.getTrip()); //implement accessor method and print (confirm constructor works)
	System.out.println("Trip fuel used: " + odo.getTripFuel()); //implement accessor method and print (confirm constructor works)
	*/
	System.out.println(); //print spacing
	System.out.print("Input initial fuel efficiency (mpg): "); //print request for mpg input
	odo.setMpg(input.nextFloat()); //accept input and set mpg variable
	System.out.print("Input initial odometer: "); //print request for odometer/mileage
	odo.setOdometer(input.nextFloat()); //accept input and set odometer variable 
	System.out.print("Input initial trip odometer: "); //print request for trip odometer
	odo.setTrip(input.nextFloat()); //accept input and set trip odometer variable 
	odo.tripFuel();
	odo.fuelUsed();
	System.out.println(); //print spacing
	System.out.println("Fuel efficiency (mpg): " + odo.getMpg()); //implement accessor method and print initial mpg
	System.out.println("Odometer: " + odo.getOdometer()); //implement accessor method and print initial odometer
	System.out.println("Total fuel used: " + odo.getFuelUsed()); //implement accessor method and print initial fuel used (zeroed out)
	System.out.println("Trip odometer: " + odo.getTrip()); //implement accessor method and print trip odometer
	System.out.println("Trip fuel used: " + odo.getTripFuel()); //implement accessor method and print trip fuel used


	for (int i = 1 ; ; i++) { //for loop start with 1, increment by 1
		System.out.println();
		System.out.print("Input Trip " + i + " miles: "); //print request for trip # miles
		odo.setTrip(input.nextFloat()); //collect input and implement mutator method to adjust trip odometer variable
		System.out.print("Input Trip " + i + " mpg: "); //print request for trip # mpg
		odo.setMpg(input.nextFloat()); //collect input and implement mutator method to adjust mpg variable
		odo.odometer(); //calculate new odometer 
		odo.tripFuel(); //calculate trip fuel used
		odo.fuelUsed(); //calculate total fuel used

		System.out.println("\t" + "Fuel efficiency (mpg): " + odo.getMpg()); //implement accessor method and print initial mpg
		System.out.println("\t" + "Odometer: " + odo.getOdometer()); //implement accessor method and print initial odometer
		System.out.println("\t" + "Total fuel used: " + odo.getFuelUsed()); //implement accessor method and print initial fuel used (zeroed out)
		System.out.println("\t" + "Trip odometer: " + odo.getTrip()); //implement accessor method and print trip odometer
		System.out.println("\t" + "Trip fuel used: " + odo.getTripFuel()); //implement accessor method and print trip fuel used
		odo.resetTrip();

		System.out.print("\n\t" + "Reset odometer (true or false)? ");
		if (input.nextBoolean() == true)
			odo.resetOdometer();
		System.out.print("\t" + "Another trip (true or false)? ");
		if (input.nextBoolean() == false)
			break;
		}
		System.out.println();


		Assignment4_StudentRecord sco = new Assignment4_StudentRecord(); //invoke StudentScore class constructor and allocate memory for the instance variables of StudentScore class
		x = false;
		do {
			System.out.print("Input Quiz 1 points: ");
			if (sco.setQuiz1(input.nextInt())==false) {
				System.out.println("ERROR: INCORRECT INPUT");
				x = false;
				}
			else 
				x = true;
			} while (x==false);
		do {
			System.out.print("Input Quiz 2 points: ");
			if (sco.setQuiz2(input.nextInt())==false) {
				System.out.println("ERROR: INCORRECT INPUT");
				x = false;
				}
			else 
				x = true;
			} while (x==false);
		do {
			System.out.print("Input Quiz 3 points: ");
			if (sco.setQuiz3(input.nextInt())==false) {
				System.out.println("ERROR: INCORRECT INPUT");
				x = false;
				}
			else 
				x = true;
			} while (x==false);
		do {
			System.out.print("Input Midterm points: ");
			if (sco.setMidterm(input.nextInt())==false) {
				System.out.println("ERROR: INCORRECT INPUT");
				x = false;
				}
			else 
				x = true;
			} while (x==false);
		do {
			System.out.print("Input Final points: ");
			if (sco.setFinal(input.nextInt())==false) {
				System.out.println("ERROR: INCORRECT INPUT");
				x = false;
				}
			else 
				x = true;
			} while (x==false);
		System.out.println(sco.toString());

		x = false;
		Assignment4_Temperature temp = new Assignment4_Temperature();//invoke Temperature class constructor and allocate memory for the instance variables of Temperature class
		float comparison_t; //initialize public comparison variables
		char comparison_sc; //initialize public comparison variables
		do {
			System.out.println();	
			System.out.print("Input temperature 1: "); //print request for input
			temp.setTemp(input.nextFloat()); //collect float input and set temperature in Temperature class
			System.out.print("Input scale for temperature 1 (C for Celsius, F for Fahrenheit): "); //print request for input
			temp.setScale(input.next().charAt(0)); //collect character input and set scale (character) in Temperature class
			System.out.print("Input temperature 2: "); //print request for comparison input
			comparison_t = input.nextFloat(); //collect float input; this is public, not stored in Temperature class, nor modified to reflect only 1 decimal place
			System.out.print("Input scale for temperature 2 (C for Celsius, F for Fahrenheit): "); //print request for comparison input
			comparison_sc = input.next().charAt(0); //collect character input; this is public, not stored in Temperature class
			System.out.println(); //print line spacing
			if (comparison_sc == 'C') { //print temperatures 1 & 2 in celsius if comparison is in celsius
				System.out.println("Temperature 1 in Celsius: " + temp.getCelsius());
				System.out.println("Temperature 2 in Celsius: " + comparison_t);
			}
			else { //print temperatures 1 & 2 in fahrenheit if comparison is in fahrenheit
				System.out.println("Temperature 1 in Fahrenheit: " + temp.getFahrenheit());
				System.out.println("Temperature 2 in Fahrenheit: " + comparison_t);
			}
			System.out.println(); //print spacing
			if (temp.equals(comparison_t, comparison_sc)) //implement equals computational method from Temperature class; print according to boolean output
				System.out.println("Temperature 2 is equal to Temperature 1.");
			else 
				System.out.println("Temperature 2 is NOT equal to Temperature 1.");
			if (temp.lessThan(comparison_t, comparison_sc))	//implement less than computational method from Temperature class; print according to boolean output
				System.out.println("Temperature 2 is less than Temperature 1.");
			else 
				System.out.println("Temperature 2 is NOT less than Temperature 1."); 
			if (temp.greaterThan(comparison_t, comparison_sc)) //implement greater than computational method from Temperature class; print according to boolean output
				System.out.println("Temperature 2 is greater than Temperature 1.");
			else 
				System.out.println("Temperature 2 is NOT greater than Temperature 1.");
			System.out.print("Try again (true or false)? ");
			if (input.nextBoolean() == false)
				x = true;
		} while (x==false);
	}
}