// The Competition class contains variables to track the following:

// String: Name of the competition, Name of the winning team, Name of the runner-up

// Integer: Year of the competition

// Implement the Team and Competition classes with appropriate constructor, accessor, and mutator methods. 
// In entering data for past competitions, you note that an entry is usually very similar to the previous year’s entry. 
// To help with the data entry, create a deep copy constructor for the Team class. Test your copy constructor by creating 
// a copy of an existing team object, changing the competition information for the copy, and outputting the data for the 
// original and the copy. The original object should be unchanged if your deep copy constructor is working properly.

public class Assignment6_Competition {

	private String competition, winner, runnerUp; //Name of the competition, Name of the winning team, Name of the runner-up
	private int year; //Year of the competition

// /* 
// constructor 1: copy constructor
// Parameters: Assignment6_Competition other
// Return Type: none
// */
// 	public Assignment6_Competition(Assignment6_Competition other) {
// 		this.competition=other.competition;
// 		this.winner=other.winner;
// 		this.runnerUp=other.runnerUp;
// 		this.year=other.year;
// 	}

/* 
constructor 2: constructor setting variable values (when input is provided)
Parameters: String competition, String winner, String runnerUp, int year
Return Type: none
*/
	public Assignment6_Competition(String competition, String winner, String runnerUp, int year) { //constructor overloading
		this.competition=competition;
		this.winner=winner;
		this.runnerUp=runnerUp;
		this.year=year;
	}

/* 
setCompetition: set competition name
Parameters: String competition
Return Type: void
*/
	public void setCompetition(String competition) {
		this.competition=competition;
	}

/* 
setCompetition: set competition winner
Parameters: String winner
Return Type: void
*/
	public void setWinner(String winner) {
		this.winner=winner;
	}

/* 
setCompetition: set competition runner-up
Parameters: String runnerUp
Return Type: void
*/
	public void setRunnerUp(String runnerUp) {
		this.runnerUp=runnerUp;
	}

/* 
setCompetition: set competition year
Parameters: String year
Return Type: void
*/
	public void setYear(int year) {
		this.year=year;
	}

/* 
getCompetition: return competition name
Parameters: none
Return Type: String
*/
	public String getCompetition() {
		return competition;
	}

/* 
getWinner: return competition winner
Parameters: none
Return Type: String
*/
	public String getWinner() {
		return winner;
	}

/* 
getRunnerUp: return competition runner-up
Parameters: none
Return Type: String
*/
	public String getRunnerUp() {
		return runnerUp;
	}

/* 
getYear: return competition year
Parameters: none
Return Type: int
*/
	public int getYear() {
		return year;
	}

/* 
toString: outputs the competition information
Parameters: none
Return Type: String
*/
	public String toString() {
		return ("\t" + "Competition Name: " + competition + "\n" 
			+ "\t" + "Winner: " + winner + "\n"
			+ "\t" + "Runner-up: " + runnerUp + "\n" 
			+ "\t" + "Year: " + year);
	}
}