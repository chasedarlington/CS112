public class Assignment5_Pizza {
	private char size;
	private int num_cheese; 
	private int num_pepperoni;
	private int num_ham;
	private double cost;

	public Assignment5_Pizza() { //constructor
		size = 'S';
		num_cheese = 0; 
		num_pepperoni = 0;
		num_ham = 0;
	}

	public Assignment5_Pizza(char s) { //constructor overloading
		size = s;
		num_cheese = 0; 
		num_pepperoni = 0;
		num_ham = 0;
	}

	public Assignment5_Pizza(char s, int num_ch) { //constructor overloading
		size = s;
		num_cheese = num_ch; 
		num_pepperoni = 0;
		num_ham = 0;
	}

	public Assignment5_Pizza(char s, int num_ch, int num_pep) { //constructor overloading
		size = s;
		num_cheese = num_ch; 
		num_pepperoni = num_pep;
		num_ham = 0;
	}

	public Assignment5_Pizza(char s, int num_ch, int num_pep, int num_hm) { //constructor overloading
		size = s;
		num_cheese = num_ch; 
		num_pepperoni = num_pep;
		num_ham = num_hm;
	}

	public void setSize(char s) { //mutator method
		size = s;
	}

	public void setNumCheese(int num_ch) { //mutator method
		num_cheese = num_ch;
	}

	public void setNumPepperoni(int num_pep) { //mutator method
		num_pepperoni = num_pep;
	}

	public void setNumHam(int num_hm) { //mutator method
		num_ham = num_hm;
	}

	public char getSize() { //accessor method
		return size;
	}

	public int getNumCheese() { //accessor method
		return num_cheese;
	}

	public int getNumPepperoni() { //accessor method
		return num_pepperoni;
	}

	public int getNumHam() { //accessor method
		return num_ham;
	}

	public double calcCost() { //cost calculation method
		if (size == 'S' | size == 's')
			cost = 10 + 2 * (num_cheese + num_pepperoni + num_ham);	
		else if (size == 'M' | size == 'm')
			cost = 12 + 2 * (num_cheese + num_pepperoni + num_ham);
		else if (size == 'L' | size == 'l')
			cost = 14 + 2 * (num_cheese + num_pepperoni + num_ham);
		else 
			cost = 9999;
		return cost;
	}

	public String getDescription() {
		return ("\n" 
			+ "Pizza Size: " + size + "\n"
			+ "Quantity of Cheese Toppings: " + num_cheese + "\n"
			+ "Quantity of Pepperoni Toppings: " + num_pepperoni + "\n"
			+ "Quantity of Ham Toppings: " + num_ham + "\n"
			+ "Pizza Cost: $" + calcCost() + "\n");
	}
}