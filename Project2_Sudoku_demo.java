/*
By: Alvin Tran and Chase Darlington
*/

import java.util.*;

public class Project2_Sudoku_demo {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in); 

    Project2_Sudoku puzzle=new Project2_Sudoku();//Creation of Project2_Sudoku object
    System.out.println("What kind of puzzle do you want?");     
    System.out.print("1 for Test/ 2 for Real: ");  
    int puzzleType=input.nextInt();//Allows User to choose what sort of puzzle to play    
    System.out.println(" ");

    switch(puzzleType) {
      case 1:
      puzzle.initializeTestPuzzle(puzzle);//Initializes TestPuzzle
      break;

      case 2:
      puzzle.initializeRealPuzzle(puzzle);//Initializes more RealPuzzle
      break;
    } 
   
    System.out.println("Sudoku Game: ");
    System.out.print("The puzzle is: \n"+puzzle);
    System.out.println(" ");
    boolean done=false;

//While loop runs while done is false
    while(done!=true) {
      System.out.println(" ");
      System.out.println("What would you like to do?");
      System.out.println("1. Clear puzzle.");
      System.out.println("2. Set a square.");
      System.out.println("3. Get possible values.");
      System.out.println("4. Display puzzle.");      
      System.out.println("5. Display a square.");
      System.out.println("6. Quit.");      
      System.out.println(" ");

      int menu=input.nextInt();
           
      switch(menu) {
        case 1:
          puzzle.reset();//Calling reset
          System.out.println("Reset!");        
          System.out.println(" ");
          System.out.print("The puzzle is now: \n"+puzzle);       
          break;
        case 2:       
          System.out.println(" ");      
          System.out.println("Which row (1-9) and column (1-9) do you want to change?");
          int row=input.nextInt()-1;//-1 accounts for array starting at 0
          int col=input.nextInt()-1;//-1 accounts for array starting at 0
          System.out.println(" ");
          System.out.println("What should the value (1-9) be?");
          int value=input.nextInt();
          puzzle.addGuess(row, col, value);//Calling addGuess        
          System.out.println(" ");
          System.out.print("The puzzle is now: \n"+puzzle);       
          break;
        case 3:        
          System.out.println(" ");     
          System.out.println("Which row (1-9) and column (1-9) do you want to get values for?");
          int rowCheck=input.nextInt()-1;//-1 accounts for array starting at 0
          int colCheck=input.nextInt()-1;//-1 accounts for array starting at 0    
          System.out.println(" ");

          boolean valid[]=puzzle.getAllowedValues(rowCheck, colCheck);
          System.out.print("Allowed values are: ");
          for(int i=0; i<9; i++)//Allowed values are added to array and printed out depending on whether boolean is true or false
            if(valid[i])
              System.out.print((i+1)+" ");
            System.out.println();
          break;
        case 4:      
          System.out.println(" ");
          System.out.print("The puzzle is now: \n"+puzzle);//Displaying puzzle       
          System.out.println(" ");
          break;
        case 5:        
          System.out.println(" ");     
          System.out.println("Which row (1-9) and column (1-9) do you want to get the value of?");
          int rowValueCheck=input.nextInt()-1;//-1 accounts for array starting at 0
          int colValueCheck=input.nextInt()-1;//-1 accounts for array starting at 0    
          System.out.println(" ");
          System.out.println("Value of Row: "+(rowValueCheck+1)
            + " Column: "+(colValueCheck+1)+" is: "
            + puzzle.getValueIn(rowValueCheck, colValueCheck));//Calling getValueIn
          break;
        case 6:        
          System.out.println(" ");     
          System.out.println("Thanks for playing.");
          done=true;//done is true to exit while loop
      }
    }
    System.out.println(" ");
    System.out.print("The puzzle is now: \n" + puzzle);     
    System.out.println(" ");
    if((puzzle.isFull()) && (puzzle.checkPuzzle()))//Executes if both return true
      System.out.println("Congratulations, you have completed the puzzle.");    
    else if((!puzzle.checkPuzzle()) || (!puzzle.isFull()))//Executes if either return false
      System.out.println("You have made an error in the puzzle.");
  }
}
 




