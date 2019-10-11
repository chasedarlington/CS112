/*

1. The Babylonian algorithm to compute the square root of a positive number n is as follows:

     a. Make a guess at the answer (you can pick n/2 as your initial guess).

     b. Compute r = n / guess

     c. Set guess = (guess +r)/ 2

     d. Go back to step 2 for as many iterations as necessary. The more you repeat steps 2 and 3, the closer guess will become to the square root of n.


Write a program that inputs a double for n, iterates through the Babylonian algorithm five times, and outputs the answer as a double to two decimal places. 
Your answer will be most accurate for small values of n.

2. Write a program that inputs the name, quantity, and price of three items. The name may contain spaces. Output a bill with a tax rate of 6.25%. 
All prices should be output to two decimal places. The bill should be formatted in columns with 30 characters for the name, 10 characters for the quantity, 
10 characters for the price, and 10 characters for the total. Sample input and output are shown as follows:
*/

import java.util.Scanner;
import java.text.DecimalFormat; //using decimalformat only to practice alternative rounding methods
import java.math.RoundingMode; //using roundingmode only to practice alternative rounding methods

public class Assignment2 //create class
{
	public static DecimalFormat df2 = new DecimalFormat("#.##");
	public static void main(String [] args) 
	{
	Scanner Input = new Scanner(System.in); //define input as an object of the scanner class


	System.out.println(
		"\n" + "1. Write a program that inputs a double for n, iterates through the Babylonian algorithm five times, "
		+ "and outputs the answer as a double to two decimal places. "
		+ "Your answer will be most accurate for small values of n." + "\n"); //print question

	System.out.println("Procedure: " + "\n" 
		+ "a. Guess the square root" + "\n"
		+ "b. Compute r = n / guess" + "\n"
		+ "c. Set guess = (guess + r) / 2" + "\n"
		+ "d. Repeat b to c five times" + "\n"); //print procedural steps

	df2.setRoundingMode(RoundingMode.UP); //set rounding mode
	double n, guess, r; //define n, guess, and r objects as double data types 
	System.out.print("Input number: "); //print request for input
	n = Input.nextDouble(); //call input
			Input.nextLine(); //read ENTER 
	guess = 5.5; //hard code first guess at 5.5. I noticed that 5.5 provides more accurate results spanning 0 to 200 as opposed to 2 (as the first guess).
	System.out.println("First guess: the square root is: " + df2.format(guess)); //print first guess
	r = n / guess; //solve for theoretical square root using the guess
	guess = (guess + r) / 2; //refine the next guess based on error with the previous guess
	System.out.println("Second guess: the square root is: " + df2.format(r)); //print second guess
	r = n / guess; //solve for theoretical square root using the guess
	guess = (guess + r) / 2; //refine the next guess based on error with the previous guess
	System.out.println("Third guess: the square root is: " + df2.format(r)); //print third guess
	r = n / guess; //solve for theoretical square root using the guess
	guess = (guess + r) / 2; //refine the next guess based on error with the previous guess
	System.out.println("Fourth guess: the square root is: " + df2.format(r)); //print fourth guess
	r = n / guess; //solve for theoretical square root using the guess
	guess = (guess + r) / 2; //refine the next guess based on error with the previous guess
	System.out.println("Fifth guess: the square root is: " + df2.format(r) + "\n"); //print fifth guess
	System.out.println("Final guess: " + df2.format(r) + "\n");


	System.out.println(
		"\n" + "2. Write a program that inputs the name, quantity, and price of three items. The name may contain spaces. "
		+ "Output a bill with a tax rate of 6.25%. All prices should be output to two decimal places. "
		+ "The bill should be formatted in columns with 30 characters for the name, 10 characters for the quantity, "
		+ "10 characters for the price, and 10 characters for the total.");
	String item1_name, item2_name, item3_name; //set item names to string data type
	int item1_quant, item2_quant, item3_quant; //set item quantities to integer data type
	double item1_price, item2_price, item3_price; //set prices to double data type
	double item1_total, item2_total, item3_total, total; //set totals to double data type
	double subtotal, salestax, tax; //set tax and subtotals to double data type

	System.out.print("\n" + "Input item 1 name: "); //print name request
	item1_name = Input.nextLine(); //call input
	System.out.print("Input item 1 quantity: "); //print quantity request
	item1_quant = Input.nextInt(); //call input
	System.out.print("Input item 1 price per unit: "); //print price request
	item1_price = Input.nextFloat(); //call input
	item1_total = (double)item1_quant * item1_price; //calculate total

	System.out.print("\n" + "Input item 2 name: "); //print name request
	item2_name = Input.nextLine(); //call input
	item2_name = Input.nextLine(); //read \n
	System.out.print("Input item 2 quantity: "); //print quantity request
	item2_quant = Input.nextInt(); //call input
	System.out.print("Input item 2 price per unit: "); //print price request
	item2_price = Input.nextFloat(); //call input
	item2_total = (double)item2_quant * item2_price; //calculate total

	System.out.print("\n" + "Input item 3 name: "); //print name request
	item3_name = Input.nextLine(); //call input
	item3_name = Input.nextLine(); //read \n
	System.out.print("Input item 3 quantity: "); //print quantity request
	item3_quant = Input.nextInt(); //call input
		//Input.nextLine(); //read ENTER 
	System.out.print("Input item 3 price per unit: "); //print price request
	item3_price = Input.nextFloat(); //call input
		//Input.nextLine(); //read ENTER
	item3_total = (double)item3_quant * item3_price; //calculate total

	subtotal = item1_total + item2_total + item3_total; //calculate subtotal
	salestax = 0.0625; //define tax rate
	tax = salestax * subtotal; //calculate tax amount
	total = subtotal - tax; //calculate total, factoring in tax

	System.out.println(); //new line
	System.out.println("Your bill: "); //print out bill
	System.out.printf("%-30s %-10s %-10s %-10s", "Item", "Quantity", "Price", "Total"); //print column names
	System.out.println(); //next row
	System.out.printf("%-30s %-10d %-10.2f %-10.2f", item1_name, item1_quant, item1_price, item1_total); //print formatted item 1 information
	System.out.println(); //next row
	System.out.printf("%-30s %-10d %-10.2f %-10.2f", item2_name, item2_quant, item2_price, item2_total); //print formatted item 2 information
	System.out.println(); //next row
	System.out.printf("%-30s %-10d %-10.2f %-10.2f", item3_name, item3_quant, item3_price, item3_total); //print formatted item 3 information
	System.out.println(); //next row
	System.out.printf("%-30s %-10s %-10s %-10.2f", "Subtotal", "", "", subtotal); //print formatted subtotal
	System.out.println(); //next row
	System.out.printf("%-30s %-10s %-10s %-10.2f", "6.25% sales tax", "", "", tax); //print formatted tax amount
	System.out.println(); //next row
	System.out.printf("%-30s %-10s %-10s %-10.2f", "Total", "", "", total); //print formatted total
	System.out.println("\n"); //end

	}
}