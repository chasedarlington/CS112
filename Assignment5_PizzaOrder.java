public class Assignment5_PizzaOrder {
	//private char size;
	//private int num_cheese; 
	//private int num_pepperoni;
	//private int num_ham;
	//private double cost;
	private int numPizzas;
	private double pizza1Cost, pizza2Cost, pizza3Cost, totalCost;

	public Assignment5_PizzaOrder(){ //constructor
		numPizzas = 0;
		pizza1Cost = 0;
		pizza2Cost = 0;
		pizza3Cost = 0;
	}

	public void setNumPizzas(int numPizzas){
		if (numPizzas < 1 | numPizzas > 3)
			numPizzas = 1;
		else 
			this.numPizzas = numPizzas;
	}

	public void setPizza1(Assignment5_Pizza pizza1) {
		if (numPizzas >= 1) {
			pizza1Cost = pizza1.calcCost();
		}
	}

	public void setPizza2(Assignment5_Pizza pizza2) {
		if (numPizzas >= 2) {
			pizza2Cost = pizza2.calcCost();
		}
	}

	public void setPizza3(Assignment5_Pizza pizza3) {
		if (numPizzas >= 3) {
			pizza3Cost = pizza3.calcCost();
		}
	}

	public int getNumPizzas() {
		return numPizzas;
	}

	public double getPizza1() {
		if (numPizzas >= 1) {
			return pizza1Cost;
		}
		else return 0;
	}

	public double getPizza2() {
		if (numPizzas >= 2) {
			return pizza2Cost;
		}
		else return 0;
	}

	public double getPizza3() {
		if (numPizzas >= 3) {
			return pizza3Cost;
		}
		else return 0;
	}

	public double calcTotal() {
		totalCost = pizza1Cost + pizza2Cost + pizza3Cost;
		return totalCost;
	}

	/*public void Assignment5_Pizza() { //constructor
		size = 'S';
		num_cheese = 0; 
		num_pepperoni = 0;
		num_ham = 0;
	}

	public void Assignment5_Pizza(char s) { //constructor overloading
		size = s;
		num_cheese = 0; 
		num_pepperoni = 0;
		num_ham = 0;
	}

	public void Assignment5_Pizza(char s, int num_ch) { //constructor overloading
		size = s;
		num_cheese = num_ch; 
		num_pepperoni = 0;
		num_ham = 0;
	}

	public void Assignment5_Pizza(char s, int num_ch, int num_pep) { //constructor overloading
		size = s;
		num_cheese = num_ch; 
		num_pepperoni = num_pep;
		num_ham = 0;
	}

	public void Assignment5_Pizza(char s, int num_ch, int num_pep, int num_hm) { //constructor overloading
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

	public char getSize() { //mutator method
		return size;
	}

	public int getNumCheese() { //mutator method
		return num_cheese;
	}

	public int getNumPepperoni() { //mutator method
		return num_pepperoni;
	}

	public int getNumHam() { //mutator method
		return num_ham;
	}

	public double calcCost() { //cost calculation method
		switch (size) {
		case ('S'|'s'):
			cost = 10 + 2 * (num_cheese + num_pepperoni + num_ham);
			break;
		case ('M'|'m'):
			cost = 12 + 2 * (num_cheese + num_pepperoni + num_ham);
			break;
		case ('L'|'l'): 
			cost = 14 + 2 * (num_cheese + num_pepperoni + num_ham);
			break;
		default:
			cost = 10 + 2 * (num_cheese + num_pepperoni + num_ham);
		}
		return cost;
	}

	public String getDescription() {
		return ("\n" 
			+ "Pizza Size: " + size + "\n"
			+ "Quantity of Cheese Toppings: " + num_cheese + "\n"
			+ "Quantity of Pepperoni Toppings: " + num_pepperoni + "\n"
			+ "Quantity of Ham Toppings: " + num_ham + "\n"
			+ "Pizza Cost: $" + calcCost() + "\n");
	}*/

}