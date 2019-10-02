//import needed libraries
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

  
public class Assignment5_Demo_BoxOfProduce_112_3 {
  public static void main(String[] args) { 
		Path filePath = Paths.get("/Users/chasedarlington/Desktop/Code/BoxOfProduce.txt");
		Assignment5_BoxOfProduce_112_3 box = new Assignment5_BoxOfProduce_112_3();
		box.readText(filePath);

		boolean dowhile1 = true;
		boolean dowhile2 = true;
		do {
		box.setRandomItem1();
		box.setRandomItem2();
		box.setRandomItem3();
		System.out.println(box.toString());
		System.out.print("Change items (true or false)? ");
		Scanner input = new Scanner(System.in);
		if (input.nextBoolean() == true) { 
			do {
				System.out.print("Input item number (#) to change: ");
				int change_num = input.nextInt();

				if (change_num == 1) {
					System.out.println("Options:"); 
					System.out.println(box.getText());
					System.out.print("Input replacement item: ");
					String replacement = input.next();
					box.setItem1(replacement);
					System.out.print("Change another item (true or false)? ");
					dowhile2 = input.nextBoolean();
				}
				else if (change_num == 2) {
					System.out.println("Options:"); 
					System.out.println(box.getText());
					System.out.print("Input replacement item: ");
					String replacement = input.next();
					box.setItem2(replacement);
					System.out.print("Change another item (true or false)? ");
					dowhile2 = input.nextBoolean();
				}
				else if (change_num == 3) {
					System.out.println("Options:"); 
					System.out.println(box.getText());
					System.out.print("Input replacement item: ");
					String replacement = input.next();
					box.setItem3(replacement);
					System.out.print("Change another item (true or false)? ");
					dowhile2 = input.nextBoolean();
				} 
				else {
					System.out.println("INVALID INPUT FOR ITEM NUMBER");
					dowhile2 = true;
				}
			} while (dowhile2 == true);
		}
			System.out.println();
			System.out.println("Congratulations! Box is prepared for delivery.");
			System.out.println(box.toString());
			System.out.print("Try another simulation (true or false)? ");
			dowhile1 = input.nextBoolean();
		} while (dowhile1 == true);


		/*

*/

		//Assignment5_BoxOfProduce_112_3 produce = new Assignment5_BoxOfProduce_112_3();
		//produce.setItem1



	}
}
	
	
