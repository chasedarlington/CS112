import java.util.Scanner;

public class Assignment5_Demo_PizzaOrder {
	public static void main(String [] args) {
		double total;
		boolean loop;
		Scanner input = new Scanner(System.in);
		Assignment5_Pizza pizza1 = new Assignment5_Pizza();
		Assignment5_Pizza pizza2 = new Assignment5_Pizza();
		Assignment5_Pizza pizza3 = new Assignment5_Pizza();
		Assignment5_PizzaOrder order = new Assignment5_PizzaOrder(); // Code to create an order	

		loop = false;
		do {
			System.out.println();
			System.out.print("Input number of pizzas (1, 2, or 3): ");
			order.setNumPizzas(input.nextInt());

			if (order.getNumPizzas() >= 1) {
				System.out.println("Pizza 1");
				System.out.print("\t" + "Input pizza size (S,M,L): ");
					pizza1.setSize(input.next().charAt(0));
				System.out.print("\t" + "Input number of cheese toppings: ");
					pizza1.setNumCheese(input.nextInt());
				System.out.print("\t" + "Input number of pepperoni toppings: ");
					pizza1.setNumPepperoni(input.nextInt());
				System.out.print("\t" + "Input number of ham toppings: ");
					pizza1.setNumHam(input.nextInt());
				System.out.print(pizza1.getDescription());
				System.out.println();
			}

			if (order.getNumPizzas() >= 2) {
				System.out.println("Pizza 2");
				System.out.print("\t" + "Input pizza size (S,M,L): ");
					pizza2.setSize(input.next().charAt(0));
				System.out.print("\t" + "Input number of cheese toppings: ");
					pizza2.setNumCheese(input.nextInt());
				System.out.print("\t" + "Input number of pepperoni toppings: ");
					pizza2.setNumPepperoni(input.nextInt());
				System.out.print("\t" + "Input number of ham toppings: ");
					pizza2.setNumHam(input.nextInt());
				System.out.print(pizza2.getDescription());
				System.out.println();
			}

			if (order.getNumPizzas() >= 3) {
				System.out.println("Pizza 3");
				System.out.print("\t" + "Input pizza size (S,M,L): ");
					pizza3.setSize(input.next().charAt(0));
				System.out.print("\t" + "Input number of cheese toppings: ");
					pizza3.setNumCheese(input.nextInt());
				System.out.print("\t" + "Input number of pepperoni toppings: ");
					pizza3.setNumPepperoni(input.nextInt());
				System.out.print("\t" + "Input number of ham toppings: ");
					pizza3.setNumHam(input.nextInt());
				System.out.print(pizza3.getDescription());
				System.out.println();
			}
			order.setPizza1(pizza1);
			order.setPizza2(pizza2);
			order.setPizza3(pizza3);
			total = order.calcTotal(); 
			System.out.println("Total order cost: " + total);
			System.out.println();
			System.out.print("Try again (true or false)? ");
			if(input.nextBoolean() == true)
				loop = true;
			else 
				loop = false;
		} while(loop==true);
	}
	

/*
		Assignment5_Pizza pizza1 = new Assignment5_Pizza('L',1,0,1); // Code to create a large pizza, 1 cheese, 1 ham
		Assignment5_Pizza pizza2 = new Assignment5_Pizza('M',2,2,0); // Code to create a medium pizza, 2 cheese, 2 pepperoni
		//System.out.println(pizza1.calcCost());
		//System.out.println(pizza2.calcCost());
		Assignment5_PizzaOrder order = new Assignment5_PizzaOrder(); // Code to create an order
		order.setNumPizzas(2); // 2 pizzas in the order
		order.setPizza1(pizza1); // Set first pizza
		order.setPizza2(pizza2); // Set second pizza
		total = order.calcTotal(); // Should be 18+20 = 38
		System.out.println(total);
		System.out.println(pizza1.getDescription());
		System.out.println(pizza2.getDescription());
		*/
	}
