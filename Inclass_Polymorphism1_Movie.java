// Authors: Chase Darlington and Angela Richards

/*
Prompt: Create a class named Movie that can be used with your video rental business. 
The Movie class should track the Motion Picture Association of America (MPAA) 
rating (e.g., Rated G, PG-13, R), ID Number, and movie title with appropriate 
accessor and mutator methods. Also create an equals() method that overrides
Object’s equals() method, where two movies are equal if their ID number is identical. 
Next, create three additional classes named Action, Comedy, and Drama that are 
derived from Movie. Finally, create an overridden method named calcLateFees that 
takes as input the number of days a movie is late and returns the late fee for that movie. 
The default late fee is $2/day. Action movies have a late fee of $3/day, comedies are 
$2.50/day, and dramas are $2/day. Test your classes from a main method.
*/

public class Inclass_Polymorphism1_Movie
{
	private String rating; //the Motion Picture Association of America (MPAA) rating
	private int id; //movie id #
	private String title; //movie title
	public double late_fee = 0; //late fee (in dollars)


	public Inclass_Polymorphism1_Movie(String rating, int id, String title)
	{
		this.rating = rating;
		this.id = id;
		this.title = title;
	}

	public void setRating(String rating)
	{
		this.rating = rating;
	}

	public String getRating()
	{
		return rating;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getId()
	{
		return id;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getTitle()
	{
		return title;
	}

	public Boolean equals(int id)
	{
		if(this.id == id)
			return true;
		else
			return false;
	}

	public Boolean equals(Inclass_Polymorphism1_Movie movie)
	{
		if(movie.getId() == id)
			return true;
		else
			return false;
	}

	public String toString()
	{
		return ("Rating: " + rating + "\nID: " + id + "\nTitle: " + title + "\nLate Fee: " + late_fee + "\n");
	}

/* 
calcLateFees: takes as input the number of days a movie is late and returns the late fee for that movie. 
The default late fee is $2/day. Action movies have a late fee of $3/day, comedies are $2.50/day, and dramas are $2/day.
Parameters: int input
Return Type: double
*/
    public void calcLateFees(int days)
    {
		late_fee = (double)(2 * days); //The default late fee is $2/day.
	}

}


