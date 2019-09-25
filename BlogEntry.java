import java.util.Arrays;

public class BlogEntry {
	
	private Date newDate; //initialize variable of type Date
	private String newUserName; //initialize variable of type String
	private String newString; //initialize variable of type String

	public BlogEntry() { //BlogEntry constructor
		newDate = new Date();	//invoke Date class constructor, allocates memory for the instance variables of Date class
		newUserName = ""; //default constructor value
		newString = ""; //default constructor value
	}

	public BlogEntry(String username, String m, int d, int y, String text){ //constructor overloading to accept inputs
		newDate = new Date();	//invoke Date class constructor, allocates memory for the instance variables of Date class
		newUserName = username; //assign input to variable value
		newDate.set_date(m,d,y); //implement set_date method to assign value to Date
		newString = text; //assign input to variable value
	}

	public void set_username(String username) { //mutator method
		newUserName	= username;
	}

	public void set_date(String m, int d, int y) { //mutator method
		newDate.set_date(m,d,y);
	}

	public void set_text(String text) { //mutator method
		newString = text;
	}

	public String get_username() { //accessor method for username (private variable)
		return newUserName;
	}

	public Date get_date() { //accessor method for date (private object)
		return newDate; //return newDate object (note: newDate is a variable that points to the Date object (memory space allocated for Date class))
	}

	public String get_text() { //accessor method for text (private variable)
		return newUserName;
	}

	public String DisplayEntry() {	//method to display full blog entry
		return ("------------------------------------"  + "\n" 
			+ newUserName + "\n" + newDate + "\n" + newString + "\n"
			+ "------------------------------------" + "\n"); //return string for entry
	}

	public String getSummaryChar() { //method to return summary
		if (newString.length() <= 10) //test if string length less than (or equal to) 10
			return newString; //print entire string as the summary
		else //if string length is greater than 10
			return newString.substring(0,10); //return substring (characters 0-10) as the summary
	}

	 public static int countWords(String n) { //method to count words
	    if (n == null || n.isEmpty()) { //return 0 if the text is null or empty
	      return 0;
	    }

	    String[] words = n.split("\\s+"); //split text on white spaces and feed this into an array
	    	return words.length; //take the length of the array to produce word count
	  }

	public String getSummaryWords(){
		
		if(countWords(newString)<=10) { //if less than 10 words
			return newString; //return full string
		}
		else {
			String[] words = newString.split("\\s+"); //else split the text on white spaces and feed into an array
			String[] subset = Arrays.copyOfRange(words,0,10); //take a subset of that array, selecting only 10 words
			return String.join(" ", subset); //convert this array to a string
		}
	}


}