// Authors: Chase Darlington and Angela Richards

public class Inclass_Polymorphism1_Action extends Inclass_Polymorphism1_Movie 
{
	public Inclass_Polymorphism1_Action(String rating, int id, String title)
	{
		super(rating, id, title);
	}

	public void calcLateFees(int days)
	{
		late_fee = (double) (3 * days); //Action movies have a late fee of $3/day
	}
}