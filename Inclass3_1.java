
import java.util.Scanner; //import scanner package
import java.text.DecimalFormat; //import decimalformat package
import java.math.RoundingMode; //import roundingmode package

public class Inclass3_1 //define class
{
	public static DecimalFormat df2 = new DecimalFormat("#0.00"); //define decimal format
	public static void main(String [] args)
	{
	Scanner input = new Scanner(System.in);
	df2.setRoundingMode(RoundingMode.UP); //set rounding mode


	System.out.println(
	"\n" + "1. Write a program (convert_money.java) that prompts the user like this: "
	+ "“Currency to convert to U.S. dollars: e = Euros, c= Chinese Yuan, r = Indian Rupees, b = Bitcoin: ”"
	+ ". Then depending on which letter the user enters, the program displays “Amount of Euros/Yuan/Rupees/Bitcoin to convert: ”"
	+ ". (Note: the second prompt should only name the one currency the user asked to convert, not all four currencies.) "
	+ "After the user enters the amount, the program displays “In U.S. dollars, that is $N”, (N is the amount converted to U.S. dollars). (6 points)"); //print question/prompt
	System.out.println(); //print new line (spacing)
	System.out.println("Conversion rates (from Google, Aug 6, 2018):"); //print current conversion rates
	System.out.printf("%-15s %-10s", "1 Euro", "= 1.16 US dollar" + "\n"); //print current conversion rates
	System.out.printf("%-15s %-10s", "1 Chinese Yuan", "= 0.15 US dollar" + "\n"); //print current conversion rates
	System.out.printf("%-15s %-10s", "1 Indian Rupee", "= 0.015 US dollar" + "\n"); //print current conversion rates
	System.out.printf("%-15s %-10s", "1 Bitcoin", "= 6,923.80 US dollar" + "\n"); //print current conversion rates
	
	System.out.print(
		"\n" + "\n" 
		+ "Key:" + "\n"
		+ "e = Euros" + "\n"
		+ "c= Chinese Yuan" + "\n"
		+ "r = Indian Rupees" + "\n"
		+ "b = Bitcoin" + "\n"); //print input key
	boolean validchar = false; //set temp variable
	double amount, converted_to_usd; //define amount and converted_to_usd variables as double data types

	do { //create loop to perform set of functions while the input is incorrect
		System.out.print("Input currency to convert to US dollars. Enter your choice: "); //print input prompt
		char currency = input.next().charAt(0); //collect input
		currency = Character.toLowerCase(currency); //set input to lower case (for consistency)
		switch(currency) //start switch...case for currency conversion based on input currency type
			{
				case 'e':  //input currency type is euros
					System.out.print("Input amount of Euros to convert: "); //print prompt for amount input
					amount = input.nextFloat(); //collect input
					converted_to_usd = amount * 1.16; //convert to usd
					System.out.printf("In US dollars, that is $ %.2f", converted_to_usd); //print converted value
					System.out.println(); //print new line (spacing)
					validchar = true; //reassign temp variable
					break; //break
				case 'c': //input currency type is chinese yuan
					System.out.print("Input amount of Chinese Yuan to convert: "); //print prompt for yuan amount input
					amount = input.nextFloat(); //collect input
					converted_to_usd = amount * 0.15; //convert yuan to usd
					System.out.printf("In US dollars, that is $ %.2f", converted_to_usd); //print converted amount
					System.out.println(); //print new line (spacing)
					validchar = true; //reassign temp variable
					break; //break
				case 'r':  //input currency type is indian rupee
					System.out.print("Input amount of Indian Rupees to convert: "); //print prompt for rupeee amount input
					amount = input.nextFloat(); //collect input
					converted_to_usd = amount * 0.015; //convert rupee to usd
					System.out.printf("In US dollars, that is $ %.2f", converted_to_usd); //print converted usd amount
					System.out.println(); //print new line (spacing)
					validchar = true; //reassign temp variable
					break; //break
				case 'b': //input currency type is bitcoin
					System.out.print("Input amount of Bitcoin to convert: "); //print prompt for bitoin amount input
					amount = input.nextFloat(); //collect input
					converted_to_usd = amount * 6923.80; //convert bitcoin amount to usd amount
					System.out.printf("In US dollars, that is $ %.2f", converted_to_usd); //print converted usd amount
					System.out.println(); //print new line (spacing)
					validchar = true; //reassign temp variable
					break; //break
				default: //define default case
					System.out.println("Invalid input. Please try again."); //print error message
					validchar = false; //reassign temp variable
			} //close switch...case
	} //close "do" loop
	while (!validchar); //define while for "do" loop



	System.out.println(
			"\n" + "2. Write a program water.java that asks for temperature in Fahrenheit. "
			+ "The program should accept any floating point number. "
			+ "Display whether water is liquid, solid, or gas at that temperature at sea level. "
			+ "Display the results like this: ”Water at that temperature is a solid/liquid/gas.”"
			+ "(Note: display only the correct state for that temperature.)"
			+ "Facts: At sea level, water freezes at 32 degrees F and boils at 212 degrees F. (4 points)" +"\n"); //print question/prompt

	System.out.print("Input current temperature in Fahrenheit: "); //print prompt for Fahrenheit input

	if (input.hasNextFloat()) { //start if function if the next input is a float
		float temperature_fahrenheit = input.nextFloat(); //collect input
		float temperature_celsius = (temperature_fahrenheit - (float) 32) / (float)1.8; //convert to celsius

		if (temperature_fahrenheit<32) { //define water solid condition
			System.out.printf("Water at that temperature (" + df2.format(temperature_celsius) + " Celsius) is a solid."); //print solid statement with celsius
			} //close if 
		else if (temperature_fahrenheit<212) { //define water liquid condition
			System.out.printf("Water at that temperature (" + df2.format(temperature_celsius) + " Celsius) is a liquid."); //print liquid statement with celsius
			} //close else if 
		else if (temperature_fahrenheit>212) { //define water gas condition
			System.out.println("Water at that temperature (" + df2.format(temperature_celsius) + " Celsius) is a gas."); //print gas statement with celsius
			} //close else if
		} //close if statement

	else { //start else statement
		System.out.println("Please input a less than 6 decimal digits number"); //print error statement
		} //close else statement


	
	System.out.println( 
		"\n" + "\n"
		+ "3. Write a program that asks the user to enter a person’s age. "
		+ "Then the program should display text indicating whether the person is an infant, a toddler, "
		+ "a child, a teenager, an adult, or a senior. (5 points):"
		+ "\n"); //print question/prompt

	System.out.print("Input person's age: "); //print prompt for age input
	int age = input.nextInt(); //collect input

	if (age < 0){ //start if construct 
		System.out.println("Invalid entry"); //print error statement if age is negative
		} //close if
	else if (age < 1) { //define condition for infant
		System.out.println("This person's age category: infant"); //print infant age category
		}	//close else if
	else if (age < 3) { //define condition for toddler 
		System.out.println("This person's age category: toddler"); //print toddler age category
		}	//close else if
	else if (age < 13) { //define condition for child
		System.out.println("This person's age category: child"); //print child age category
		}	//close else if
	else if (age < 18) { //define condition for teenager
		System.out.println("This person's age category: teenager"); //print teenager age category
		}	//close else if
	else if (age < 65) { //define condition for adult
		System.out.println("This person's age category: adult"); //print adult age category
		}	//close else if
	else { //start final else
		System.out.println("This person's age category: senior"); //print senior age category
		}	//close final else


	System.out.println(
		"\n" 
		+ "4. Write a Java program to take the input for number of miles, and the class of  journey "
		+ "(1,2, or 3, for first, second, and third class respectively), for a train journey. The program should "
		+ "then calculate and display the fare of journey based on the following criteria: "
		+ "Note: Use Switch...case and if...else construct. (5 extra credit points)" + "\n"); //print question/prompt


	System.out.printf("%-20s %-20s %-20s %-20s %n", "", "First (1) Class", "Second (2) Class", "Third (3) Class"); //print column labels
	System.out.printf("%-20s %-20s %-20s %-20s %n", "First 100 Mile", "$ 3 per mile", "$ 2 per mile", "$ 1.50 per mile"); //print prices for first 100
	System.out.printf("%-20s %-20s %-20s %-20s %n", "Next 100 Mile", "$ 2.50 per mile", "$ 1.50 per mile", "$ 1 per mile"); //print prices for next 100
	System.out.printf("%-20s %-20s %-20s %-20s %n", "Remaining", "$ 2 per mile", "$ 1 per mile", "$ 0.50 per mile");  //print prices for remaining miles


	System.out.print("Input number of miles: "); //print prompt for miles input
	double miles = input.nextFloat(); //collect input

	System.out.println(
		"\n"
		+ "First (1)" + "\n"
		+ "Second (2)" + "\n"
		+ "Third (3)"); //define key for travel classes 
	System.out.print("Select class of journey: "); //print prompt for class input
	String level = input.next(); //collect String input
	level = level.toLowerCase(); //modify input to lower case (for consistency)

	double price; //define price variable as double data type
	switch(level) { //start switch...case
		case "1": //define cases for first class 
		case "first": //define cases for first class 
			if (miles < 0) { //start if construct; condition for negative miles
				System.out.println("\n" + "Invalid entry"); //print error message for invalid (negative) input
				} //close if
			else if (miles < 100) { //condition less than 100 miles
				price = miles * 3.00; //compute price
				System.out.println("\n" + "Fare of your journey: " + df2.format(price)); //print fare
				} //close else if
			else if (miles < 200) { //condition less than 200 miles
				miles = miles - 100; //adjust miles input
				price = 100 * 3.00 + miles * 2.50; //compute price
				System.out.println("\n" + "Fare of your journey: " + df2.format(price)); //print fare
				} //close else if
			else if (miles > 200) { //condition greater than 200 miles
				miles = miles - 200; //adjust miles input
				price = 100 * 3.00 + 100 * 2.50 + miles * 2.00; //compute price
				System.out.println("\n" + "Fare of your journey: " + df2.format(price)); //print fare
				} //close else if
			break; //break for first class case
		case "2": //define case for second class
		case "second": //define case for second class
			if (miles < 0) { //start if construct; condition for negative miles
				System.out.println("\n" + "Invalid entry"); //print error message for invalid (negative) input
				} //close if 
			else if (miles < 100) { //condition less than 100 miles
				price = miles * 2.00; //compute price
				System.out.println("\n" + "Fare of your journey: $" + df2.format(price)); //print fare
				} //close else if 
			else if (miles < 200) { //condition less than 200 miles
				miles = miles - 100; //adjust miles input
				price = 100 * 2.00 + miles * 1.50; //compute price
				System.out.println("\n" + "Fare of your journey: $" + df2.format(price)); //print fare
				} //close else if
			else if (miles > 200) { //condition greater than 200 miles
				miles = miles - 200; //adjust miles input
				price = 100 * 2.00 + 100 * 1.50 + miles * 1.00; //compute price
				System.out.println("\n" + "Fare of your journey: $" + df2.format(price)); //print fare
				} //close else if
			break; //break for second class case
		case "3": //define case for third class
		case "third": //define case for third class
			if (miles < 0) { //start if construct; condition for negative miles
				System.out.println("\n" + "Invalid entry");
				} //close if
			else if (miles < 100) { //condition less than 100 miles
				price = miles * 1.50; //compute price
				System.out.println("\n" + "Fare of your journey: $" + df2.format(price)); //print fare
				} //close else if
			else if (miles < 200) { //condition less than 200 miles
				miles = miles - 100; //adjust miles input
				price = 100 * 1.50 + miles * 1.00; //compute price
				System.out.println("\n" + "Fare of your journey: $" + df2.format(price)); //print fare
				} //close else if
			else if (miles > 200) { //condition greater than 200 miles
				miles = miles - 200; //adjust miles input
				price = 100 * 1.50 + 100 * 1.00 + miles * 0.50; //compute price
				System.out.println("\n" + "Fare of your journey: $" + df2.format(price)); //print fare
				} //close else if
			break; //break for third class
		default: System.out.println("\n" + "Invalid entry"); //define default as invalid entry

	} //close switch...case
	System.out.println(); //print new line (spacing)

	} 
} //close class



