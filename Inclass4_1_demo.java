import java.util.Scanner; //import Scanner tool

public class Inclass4_1_demo //create class
{
	public static void main(String [] args)
		{
			Scanner input = new Scanner(System.in);
			boolean x = true;
			int y, exp;

			Inclass4_1 Inclass4_1 = new Inclass4_1(); //constructor called 
			
			do { 
				System.out.println("\n" + "1. Find the sum of the following series (up to N terms): "
										+ "2\u00B2 + 4\u00B2 + 6\u00B2..."); //print prompt
				System.out.print("\t" + "Input a number: ");
				y = input.nextInt();
				int numsum = Inclass4_1.numOne(y); //implement method and assign value to numsum
				System.out.println("\n\t" + "Sum of numbers = " + numsum); //print the sum
				
				System.out.print("\n\t" + "Try again (true or false)? ");
				x = input.nextBoolean();
			} while (x == true);

			x = true;
			do { //start do...while loop
				System.out.println("\n" + "2. take the input of a number, and then check if it is an armstrong number or not. "
				+ "An armstrong number is one in which sum of the cubes of the digits is equal to the number itself."); //print prompt
				System.out.print("\t" + "Input a number: "); //print request for input
				y = input.nextInt(); //collect input
				
				boolean arm_bool = Inclass4_1.numTwo(y); //implement method and assign value to arm_bool
				if (arm_bool == true) {
					System.out.println("\t" + y + " is an Armstrong number"); //print statement if the cubed sum of the parts of the input ARE equivalent to the input value
				}
				else {
					System.out.println("\t" + y + " is NOT an Armstrong number"); //print statement if the cubed sum of the parts of the input ARE NOT equivalent to the input value
				}
				System.out.print("\n\t" + "Try again (true or false)? "); //print request for repeat boolean value
				x = input.nextBoolean(); //collect input
			} while (x == true); //continue set of functions until repeat is set to false

			x = true; 
			do {
				System.out.println("\n" + "3. Accept a number and then check whether it is a prime number or a composite number. "
					+ "A prime number is one which is divisible by itself and 1."); //print prompt

				System.out.print("\t" + "Input a number: "); //print request for input
				y = input.nextInt(); //collect integer input

				if (Inclass4_1.numThree(y) == true) {
					System.out.println("\t" + y + " is a prime number.");
				}
				else {
					System.out.println("\t" + y + " is a composite number.");	
				}
				System.out.print("\n\t" + "Try again (true or false)? "); //print request for repeat boolean value
				x = input.nextBoolean(); //collect input
			} while (x == true);

			x = true;
			do {
				System.out.println("\n" + "4. Accept a number from the user and print its 10 multiples in the format shown in  the sample output."); //print prompt	
				System.out.print("\t" + "Enter a number: "); //print request for input
				y = input.nextInt(); //collect integer input
				Inclass4_1.numFour(y);
				System.out.print("\n\t" + "Try again (true or false)? "); //print request for repeat boolean value
				x = input.nextBoolean(); //collect input
			} while (x == true);

			x = true;
			do {
				System.out.println("\n" + "5. Take the input of a number and then find and display the following: ");
					System.out.print("\t" + "a. sum of even digits" + "\n\t" + "b. sum of odd digits" 
						+ "\n\t" + "c. total number of even digits" + "\n\t" + "d. total number of odd digits" + "\n"); //prnt prompt
				System.out.print("\t\t" + "Input a number: "); //print request for user input
				y = input.nextInt(); //collect integer input
				Inclass4_1.numFive(y);
				System.out.print("\n\t" + "Try again (true or false)? "); //print request for repeat boolean value
				x = input.nextBoolean(); //collect input
			} while (x == true);

			x = true;
			do {
				System.out.println("\n" +  "6. Take the input of a number and then check whether it is a palindrome number or not. "
					+ "Find the reverse of a number using a loop and then compare it with the original number." 
					+ "A palindrome number is a number which is same when read from front or end."); //print prompt
				System.out.print("\t" + "Input a number: "); //print request for user input
				y = input.nextInt(); //collect integer input
				if (Inclass4_1.numSix(y) == true) {
					System.out.print("\t" + y + " is a palindrome number." + "\n");			
				}
				else {
					System.out.print("\t" + y + " is not a palindrome number." + "\n");
				}
				System.out.print("\n\t" + "Try again (true or false)? "); //print request for repeat boolean value
				x = input.nextBoolean(); //collect input
			} while (x == true);
		
			x = true; 
			do {
				System.out.println("\n" + "7. Take the input of a number n and then find and display it’s factorial"); //print prompt
				System.out.print("\t" + "Input a number: "); // print request for user input
				y = input.nextInt(); //collect integer input
				Inclass4_1.numSeven(y);
				System.out.print("\n\t" + "Try again (true or false)? "); //print request for repeat boolean value
				x = input.nextBoolean(); //collect input
			} while (x == true);

			x = true; 
			do {
				System.out.println("\n" + "Extra Credit: prompt the user for two numbers--a base and an exponent."
					+ "Compute the base exponent using a while loop, and not Math.pow().");
				System.out.print("\t" + "Input a base number: "); // print request for user input
				y = input.nextInt(); //collect integer input
				System.out.print("\t" + "Input an exponent: "); // print request for user input
				exp = input.nextInt(); //collect integer input
				System.out.print("\t" + y + " to the " + exp + " power is: ");
				exp = Inclass4_1.extraCredit(y, exp);
				System.out.print(exp + "\n");
				System.out.print("\n\t" + "Try again (true or false)? "); //print request for repeat boolean value
				x = input.nextBoolean(); //collect input
			} while (x == true);


		}
}