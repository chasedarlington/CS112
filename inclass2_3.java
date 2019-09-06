/*
1. Write a Java program to take the input of scores of a student in 5 classes. Calculate the student’s average and print a grade according to the following criteria:
AVERAGE -GRADE
90 and above - E, 
80 – 89- A, 
70 – 79- B, 
60 – 69- C, 
50 – 59- D, 
Less than 50- F
*/


import java.util.Scanner; //import Scanner package

public class inclass2_3 //create class
{
	public static void main(String [] args)
	{ 
	Scanner Input = new Scanner(System.in); //define input as an object of the Scanner class

	System.out.println(
		"1. Write a Java program to take the input of scores of a student in 5 classes."
		+ " Calculate the student’s average and print a grade according to the following criteria:" 
		+ "\n" + "\n" + "AVERAGE-GRADE"
		+ "\n" + "90 and above: E"
		+ "\n" + "80 – 89: A"
		+ "\n" + "70 – 79: B" 
		+ "\n" + "60 – 69: C"
		+ "\n" + "50 – 59: D"
		+ "\n" + "Less than 50: F"
		+ "\n" 
		); //print question
	double c1,c2,c3,c4,c5,avg;
	double e,a,b,c,d,f;
	System.out.print("Class 1 score: "); //take input of class 1 score
	c1 = Input.nextFloat();
	System.out.print("Class 2 score: "); //take second class input
	c2 = Input.nextFloat();
	System.out.print("Class 3 score: "); //take third class input
	c3 = Input.nextFloat();
	System.out.print("Class 4 score: "); //take fourth class input
	c4 = Input.nextFloat();
	System.out.print("Class 5 score: "); //take fifth class input
	c5 = Input.nextFloat();
	avg = (c1+c2+c3+c4+c5)/5; //take the average of the scores
	System.out.print("Average: " + avg + "\n" +"\n"); //print the average
	
	//define lower margin of the letter grades
	e = 90;
	a = 80;
	b = 70;
	c = 60;
	d = 50;
	f = 0;

	//if else structure to match the average to the respective letter grade (based on the defined lower margins)
	if (avg >= e) {
		System.out.println("Grade: E");
	}
	else if (avg >= a) {
		System.out.println("Grade: A"); 
	}
	else if (avg >= b) {
		System.out.println("Grade: B");
	}
	else if (avg >= c) {
		System.out.println("Grade: C");
	}
	else if (avg >= d) {
		System.out.println("Grade: D");
	}
	else if (avg >= f) {
		System.out.println("Grade: F");
	}
	else {
		System.out.println("ERROR");
	}
	}
}