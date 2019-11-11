// Authors: Chase Darlington and Angela Richards

import java.util.Scanner;
import java.util.ArrayList;

public class Inclass_Polymorphism1_Demo
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of days late: ");
		int days = input.nextInt();
		System.out.println();

		ArrayList <Inclass_Polymorphism1_Movie> movies = new ArrayList<Inclass_Polymorphism1_Movie>();
		movies.add(new Inclass_Polymorphism1_Movie("PG", 2928, "Toy Story"));
		movies.add(new Inclass_Polymorphism1_Comedy("R", 1139, "Sex and the City"));
		movies.add(new Inclass_Polymorphism1_Drama("PG13", 2246, "Harry Potter: The Sorcerer's Stone"));
		movies.add(new Inclass_Polymorphism1_Action("R", 5596, "Zombieland"));
		for (int i=0; i < movies.size(); i++) {
			movies.get(i).calcLateFees(days);
			System.out.println(movies.get(i));
		}
	}
}