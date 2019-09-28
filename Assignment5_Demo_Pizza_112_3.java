import java.util.Scanner;

public class Assignment5_Demo_Pizza_112_3 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Assignment5_Pizza_112_3 pizza = new Assignment5_Pizza_112_3();

		boolean loop = false;
		do {
			System.out.println();
			System.out.print("Input pizza size (S,M,L): ");
				pizza.setSize(input.next().charAt(0));
			System.out.print("Input number of cheese toppings: ");
				pizza.setNumCheese(input.nextInt());
			System.out.print("Input number of pepperoni toppings: ");
				pizza.setNumPepperoni(input.nextInt());
			System.out.print("Input number of ham toppings: ");
				pizza.setNumHam(input.nextInt());
			System.out.print(pizza.getDescription());
			System.out.println();
			System.out.print("Try again (true or false)? ");
			if(input.nextBoolean() == true)
				loop = true;
			else 
				loop = false;
		} while(loop==true);
	}
}