/* 
	Person.java
	Author : Anita Rathi
	Base Class 
*/
	
import java.util.Scanner;

public class Inclass_Inheritance1_Person
{
	private String name;

	public Inclass_Inheritance1_Person()
	{
		this("No name");
	
	}

	public Inclass_Inheritance1_Person(Inclass_Inheritance1_Person other)
	{
		name=other.name;
	}

	public Inclass_Inheritance1_Person(String n)
	{
		name=n;
	}

	public void set(String n)
	{
		name=n;
	}

	public String get()
	{
		return name;
	}

	public String toString()
	{
		return("Name= " + name);
	}
	
	public static void display()
	{
		System.out.println("This is Person class");
	}

	public boolean equals(Inclass_Inheritance1_Person other)
	{
		return(name.equalsIgnoreCase(other.get()));
	}
}
			

	
