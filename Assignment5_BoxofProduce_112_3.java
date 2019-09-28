public class Assignment5_BoxOfProduce_112_3 {
	private String item1, item2, item3;

	public Assignment5_BoxOfProduce_112_3() { //constructor method
		item1="";
		item2="";
		item3="";
	} 
	
	public Assignment5_BoxOfProduce_112_3(String pOne) { //constructor overloading
		item1=pOne;
		item2="";
		item3="";
	} 

	public Assignment5_BoxOfProduce_112_3(String pOne, String pTwo) { //constructor overloading
		item1=pOne;
		item2=pTwo;
		item3="";
	} 

	public Assignment5_BoxOfProduce_112_3(String pOne, String pTwo, String pThree) { //constructor overloading
		item1=pOne;
		item2=pTwo;
		item3=pThree;
	} 

	public void setItem1(String pOne) { //mutator method
		item1 = pOne;
	}

	public void setItem2(String pTwo) { //mutator method
		item2 = pTwo;
	}

	public void setItem3(String pThree) { //mutator method
		item3 = pThree;
	}

	public String getItem1(String pOne) { //accessor method
		return item1;
	}

	public String getItem2(String pTwo) { //accessor method
		return item2;
	}

	public String getItem3(String pThree) { //accessor method
		return item3;
	}

	public String toString() {
		return ("\n"
			+ "Item 1: " + item1 + "\n" 
			+ "Item 2: " + item2 + "\n"
			+ "Item 3: " + item3 + "\n");
	}
	


}
