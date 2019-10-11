/*
1. Write a program to take the input of  number of seconds from the user, and  convert the number of seconds to hours, minutes, and seconds.
2. Suppose you want to deposit a certain amount of money into a savings account and leave it alone to draw interest for the next 10 years. 
	At the end of 10 years, you would like to have $10,000 in the account. How much do you need to deposit today to make that happen? 
	Rate of interest is 2.99. You can use the following formula to find out: P=F/(1+r)n
3.  Write a Java program to take the input of amount in Dollars, and then display the denominations in  $10, $1, $ 5, 50 cents, quarter, 
	dime, and pennies which make up the total amount.

*/


import java.util.Scanner;
import static java.lang.Math.pow;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Assignment1 //create class
{
	public static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void main(String [] args)
	{Scanner Input = new Scanner(System.in); //define input as an object of the scanner class


		System.out.print("\n" + "1. Write a program to take the input of  number of seconds from the user, " + "\n" 
			+ "and convert the number of seconds to hours, minutes, and seconds." + "\n" + "\n"); //print assignment question
		int seconds; //create an integer data type variable 'seconds'
		//float remainder;
		System.out.print("Input number of seconds: "); //print request for input (number of seconds)
		seconds = Input.nextInt();
		int hours = seconds / (int)360; //60*60=360 seconds to an hour; divide the number of seconds by 360 and convert to int (which DOES NOT round, simply removing numbers after the decimal point)
		int minutes = (seconds - hours * (int)360) / (int)60; //60 seconds to a minute; divide the remaining number of seconds by 60 and convert to int (which DOES NOT round, simply removing numbers after the decimal point)
		int remainingseconds = seconds - (hours * (int)360) - (minutes * (int)60); //filter down to remaining seconds
		System.out.print("Hours=" + hours + "\n"); //print number of hours
		System.out.print("Minutes=" + minutes + "\n"); //print number of remaining minutes
		System.out.print("Seconds=" + remainingseconds + "\n" + "\n"); //print number of remaining seconds


		System.out.print("2. Suppose you want to deposit a certain amount of money into a savings account" + "\n" 
			+ "and leave it alone to draw interest for the next 10 years. At the end of 10 years, you would" +"\n" 
			+ "like to have $10,000 in the account. How much do you need to deposit today to make that happen?" + "\n" 
			+ "Rate of interest is 2.99. You can use the following formula to find out: P=F/(1+r)^n." + "\n" + "\n"); //print assignment question
		double fv, r, pv, temp; //create a float data type for future value and interest rate
		int n; //create an int data type for number of periods
		System.out.print("Input future value: "); //print request for input (future value)
		fv = Input.nextFloat(); 
		System.out.print("Input interest rate (%): "); //print request for input (interest rate)
		r = Input.nextFloat();
		System.out.print("Input number of periods: "); //print request for input (interest rate)
		n = Input.nextInt();
		temp = 1 + r / 100; //calculate the interest factor as 1+r where r is (%)
		pv = fv / Math.pow(temp,n); //calculate present value 
		df2.setRoundingMode(RoundingMode.DOWN); //set rounding mode
		System.out.print("Present Value= " + df2.format(pv) + "\n" + "\n"); //round and print the calculated present value


		System.out.print("3.  Write a Java program to take the input of amount in Dollars, and then display" + "\n" 
			+ "the denominations in  $10, $1, $ 5, 50 cents, quarter, dime, and pennies which make up the total amount." + "\n" + "\n");
		double dollars; //create a float data type for dollars
		int tens, fives, ones, fiftycents, quarters, dimes, pennies; //create an int data type for "count" variables
		System.out.print("Input dollar value: "); //print request for input (dollars)
		dollars = Input.nextDouble();
		tens = (int)(dollars / 10); //calculate the count of tens by dividing dollars by 10 and rounding
		fives = (int) ( (dollars - (double)tens * 10) / 5 ); //calculate the count of fives by dividing remainder dollars by 5 and rounding
		ones = (int) ( (dollars - (double)tens * 10 - (double) fives * 5) / 1 ); //calculate the count of ones by dividing remainder dollars by 1 and rounding
		fiftycents = (int) ( (dollars - (double)tens * 10 - (double) fives * 5 - (double)ones * 1) / 0.50 ); //calculate the count of fifty cent pieces by dividing remainder dollars by 0.50 and rounding
		quarters = (int) ( (dollars - (double)tens * 10 - (double) fives * 5 - (double)ones * 1 - (double)fiftycents * 0.50) / 0.25 ); //calculate the count of quarters by dividing remainder dollars by 0.25 and rounding
		dimes = (int) ( (dollars - (double)tens * 10 - (double) fives * 5 - (double)ones * 1 - (double)fiftycents * 0.50 - (double)quarters * 0.25) / 0.10 ); //calculate the count of dimes by dividing remainder dollars by 0.10 and rounding
		pennies = (int) ( (dollars - (double)tens * 10 - (double)fives * 5 - (double)ones * 1 - (double)fiftycents * 0.50 - (double)quarters * 0.25 - (double)dimes * 0.10) / 0.01 ); //calculate the count of pennies by dividing remainder dollars by 0.01 and rounding
		System.out.print("$10: " + tens + "\n"); //print number of tens
		System.out.print("$5: " + fives + "\n"); //print number of fives
		System.out.print("$1: " + ones + "\n"); //print number of ones
		System.out.print("$0.50: " + fiftycents + "\n"); //print number of fifty cent pieces
		System.out.print("$0.25: " + quarters + "\n"); //print number of quarters
		System.out.print("$0.10: " + dimes + "\n"); //print number of dimes
		System.out.print("$0.01: " + pennies + "\n" + "\n"); //print number of pennies
		
	}
}