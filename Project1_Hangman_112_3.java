import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.lang.StringBuilder;
import java.util.Scanner;

public class Project1_Hangman_112_3 {
		private Random rand = new Random();
		private String answerString, hiddenString;
		private List<String> list = new ArrayList<String>();
		private List<Character> guessList = new ArrayList<Character>();
		private StringBuilder sb1 = new StringBuilder();
		private int guessIndex, numTries, numBadTries, maxIncorrect;
		
		public Project1_Hangman_112_3() {
			answerString = "NO STRING HAS BEEN SET";
			hiddenString = "NO STRING HAS BEEN SET";
			maxIncorrect = 8;
			list.add("MEAN GIRLS");//Adding object in arraylist    
      		list.add("FAST AND FURIOUS");
      		list.add("STAR WARS");
      		list.add("PULP FICTION");
      		list.add("INDIANA JONES");
      		list.add("GOODWILL HUNTING");
      		list.add("THE HUNGER GAMES");
      		list.add("SNOW WHITE");
      		list.add("SLEEPING BEAUTY");
      		list.add("JAWS");
  		}

  		public String getList() {
  			return list.toString();
  		}

  		public void setAnswerString(String ans) {
  			answerString = ans;
  			hiddenString = "";
  		}

		public void setRandomAnswerString() {
			answerString = list.get(rand.nextInt(list.size()));
			hiddenString="";
		}

		public String getAnswerString() {
			return answerString;
		}

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

		public String getHiddenString() {
			return hiddenString;
		}

		public String getGuessList() {
			return guessList.toString();
		}

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

		public int getNumTries() {
			return numTries;
		}

		public int getNumBadTries() {
			return numBadTries;
		}

		public void setMaxIncorrect(int max) {
			maxIncorrect = max;
		}

		public int getMaxIncorrect() {
			return maxIncorrect;
		}

		public static void main(String [] args) {
			Project1_Hangman_112_3 hangman = new Project1_Hangman_112_3();
			Scanner input = new Scanner(System.in);
			//System.out.println(Hangman.getList()); //check list of available phrases
			//hangman.setAnswerString("TEST"); //manually select phrase
			hangman.setRandomAnswerString(); //randomly select a phrase
			hangman.setHiddenString();
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
			

			//System.out.println(hangman.getHiddenString()); //manually check current hidden string
			//System.out.println(hangman.getGuessList()); check list of guesses

		
		}

}