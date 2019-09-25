
import java.util.Scanner; //import Scanner tool
import java.lang.Math; //import exponent tool


public class inclass4_1 //create class
{

	public int numOne(int n) { 	//define public numOne method which accepts and outputs an integer 
		int n_sum = 0;
		int n_temp = 0; //declare n_sum and n_temp as integer data types
		System.out.print("\t"); //print tab
		for (int i = 1 ; i < n ; i++) { //start for loop with initialization i as 1, condition as i < n, and increment i by 1 each cycle
			n_temp = 2 * i; //i is a function of length (input); each term in the equation is even (2x) and a function of i
			System.out.print(n_temp + "\u00B2 + "); //print each term (with square exponent) for the equation
			n_sum += Math.pow(n_temp , 2); //add the square number to the sum
		} //end loop when i = n
		n_temp = 2 * n; //for last number, compute manually; the last number is 2 * the total number of terms (input)
		System.out.print(n_temp + "\u00B2"); //print the last term (with square exponent) for the equation
		n_sum += Math.pow(n_temp , 2); //add the last square number to the sum
		return n_sum;
	}
	
	public boolean numTwo(int arm) { //define public numTwo method which accepts an integer and outputs a boolean value 
		int arm_len = String.valueOf(arm).length(); //convert integer input to a string, take the length, and assign length to integer arm_len
		//System.out.println(arm_len); --FOR TESTING
		int arm_temp = 0;
		int arm_sum = 0; //declare arm_temp and arm_sum as integer data types

		for (int i = 0 ; i <= (arm_len -1) ; i++) { //start for loop with initialization i as 0, condition that i is <= length - 1, and increment i by 1 each cycle
			arm_temp = Character.getNumericValue(Integer.toString(arm).charAt(i)); //convert arm (input) to string, select a character based on i, and assign the numeric value to arm_temp
			arm_sum += Math.pow(arm_temp,3); //add the cubed arm_temp number to the sum
			//System.out.println(arm_temp); --FOR TESTING
			//System.out.println(arm_sum); --FOR TESTING
		}
		if (arm_sum == arm) {
			return true;
		}
		else {
			return false;
		}
	}
	

	public boolean numThree(int prime_n) {
		if (prime_n == 0 || prime_n == 1) {
			return false;
			} 
		else {
			int prime_half = prime_n/2; //calculate half the input and convert to int
			for (int i = 2 ; i <= prime_half ; i++) {
				if(prime_n%i == 0) {
					return false;
					}
				}
			}
		return true;
		}

		

	public void numFour(int mult_n) { //declare n as an integer type
			for (int i = 1 ; i<= 10 ; i++) {
				System.out.println("\t\t" + mult_n + " X " + i + " = " + (mult_n * i));
			}
	}


	public void numFive(int n_5) {			
			int r,s = 0; 

			int n_5_sum = n_5;
			int n_5_count = n_5;

			int sumEven = 0;
			int sumOdd = 0;
		    while (n_5_sum > 0) {
		            r = n_5_sum % 10;
		            if (r % 2 == 0) {
		                sumEven = sumEven + r;
		            } else {
		                sumOdd = sumOdd + r;
		            }
		            n_5_sum = n_5_sum / 10;
		        }
		    System.out.print("\n\t\t\t" + "Sum of even digits: " + sumEven);
			System.out.print("\n\t\t\t" + "Sum of odd digits: " + sumOdd);

			int evenCount = 0;
			int oddCount = 0;
		    while (n_5_count > 0) { 
		        r = n_5_count % 10; 
		        if (r % 2 == 0) 
		            evenCount++; 
		        else
		            oddCount++; 
		        n_5_count = n_5_count / 10; 
		    } 
			System.out.print("\n\t\t\t" + "Count of even digits: " + evenCount);
		    System.out.print("\n\t\t\t" + "Count of odd digits: " + oddCount + "\n");
	}
	
	public boolean numSix(int pal_n) {
		int pal_len, pal_reverse_int; //define n as an integer type
		String pal_reverse_str = ""; 
		pal_len = String.valueOf(pal_n).length();

		for (int i = pal_len - 1 ; i >= 0 ; i--) {
			pal_reverse_str = pal_reverse_str + Integer.toString(pal_n).charAt(i);
		}
		pal_reverse_int = Integer.parseInt(pal_reverse_str);
		if (pal_reverse_int == pal_n) {
			return true;
		}
		else {
			return false;
		}
	}


	public void numSeven(int fact_n) { //declare n as an integer type
		int fact_fact = 1;
		System.out.print("\t\t" + fact_n + "! = ");
		for (int i = 1 ; i <= fact_n - 1 ; i++) {
			fact_fact = fact_fact * i;
			System.out.print(i + " X ");;
		}
		fact_fact = fact_fact * fact_n;
		System.out.print(fact_n + " = " + fact_fact + "\n");
	}

	public int extraCredit(int y, int exp) {
		int i = 1;
		int exp_sum = y;
		while (i < exp) {
			exp_sum = exp_sum * y;
			i++;
		}
		return exp_sum;
	}
	
/*
	public static void main(String [] args)
	{

		System.out.println("\n" + "1. Find the sum of the following series (up to N terms): "
								+ "2\u00B2 + 4\u00B2 + 6\u00B2..."); //print prompt
		numOne(5);

		System.out.println("\n" + "2. take the input of a number, and then check if it is an armstrong number or not. "
		+ "An armstrong number is one in which sum of the cubes of the digits is equal to the number itself."); //print prompt

		System.out.println("\n" + "3. Accept a number and then check whether it is a prime number or a composite number. "
			+ "A prime number is one which is divisible by itself and 1."); //print prompt

		System.out.println("4. Accept a number from the user and print its 10 multiples in the format shown in  the sample output."); //print prompt	

		System.out.println("5. Take the input of a number and then find and display the following: ");
			System.out.print("\t" + "a. sum of even digits" + "\n\t" + "b. sum of odd digits" 
				+ "\n\t" + "c. total number of even digits" + "\n\t" + "d. total number of odd digits" + "\n"); //prnt prompt

		System.out.println("6. Take the input of a number and then check whether it is a palindrome number or not. "
			+ "Find the reverse of a number using a loop and then compare it with the original number." 
			+ "A palindrome number is a number which is same when read from front or end."); //print prompt

		System.out.println("7. Take the input of a number n and then find and display it’s factorial"); //print prompt

		System.out.println("Extra Credit: prompt the user for two numbers--a base and an exponent."
			+ "Compute the base exponent using a while loop, and not Math.pow().");

	}
}

*/
}
