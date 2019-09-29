import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

  
public class Assignment5_Demo_BoxOfProduce_112_3 {
  public static void main(String[] args) { 
		Path filePath = Paths.get("/Users/chasedarlington/Desktop/Code/BoxOfProduce.txt");
		Assignment5_BoxOfProduce_112_3 box = new Assignment5_BoxOfProduce_112_3();
		box.readText(filePath);

		boolean dowhile = true;
		do {
		box.setRandomItem1();
		box.setRandomItem2();
		box.setRandomItem3();
		System.out.println(box.toString());
		System.out.print("Change items (true or false)? ");
		Scanner input = new Scanner(System.in);
		if (input.nextBoolean() == true) { 
			System.out.println("Input item number (#) to change: ");
			int change_num = input.nextInt();

			if (change_num == 1) {
				System.out.println("Options:"); 
				System.out.println(box.getText());
				System.out.println("Input replacement item: ");
				String replacement = input.next();
				box.setItem1(replacement);
			}
			else if (change_num == 2) {
				System.out.println("Options:"); 
				System.out.println(box.getText());
				System.out.println("Input replacement item: ");
				String replacement = input.next();
				box.setItem2(replacement);
			}
			else if (change_num == 3) {
				System.out.println("Options:"); 
				System.out.println(box.getText());
				System.out.println("Input replacement item: ");
				String replacement = input.next();
				box.setItem3(replacement);
			}
			else 
				System.out.println("INVALID INPUT FOR ITEM NUMBER");
		}
			System.out.println();
			System.out.println("Congratulations! Box is prepared for delivery.");
			System.out.println(box.toString());
			System.out.print("Try again (true or false)? ");
			dowhile = input.nextBoolean();
		} while (dowhile == true);


		/*

*/

		//Assignment5_BoxOfProduce_112_3 produce = new Assignment5_BoxOfProduce_112_3();
		//produce.setItem1



	}
}
	
	
