/* 
Write a program that accepts 10 values into an integer array and then prints the largest and the smallest values existing in the array. 
Write a program that accepts 10 numbers into an array and then finds and displays all prime numbers in the array. The program should also display the total number of prime numbers  present in the array. Define a static method Boolean Prime(int n) which checks if a number is prime. Note: The method should be invoked for each element in the array.
Write a program that accepts 10 numbers into an array. Take the input of two  numbers Original and Replacement. The program then replaces all occurrences of a  Original by Replacement  in the array . Display the original and the new array.
*/

//import tools/libraries
import java.util.Scanner; 
import java.util.Arrays; 
import java.util.Collections; 

public class Inclass7_1 { //create class 

	public static boolean Boolean_Prime(int n) { //return true if the input integer "n" is prime, else return false
		if (n == 0 || n == 1) {
			return false;
			} 
		else {
			int half = n/2; //calculate half the input and convert to int
			for (int i = 2 ; i <= half ; i++) {
				if(n%i == 0) {
					return false;
					}
				else 
					return true;	
				}
			}
		return false;
		}

	public static void main(String [] args) { //declare main method
		int i;
		Scanner input = new Scanner(System.in); //
		Integer[] numOne = {1,2,3,4,5,6,7,8,9,10}; //create an array of 10 integers 
		System.out.println("Array: " + Arrays.asList(numOne)); //print array
		System.out.println("Max value: " + Collections.max(Arrays.asList(numOne))); //print max value
		System.out.println("Min value: " + Collections.min(Arrays.asList(numOne))); //print min value
		System.out.println();

		int prime_cnt=0;
		Integer[] numTwo = {1,2,3,4,5,6,7,8,9,10}; //create an array of 10 integers 
		System.out.println("Array: " + Arrays.asList(numTwo)); //print array
		System.out.print("Prime numbers in this array: ");
		for (i = 0; i < numTwo.length; i++) { //iterate through the list and check each integer for prime boolean value
			if (Boolean_Prime(numTwo[i])) {
				prime_cnt++; //increase prime count by 1
				System.out.print(numTwo[i] + " "); //print the prime number with a comma
			}
		}
		System.out.println("\n" + "Count of primes: " + prime_cnt); //numTwo_primes.length); //print length
		System.out.println();

		Integer[] numThree = {1,1,1,2,3,3,3,4,5,5}; //create an array of 10 integers 
		System.out.print("Input original integer: "); //accept input for original int
		int original = input.nextInt();
		System.out.print("Input replacement integer: "); //modify int in the array
		int replacement = input.nextInt();
		System.out.println("Original array: " + Arrays.asList(numThree)); //print original array
		System.out.print("Modified array (original integer replaced): [");
		for (i = 0; i < numThree.length; i++) { //iterate through the array and replace values if the value matches the original
			if (i==numThree.length-1) { //if the final index value, test then print without a comma
				if (numThree[i] == original)
					numThree[i] = replacement;
				System.out.print(numThree[i] + "]");
			}
			else {
				if (numThree[i] == original)
					numThree[i] = replacement;
				System.out.print(numThree[i] + ", ");
			}
		}
		System.out.println();
	}
}

