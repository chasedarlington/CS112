// Authors: Chase Darlington and Angela Richards

public class Inclass_Polymorphism1_Drama extends Inclass_Polymorphism1_Movie
{
	public Inclass_Polymorphism1_Drama(String rating, int id, String title)
	{
		super(rating, id, title);
	}

	public void calcLateFees(int days)
	{
		late_fee = (double) (2 * days); //dramas are $2/day	
	}
}