import java.util.Scanner;

public class Assignment3_demo {

	public static void main(String [] args) {

	Scanner input=new Scanner(System.in);
	Assignment3 Assignment3 = new Assignment3(); //Constructor invoked

	boolean temp = true;
	do {
		System.out.println("\n" + "1. The Fibonacci numbers Fn are defined as follows:  F0 is 1, F1 is 1, and Fi+2=Fi+Fi+1" + "\t" + "i = 0, 1, 2, . . . . "  + "\n");
		System.out.println("In other words, each number is the sum of the previous two numbers. "
			+ "The first few Fibonacci numbers are 1, 1, 2, 3, 5, and 8. "
			+ "One place where these numbers occur is as certain population growth rates. "
			+ "If a population has no deaths, then the series shows the size of the population after each time period. "
			+ "It takes an organism two time periods to mature to reproducing age, and then the organism reproduces once every time period. "
			+ "The formula applies most straightforwardly to asexual reproduction at a rate of one offspring per time period. "
			+ "In any event, the green crud population grows at this rate and has a time period of five days. Hence, if a green crud population "
			+ "starts out as 10 pounds of crud, then in 5 days, there is still 10 pounds of crud; in 10 days, there is 20 pounds of crud; in 15 days," 
			+ "30 pounds; in 20 days, 50 pounds; and so forth. Write a program that takes both the initial size of a green crud population (in pounds) "
			+ "and a number of days as input and outputs the number of pounds of green crud after that many days. Assume that the population size is "
			+ "the same for four days and then increases every fifth day. Your program should allow the user to repeat this calculation as often as desired." + "\n");

		int init, t;
		System.out.print("\t" + "Input initial size of a green crud population (in pounds): ");
		init = input.nextInt();
		System.out.print("\t" + "Input number of days: ");
		t = input.nextInt();

		int f = Assignment3.fibonacci(init,t);
		System.out.println("\n\t" + "Number of pounds of green crud after " + t + " days: " + f + " pounds");	
		System.out.print("\n\t" + "Try again (true or false)? ");
		temp = input.nextBoolean(); 
	} while (temp == true);

	temp = true;
	do {
		System.out.println("\n" + "2.  The value e^x can be approximated by the following sum: 1+x+x2/2!+x3/3!+…+xn/n!" + "\n");
		System.out.println("Write a program that takes a value x as input and outputs this sum for n taken to be each of the values 1 to 10, 50, and 100. " + "\n"
			+ "Your program should repeat the calculation for new values of x until the user says she or he is through. " + "\n"
			+ "The expression n! is called the factorial of n and is defined as: n!=1*2*3*…*n" + "\n");
		System.out.println("Use variables of type double to store the factorials (or arrange your calculation to avoid any direct "
			+ "calculation of factorials); otherwise, you are likely to produce integer overflow, that is, integers larger than Java allows." + "\n");

		System.out.print("\t" + "For e^x, input value of x: ");
		int x = input.nextInt();
		float euler = Assignment3.euler(x);
		System.out.println("\n\t" + "Taking x as the input for e^x expressed by n = {1:10, 50, 100}, e^x is approximately: " + euler);
		System.out.print("\n\t" + "Try again (true or false)? ");
		temp = input.nextBoolean();
	} while (temp == true);
	
	}
}