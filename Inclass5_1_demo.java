import java.util.Scanner;

public class Inclass5_1_demo
{
	public static void main(String [] args)
	{
		
		Scanner input = new Scanner(System.in);
		String x = "";
		long y = 0;
		float z = 0;


		//Run number ONE
		Inclass5_1 a1 = new Inclass5_1(); //Default constructor invoked
		System.out.println("Animal 1");
		System.out.println("\t" + a1.get_name());
		System.out.println("\t" + a1.get_population());
		System.out.println("\t" + a1.get_growth());

		//Run number TWO
		Inclass5_1 a2 = a1;
		System.out.println("Animal 2");
		System.out.println("\t" + a2.get_name());
		System.out.println("\t" + a2.get_population());
		System.out.println("\t" + a2.get_growth());
		
		//Run number THREE
		Inclass5_1 a3 = new Inclass5_1(x); //Other constructor invoked
		System.out.print("\n" +  "Enter an animal name: ");
		x = input.next();


		a3.set_name(x); // Invoking method of Animal class
		System.out.println("New Animal 3");
		System.out.println("\t" + a3.get_name());
		System.out.println("\t" + a3.get_population());
		System.out.println("\t" + a3.get_growth());

		//Run number FOUR
		Inclass5_1 a4 = new Inclass5_1(x,y); //Other constructor invoked
		System.out.print("\n" + "Enter an animal name and population: ");
		x = input.next();
		y = input.nextLong();

		a4.set_name(x); // Invoking method of Animal class
		a4.set_population(y);
		System.out.println("New Animal 4");
		System.out.println("\t" + a4.get_name());
		System.out.println("\t" + a4.get_population());
		System.out.println("\t" + a4.get_growth());

		//Run number FIVE
		Inclass5_1 a5 = new Inclass5_1(x,y,z); //Other constructor invoked
		System.out.print("\n" +  "Enter an animal name, population, and population growth rate: ");
		x = input.next();
		y = input.nextLong();
		z = input.nextFloat();
		
		a5.set_name(x); // Invoking method of Animal class
		a5.set_population(y); 
		a5.set_growth(z);
		System.out.println("New Animal 5");
		System.out.println("\t" + a5.get_name());
		System.out.println("\t" + a5.get_population());
		System.out.println("\t" + a5.get_growth());
		

/*
		if(r1==r2)
			System.out.println("Objects r1 and r2 are equal");
		else
			System.out.println("Objects r1 and r2  are not equal");
			*/

		
	}

}
