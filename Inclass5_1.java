import java.util.Scanner;

public class Inclass5_1
{
	//define instance variable or species name, population, and growth rate

	//define constructors

	private String name; //define name instance as private string
	private long population; //define population instance as private long
	private float growth_rate; //define growth instance as private float

	public Inclass5_1() //create default constructor
	{
		name = "Human"; //default value
		population = 7700000000L; //default value
		growth_rate = (float) 0.0108; //default value
	}

	public Inclass5_1(String nm) //constructor overloading
	{
		name = nm; //input value
		population = 0; //default value
		growth_rate = 0; //default value
	}

	public Inclass5_1(String nm, long pop) //constructor overloading
	{
		name = nm; //input value
		population = pop; //input value
		growth_rate = 0; //default value
	}

	public Inclass5_1(String nm, long pop, float gr) //constructor overloading
	{
		name = nm; //input value
		population = pop; //input value
		growth_rate = gr; //input value
	}

	public void set_name(String nm) //mutator method to set name
	{
		name = nm;
	}

	public void set_population(long pop) //mutator method to set population
	{
		population = pop;
	}

	public void set_growth(float gr) //mutator method to set growth rate
	{
		growth_rate = gr;
	}

	public String get_name() //accessor method for name
	{
		return name;
	}

	public long get_population() //accessor method for name
	{
		return population;
	}

	public float get_growth() //accessor method for name
	{
		return growth_rate;	
	}
/*
	public String toString()
	{
		return("Name: " + name + "Population: " + population + " Growth: " + growth);
	}

	public String equals(Animal a)
	{
		if((this.population==other.population) && (this.growth==other.growth))
					return true;
				else
					return false;
	}
	

	public boolean endangered(Animal)
	{
		if(growth<0)
			return true;
		else
			return false;
	}
*/
}