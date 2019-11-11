// Authors: Chase Darlington and Angela Richards

public class Inclass_Polymorphism1_Comedy extends Inclass_Polymorphism1_Movie
{
	public Inclass_Polymorphism1_Comedy(String rating, int id, String title)
	{
		super(rating, id, title);
	}

	public void calcLateFees(int days)
	{
		late_fee = (2.5 * days); //comedies are $2.50/day
	}

}