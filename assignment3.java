import java.util.Scanner;

public class assignment3 {
	public int fibonacci(int init, int t) { //define integer initial amount and integer time inputs, and integer output for assignment3.fibonacci{} method
	/*
	f0 = 1
	f1 = 1
	f2 = 2
	f3 = 3
	f4 = 5
	f5 = 8
	F(i+2)=F(i)+F(i+1)
	*/ 
	int period = 5;
	int f = 0; //predefine f as integer 0
	if (t/period == 0){ //quickly define f0 if less than 5 days (1 period) is entered
		f = init; //assign initial amount to the value of f for both f0 and f1
		System.out.print("\t" + init); //print f0
		}
	else if (t/period == 1) { //quickly define f1 and f0 if less than 10 days (2 periods) is entered
		f = init;
		System.out.print("\t" + init + " " + init + " "); //print f0 and f1
	}
	else {
		int f_less_2 = init; //define f(i-2)
		int f_less_1 = init; //define f(i-1)
		System.out.print("\t" + init + " " + init + " "); //print f0 and f1
		for (int i = 2; i<=(t/period) ; i++) { //for loop starting with f2 (f0 and f1 already defined); loop continues increasing i +1 until i matches the number of periods entered
			f = f_less_1 + f_less_2; // f(i+2)=f(i+1)+f(i), which equates to f(i) = f(i-2) + f(i-1)
			f_less_2 = f_less_1; //increment f(i-2) to the former f(i-1) value; reassigns values for next loop
			f_less_1 = f; //increment f(i-1) to the former f value; reassigns values for next loop
			System.out.print(f + " "); //print f to continue the fibonacci sequence string
			}	
		}
	return f; //return the final number in the fibonacci sequence; this is the population expected given the initial amount and number of periods (days)
	}

	public float euler(int x) {
		int exponential = 1; //initialize exponential integer as 1
		double factorial = 1; //initialize factorial double as 1
		double sum = 1; //initialize sum double as 1

		//1 to 10
		for (int i = 1 ; i <= 10 ; i++) { //execute for loop starting when exponents >= 2, <= the input exponent, and increment by 1
			exponential = exponential * x; //define value of exponential portion of sequence
			factorial = factorial * i; //define value of factorial portion of sequence
			sum = sum + exponential/factorial; //define sum, adding the quotient of exponential:factorial portions
		}

		//50
		for (int i = 1 ; i <= 50 ; i++) { //execute for loop starting when exponents >= 2, <= the input exponent, and increment by 1
			exponential = exponential * x; //define value of exponential portion of sequence
			factorial = factorial * i; //define value of factorial portion of sequence
			//sum = sum + exponential/factorial; //define sum, adding the quotient of exponential:factorial portions
		}
			sum = sum + exponential / factorial; //add n=50 calculation to sum

		//100
		for (int i = 1 ; i <= 100 ; i++) { //execute for loop starting when exponents >= 2, <= the input exponent, and increment by 1
			exponential = exponential * x; //define value of exponential portion of sequence
			factorial = factorial * i; //define value of factorial portion of sequence
			//sum = sum + exponential/factorial; //define sum, adding the quotient of exponential:factorial portions
		}
			sum = sum + exponential / factorial; //add n=100 calculation to sum
		return (float) sum; //return sum converted to float
	}
}
/*

	public double e(int exp) { //define integer x and integer exponent inputs, and double output for assignment3.e method
	double sum; //initialize sum double
	if (exp == 0) { //if exp is 0, return 1 for sum
		sum = 1;
		System.out.print("1"); //print sequence
	}

	else if (exp == 1) { //if exp is 1, return 1+x for sum
		sum = 1 + x;
		System.out.print("1 + " + x); //print sequence
	}

	else { //if exp is neither 0 or 1, execute for loops
		int exponential = 1; //initialize exponential integer as x
		double factorial; //initialize factorial double as 1
		sum = 1 + x; //set predefined sum based on if statements
		System.out.print("1 + " + x); //print first part of sequence
		for (int i = 2 ; i <= exp ; i++) { //execute for loop starting when exponents >= 2, <= the input exponent, and increment by 1
			System.out.print(" + (" + x + "^" + i + "/" + i + "!)"); //print next part of sequence
			exponential = exponential * x; //define value of exponential portion of sequence
			factorial = factorial * i; //define value of factorial portion of sequence
			sum = sum + exponential/factorial; //define sum, adding the quotient of exponential:factorial portions
		}
	}
	*/
