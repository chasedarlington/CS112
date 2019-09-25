import java.util.Scanner;

public class Inclass5_2_demo { //create demo class
	public static void main(String [] args) { //define the main
		Scanner input = new Scanner(System.in); //invoke Scanner class
		
		System.out.println(); //print empty line for spacing
		System.out.print("Input username: "); //print request for username
		String username = input.nextLine(); //collect username in nextLine
		System.out.print("Input month: "); //print request for month
		String m = input.next(); //collect input with next (because instructions were to accept full or abbreviated month names)
		System.out.print("Input day: "); //print request for day
		int d = input.nextInt(); //collect integer input
		System.out.print("Input year: "); //print request for year
		int y = input.nextInt(); //collect integer input
		input.nextLine();
		System.out.print("Input text: "); //print request for text
		String text = input.nextLine(); //collect text in nextLine


		Inclass5_2 entry = new Inclass5_2(username, m, d, y, text); //invoke constructor from Inclass5_2 (BlogEntry) class; allocates memory for the instance variables of BlogEntry class; "entry" points to this object in memory
		entry.DisplayEntry();  //display entry

		System.out.println("Summary (10 or fewer characters): " + "\n\t" + entry.getSummaryChar() + "..." + "\n"); //display summary limiting on characters
		System.out.println("Summary (10 or fewer words): " + "\n\t" + entry.getSummaryWords() + "..." + "\n"); //display summary limiting on words


	}
}