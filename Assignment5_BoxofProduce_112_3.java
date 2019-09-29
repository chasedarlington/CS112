import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class Assignment5_BoxOfProduce_112_3 {
	private String item1, item2, item3;
	private String content;
	private List<String> list = new ArrayList<String>();
	private Random rand = new Random();
	private String randomElement;

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

	public void readText(Path filePath) {
		try {
			String content = Files.readString(filePath);
			//System.out.println(content); test
			String str[] = content.split("\n");
			list = Arrays.asList(str);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getText() {
		return content;
	}

	public void setRandomItem1() {
		randomElement = list.get(rand.nextInt(list.size()));
		item1 = randomElement;
	}

	public void setRandomItem2() {
		randomElement = list.get(rand.nextInt(list.size()));
		item2 = randomElement;
	}

	public void setRandomItem3() {
		randomElement = list.get(rand.nextInt(list.size()));
		item3 = randomElement;
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

	public String getItem1() { //accessor method
		return item1;
	}

	public String getItem2() { //accessor method
		return item2;
	}

	public String getItem3() { //accessor method
		return item3;
	}

	public String toString() {
		return ("\n" + "Box of Produce Contents: " + "\n"
			+ "\t" + "Item 1: " + item1 + "\n" 
			+ "\t" + "Item 2: " + item2 + "\n"
			+ "\t" + "Item 3: " + item3 + "\n");
	}
	

}
