import java.util.Scanner;

public class Assignment5_Demo_PizzaOrder_112_3 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
/*		Assignment5_Pizza_112_3 pizza1 = new Assignment5_Pizza_112_3();
		Assignment5_Pizza_112_3 pizza2 = new Assignment5_Pizza_112_3();
		Assignment5_Pizza_112_3 pizza3 = new Assignment5_Pizza_112_3();
		Assignment5_PizzaOrder_112_3 order = new Assignment5_PizzaOrder_112_3(); // Code to create an order	

		boolean loop = false;
		do {
			System.out.println();
			System.out.println("Input number of pizzas (1, 2, or 3): ");
			order.setNumPizzas(input.nextInt());

			if (getNumPizzas >= 1) {
				System.out.println("Pizza 1");
				System.out.print("\t" + "Input pizza size (S,M,L): ");
					pizza1.setSize(input.next().charAt(0));
				System.out.print("\t" + "Input number of cheese toppings: ");
					pizza1.setNumCheese(input.nextInt());
				System.out.print("\t" + "Input number of pepperoni toppings: ");
					pizza1.setNumPepperoni(input.nextInt());
				System.out.print("\t" + "Input number of ham toppings: ");
					pizza1.setNumHam(input.nextInt());
				System.out.print(pizza.getDescription());
				System.out.println();
			}

			if (getNumPizzas >= 2) {
				System.out.println("Pizza 2");
				System.out.print("\t" + "Input pizza size (S,M,L): ");
					pizza2.setSize(input.next().charAt(0));
				System.out.print("\t" + "Input number of cheese toppings: ");
					pizza2.setNumCheese(input.nextInt());
				System.out.print("\t" + "Input number of pepperoni toppings: ");
					pizza2.setNumPepperoni(input.nextInt());
				System.out.print("\t" + "Input number of ham toppings: ");
					pizza2.setNumHam(input.nextInt());
				System.out.print(pizza.getDescription());
				System.out.println();
			}

			if (getNumPizzas >= 3) {
				System.out.println("Pizza 3");
				System.out.print("\t" + "Input pizza size (S,M,L): ");
					pizza3.setSize(input.next().charAt(0));
				System.out.print("\t" + "Input number of cheese toppings: ");
					pizza3.setNumCheese(input.nextInt());
				System.out.print("\t" + "Input number of pepperoni toppings: ");
					pizza3.setNumPepperoni(input.nextInt());
				System.out.print("\t" + "Input number of ham toppings: ");
					pizza3.setNumHam(input.nextInt());
				System.out.print(pizza.getDescription());
				System.out.println();
			}

			order.setPizza1(pizza1);
			order.setPizza2(pizza2);
			order.setPizza3(pizza3);


			System.out.print("Try again (true or false)? ");
			if(input.nextBoolean() == true)
				loop = true;
			else 
				loop = false;
		} while(loop==true);
	*/


		Assignment5_Pizza_112_3 pizza1 = new Assignment5_Pizza_112_3('L',1,0,1); // Code to create a large pizza, 1 cheese, 1 ham
		Assignment5_Pizza_112_3 pizza2 = new Assignment5_Pizza_112_3('M',2,2,0); // Code to create a medium pizza, 2 cheese, 2 pepperoni
		System.out.println(pizza1.calcCost());
		System.out.println(pizza2.calcCost());
		System.out.println(pizza1.getSize());
		System.out.println((pizza1.getNumCheese()+pizza1.getNumHam()+pizza1.getNumPepperoni())*2);

/*
		Assignment5_PizzaOrder_112_3 order = new Assignment5_PizzaOrder_112_3(); // Code to create an order
		order.setNumPizzas(2); // 2 pizzas in the order
		order.setPizza1(pizza1); // Set first pizza
		order.setPizza2(pizza2); // Set second pizza
		double total = order.calcTotal(); // Should be 18+20 = 38
		System.out.println(total);
		System.out.println(pizza1.getDescription());
		System.out.println(pizza2.getDescription());
*/
	}
}