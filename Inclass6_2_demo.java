import java.util.Scanner;

public class Inclass6_2_demo {
	public static void main(String [] args) {
		// HARD CODE VERSION
		Inclass6_2[] phonebook = new Inclass6_2[5]; //create a 2D string array with the user-defined number of rows and two columns (for name & phone; defined in the Inclass6_2 class)
		phonebook[0] = new Inclass6_2("Chase Darlington", "2539482507");
		phonebook[1] = new Inclass6_2("Chase", "2539482507");
		phonebook[2] = new Inclass6_2("Chase Darlington", "4154220767");
		phonebook[3] = new Inclass6_2("David Beckham", "14159523131");	
		phonebook[4] = new Inclass6_2("Charles Schwab", "14154804800");	
		for (int j=0; j<phonebook.length; j++)
			System.out.print("[" + (j+1) + "] " + phonebook[j].toString());
		System.out.println("\n" + "SEARCH FOR CHASE DARLINGTON");
		Inclass6_2.search(phonebook, new Inclass6_2("Chase Darlington", "2539482507"));	
		System.out.println();
		
		
		// INPUT VERSION - incomplete
		// Scanner input = new Scanner(System.in);	
		// System.out.print("Input desired phonebook length: ");
		// Inclass6_2[] phonebook = new Inclass6_2[input.nextInt()]; //create a 2D string array with the user-defined number of rows and two columns (for name & phone; defined in the Inclass6_2 class)
		// input.nextLine();
		// String nm, ph;
		// for (int i=0; i<phonebook.length; i++) {
		// 	System.out.print("Input name: ");
		// 	nm = input.nextLine();
		// 	System.out.print("Input phone number: ");
		// 	ph = input.nextLine();
		// 	phonebook[i] = new Inclass6_2(nm, ph);	
		// } 
		// for (int j=0; j<phonebook.length; j++)
		// 	System.out.print("[" + (j+1) + "] " + phonebook[j].toString());
		// // System.out.println("Search (true or false)? ");
		// // if (input.nextBoolean() == true) {
		// // 	System.out.println
		// // }
		// System.out.println("\n" + "SEARCH FOR CHASE DARLINGTON");
		// Inclass6_2.search(phonebook, new Inclass6_2("Chase Darlington", "2539482507"));	
		// System.out.println();
		
	}
}