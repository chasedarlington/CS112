//import necessary libraries
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.lang.StringBuilder;
import java.util.Scanner;



//Project1_Hangman: a class/program to make & play a game of hangman.
public class Project1_Hangman {
		private Random rand = new Random(); //
		private String answerString, hiddenString; //initialize string variables
		private List<String> list = new ArrayList<String>(); //initialize possible string list (possible answers)
		private List<Character> guessList = new ArrayList<Character>(); //intialize guessList array
		private StringBuilder sb1 = new StringBuilder(); //initialize string builder
		private int guessIndex, numTries, numBadTries, maxIncorrect; //initialize private integer variables
		
/*
Project1_Hangman (constructor): assigns default variables when the class is initialized 
Parameters: none
Return type: none
*/
		public Project1_Hangman() { //constructor; assigns default variables
			answerString = "NO STRING HAS BEEN SET"; //set default answer string
			hiddenString = "NO STRING HAS BEEN SET";  //set default hidden string
			maxIncorrect = 8; //set max number of incorrect answers
			list.add("MEAN GIRLS"); //Adding object in arraylist    
      		list.add("FAST AND FURIOUS"); //Adding object in arraylist    
      		list.add("STAR WARS"); //Adding object in arraylist    
      		list.add("PULP FICTION"); //Adding object in arraylist    
      		list.add("INDIANA JONES"); //Adding object in arraylist    
      		list.add("GOODWILL HUNTING"); //Adding object in arraylist    
      		list.add("THE HUNGER GAMES"); //Adding object in arraylist    
      		list.add("SNOW WHITE"); //Adding object in arraylist    
      		list.add("SLEEPING BEAUTY"); //Adding object in arraylist    
      		list.add("JAWS"); //Adding object in arraylist    
  		}

/*
getList: returns the current list of possible answers (possible string list)
Parameters: none
Return type: String
*/
  		public String getList() { //returns the current list of 
  			return list.toString();
  		}

/*
setAnswerString: manually sets the answer string
Parameters: none
Return type: none
*/  		
  		public void setAnswerString(String ans) { //set answer string manually
  			answerString = ans;
  			hiddenString = "";
  		}

/*
setRandomAnswerString: automatically sets a random answer string
Parameters: none
Return type: none
*/ 
		public void setRandomAnswerString() {
			answerString = list.get(rand.nextInt(list.size()));
			hiddenString="";
		}

/*
getAnswerString: retrieves answer string.
Parameters: none
Return type: String
*/ 
		public String getAnswerString() {
			return answerString;
		}

/*
setHiddenString: iterates through the answer string and hides each alphabetical character with an asterik
Parameters: none
Return type: none
*/ 
		public void setHiddenString() {
			for (int i = 0; i < answerString.length(); i++) {
				char character = answerString.charAt(i);
				if (Character.isAlphabetic(character) == true) {
					sb1.append("*");
				}
				else {
					sb1.append(answerString.charAt(i));
				}
			}
			hiddenString = sb1.toString();
		}

/*
getHiddenString: retrieves the hidden string
Parameters: none
Return type: String
*/ 
		public String getHiddenString() {
			return hiddenString;
		}

/*
getGuessList: retrieves the previously guessed characters array list (and converts this to a String)
Parameters: none
Return type: String
*/ 
		public String getGuessList() {
			return guessList.toString();
		}

/*
testGuess: tests a character for being alphabetical, new (not previously entered), and in the answer string.
		If it is in the answer string, the characters are revealed in the hidden string and the hidden string is returned. 
		Otherwise, the character is counted as an incorrect answer and an "incorrect" statement is returned.
Parameters: none
Return type: String
*/ 
		public String testGuess(char guess) {
			if (Character.isAlphabetic(guess) == false)
				return "THIS IS NOT AN ALPHABETICAL CHARACTER.";
			else if (guessList.contains(guess)) 
				return "THIS CHARACTER HAS ALREADY BEEN ENTERED.";
			else {	
				if(numBadTries <= maxIncorrect) {
					guessIndex = answerString.indexOf(guess);
					guessList.add(guess);
					if (guessIndex >= 0) {
						for (int i = 0; i < answerString.length(); i++) {
							if (answerString.charAt(i) == guess) 
								sb1.replace(i, i+1, Character.toString(guess));
						}
						hiddenString = sb1.toString();
						numTries++;
						return getHiddenString();
					}
					else {
						numBadTries++;
						numTries++;
						return ("INCORRECT. " + (maxIncorrect - numBadTries) + " incorrect attempts remaining." + "\n" + getHiddenString());
					}
				}
				else {
					return "";
				}

			}	
		}

/*
getNumTries: retrieves the number of tries
Parameters: none
Return type: int
*/ 
		public int getNumTries() {
			return numTries;
		}

/*
getNumBadTries: retrieves the number of bad tries
Parameters: none
Return type: int
*/ 
		public int getNumBadTries() {
			return numBadTries;
		}

/*
setMaxIncorrect: manually set the maximum number of incorrect answers
Parameters: int max
Return type: none
*/ 
		public void setMaxIncorrect(int max) {
			maxIncorrect = max;
		}

/*
getMaxIncorrect: retrieve the maximum number of incorrect answers
Parameters: none 
Return type: int
*/ 
		public int getMaxIncorrect() {
			return maxIncorrect;
		}

/*
main: start and run the hangman game
Parameters: none 
Return type: none
*/ 
		public static void main(String [] args) {
			Project1_Hangman hangman = new Project1_Hangman();
			Scanner input = new Scanner(System.in);
			hangman.setRandomAnswerString(); //randomly select a phrase
			hangman.setHiddenString();
			hangman.getHiddenString();
			System.out.println("This is hangman, a game designed to challenge your thinking and problem-solving skills. "
				+ "You will be given a hidden phrase, and your mission is to guess the phrase, letter by letter. Input only one letter at a time. "
				+ "If you make 8 incorrect guesses, you lose. If you correctly guess each letter, you win.");

			for (int i = 1; i <= 26; i++) { //26 letters in alphabet; technically duplicate inputs and invalid inputs will count as iterations of i, but 26 should be sufficient
				System.out.print("Input guess " + i + ": ");
				System.out.println(hangman.testGuess(input.next().toUpperCase().charAt(0)));
				if (hangman.getNumBadTries() == hangman.getMaxIncorrect()) {
					System.out.println("NUMBER OF INCORRECT ATTEMPTS EXCEEDED. GAME OVER.");
					System.exit(0);
				}
				
				else if (hangman.getHiddenString().contains("*")) {
					System.out.print("Guess again (true or false)? ");
					if (input.nextBoolean()==false) {
						System.exit(0);
					}
				}
			
				else {
					System.out.println("CONGRATULATIONS!!!! YOU WON IN " + hangman.getNumTries() + " TRIES!"); //not counting duplicates
					System.exit(0);
				}
			}		
		}

}