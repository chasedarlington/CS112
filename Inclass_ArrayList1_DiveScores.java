/* check 6-2 for array list */



/* 
1. In the sport of diving, seven judges award a score between 0 and 10, 
where each score may be a floating-point value. The highest and lowest scores 
are thrown out, and the remaining scores are added together. The sum is then 
multiplied by the degree of difficulty for that dive. The degree of difficulty
ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine 
the diver’s score. Write a computer program that inputs a degree of difficulty 
and seven judges’ scores and outputs the overall score for that dive. The program 
should use an ArrayList of type Double to store the scores.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Inclass_ArrayList1_DiveScores {

	public judges = 7; //7 judgess
	private ArrayList<Double> scoreList = new ArrayList<Double>(); 
	private double compScore, difficulty;

	public void setDifficulty(double diff) { 
		/* The degree of difficulty ranges from 1.2 to 3.8 points */
		if (diff>=1.2 && diff<=3.8)
			this.difficulty = diff;
	}

	public void addScore(double score) {
		/* floating point score 0 to 10 */
		if (score>=0 && score <=10) 
			scoreList.add(score);
	}

	public double calc_score(ArrayList scores){
		/* The highest and lowest scores are thrown out */
		scoreList.remove(max(scoreList)); 
		scoreList.remove(min(scoreList)); 
		/* The remaining scores are added together. The sum is then 
		multiplied by the degree of difficulty for that dive.The total 
		is then multiplied by 0.6 to determine the diver’s score.  */
		compScore = sum(scoreList) * difficulty * 0.6;
	}

	public double getDifficulty() {
		return difficulty;
	}

	public double getCompScore() {
		return compScore;
	}

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Inclass_ArrayList1_DiveScores dive1 = new Inclass_ArrayList1_DiveScores();
		dive1.setDifficulty();
		dive1.addScore();

		for (int i=0; i<=judges; i++) {
			System.out.print("[Judge " + i + "] Input score: ");
			input.nextDouble();
		}
		
	}
}


/*
2. Write a program that uses an ArrayList of parameter type 
Contact to store a database of contacts. The Contact class 
should store the contact’s first and last name, phone number, 
and email address. Add appropriate accessor and mutator methods. 
Your database program should present a menu that allows the user 
to add a contact, display all contacts, search for a specific 
contact and display it, or search for a specific contact and 
give the user the option to delete it. The searches should find 
any contact where any instance variable contains a target search 
string. For example, if “elmore” is the search target, then any 
contact where the first name, last name, phone number, or email 
address contains “elmore” should be returned for display or deletion. 
Use the “for-each” loop to iterate through the ArrayList.
*/