// 2. You are interested in keeping track of the team members and 
// competition information for your school’s annual entries in computer 
// science programming competitions. Each team consists of exactly four 
// team members. Every year your team competes in two competitions. As 
// an initial start for your database, create a class named Team that 
// has the following instance variables:
// 	private String teamName; // Name for the team
// 	private String name1, name2, name3, name4; // Names for each team members.
// 	private Competition competition1, competition2; // Info on each competition

// Note that there is a much better way to represent the team members and competitions using arrays; 
// this is covered in a subsequent chapter. The class should also have a method that outputs the names 
// of all team members and the competition information to the console.

// Implement the Team and Competition classes with appropriate constructor, accessor, 
// and mutator methods. In entering data for past competitions, you note that an entry 
// is usually very similar to the previous year’s entry. To help with the data entry, 
// create a deep copy constructor for the Team class. Test your copy constructor by 
// creating a copy of an existing team object, changing the competition information for 
// the copy, and outputting the data for the original and the copy. The original object 
// should be unchanged if your deep copy constructor is working properly.

public class Assignment6_Team {

	private String teamName; // Name for the team
	private String name1, name2, name3, name4; // Names for each team members.
	private Assignment6_Competition competition1, competition2; // Info on each competition

/* 
constructor 1: copy constructor
Parameters: Assignment6_Team other
Return Type: none
*/
	public Assignment6_Team(Assignment6_Team other) {
		this.teamName=other.teamName;
		this.name1=other.name1;
		this.name2=other.name2;
		this.name3=other.name3;
		this.name4=other.name4;
		this.competition1 = other.competition1;
		this.competition2 = other.competition2;
	}

/* 
constructor 2: constructor setting variable values (when input is provided)
Parameters: String teamName, String name1, String name2, String name3, String name4, 
			Assignment6_Competition competition1, Assignment6_Competition competition2
Return Type: none
*/
	public Assignment6_Team(String teamName, String name1, String name2, String name3, String name4, 
							Assignment6_Competition competition1, Assignment6_Competition competition2) {
		this.teamName=teamName;
		this.name1=name1;
		this.name2=name2;
		this.name3=name3;
		this.name4=name4;
		this.competition1 = competition1;
		this.competition2 = competition2;
	}

/*
setTeamName: set team name
Parameters: String teamName
Return Type: void
*/
	public void setTeamName(String teamName) {
		this.teamName=teamName;
	}

/*
setName1: set name 1
Parameters: String name1
Return Type: void
*/
	public void setName1(String name1) {
		this.name1=name1;
	}

/*
setName2: set name 2
Parameters: String name2
Return Type: void
*/
	public void setName2(String name2) {
		this.name2=name2;
	}

/*
setName3: set name 3
Parameters: String name3
Return Type: void
*/
	public void setName3(String name3) {
		this.name3=name3;
	}

/*
setName4: set name 4
Parameters: String name4
Return Type: void
*/
	public void setName4(String name4) {
		this.name4=name4;
	}

/*
setCompetition1: set competition 1
Parameters: Assignment6_Competition competition1
Return Type: void
*/
	public void setCompetition1(Assignment6_Competition competition1) {
		this.competition1 = competition1;
	}

/*
setCompetition2: set competition 2
Parameters: Assignment6_Competition competition2
Return Type: void
*/
	public void setCompetition2(Assignment6_Competition competition2) {
		this.competition2 = competition2;
	}

/* 
getTeamName: return team name
Parameters: none
Return Type: String
*/
	public String getTeamName() {
		return teamName;
	}

/* 
getName1: return name 1
Parameters: none
Return Type: String
*/
	public String getName1() {
		return name1;
	}

/* 
getName2: return name 2
Parameters: none
Return Type: String
*/
	public String getName2() {
		return name2;
	}

/* 
getName3: return name 3
Parameters: none
Return Type: String
*/
	public String getName3() {
		return name3;
	}

/* 
getName4: return name 4
Parameters: none
Return Type: String
*/
	public String getName4() {
		return name4;
	}

/* 
getCompetition1: return competition 1
Parameters: none
Return Type: Assignment6_Competition
*/
	public Assignment6_Competition getCompetition1() {
		return competition1;
	}

/* 
getCompetition2: return competition 2
Parameters: none
Return Type: Assignment6_Competition
*/
	public Assignment6_Competition getCompetition2() {
		return competition2;
	}

/* 
toString: outputs the names of all team members and the competition information to the console.
Parameters: none
Return Type: String
*/
	public String toString() {
		return ("\n" + "Team: " + teamName + "\n" + "Names: " 
			+ name1 
			+ ", " + name2 
			+ ", " + name3
			+ ", " + name4 
			+ "\n" + "Competition 1"
			+ "\n" + competition1.toString() 
			+ "\n" + "Competition 2"
			+ "\n" + competition2.toString());
	}


	public static void main(String [] args) {
		Assignment6_Competition comp1_2016 = new Assignment6_Competition("Harvard Hackathon", "MIT", "Stanford", 2016);
		Assignment6_Competition comp1_2017 = new Assignment6_Competition("Harvard Hackathon", "Harvard", "MIT", 2017);
		Assignment6_Competition comp1_2018 = new Assignment6_Competition("Harvard Hackathon", "Stanford", "Berkeley", 2018);
		Assignment6_Competition comp1_2019 = new Assignment6_Competition("Harvard Hackathon", "USF", "Texas A&M", 2019);
		Assignment6_Competition comp2_2016 = new Assignment6_Competition("Stanford Hackathon", "Stanford", "Cornell", 2016);
		Assignment6_Competition comp2_2017 = new Assignment6_Competition("Stanford Hackathon", "Stanford", "Purdue", 2017);
		Assignment6_Competition comp2_2018 = new Assignment6_Competition("Stanford Hackathon", "Stanford", "Berkeley", 2018);
		Assignment6_Competition comp2_2019 = new Assignment6_Competition("Stanford Hackathon", "Stanford", "USF", 2019);

		Assignment6_Team team2016 = new Assignment6_Team("USF", "Jack", "Jill", "John", "Jessica", comp1_2016, comp2_2016);
			System.out.println(team2016.toString());
		Assignment6_Team team2017 = new Assignment6_Team(team2016);	
			team2017.setCompetition1(comp1_2017);
			team2017.setCompetition2(comp2_2017);
			System.out.println(team2017.toString());
		Assignment6_Team team2018 = new Assignment6_Team(team2017);	
			team2018.setCompetition1(comp1_2018);
			team2018.setCompetition2(comp2_2018);
			System.out.println(team2018.toString());
		Assignment6_Team team2019 = new Assignment6_Team(team2018);	
			team2019.setCompetition1(comp1_2019);
			team2019.setCompetition2(comp2_2019);
			System.out.println(team2019.toString());
	}
}