import java.util.Scanner;

public class Project2_Sudoku_demo {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\n" + "WELCOME TO ALVIN AND CHASE'S SUDOKU GAME!!!");
		//System.out.println("3 - Very Easy\n6 - Easy\n9 - Medium\n12 - Hard\n15 - Very Hard");
		//System.out.print("Select your difficulty: ");
		//int size = input.nextInt();
		int size = 9;
		Project2_Sudoku puzzle = new Project2_Sudoku(size);
		// puzzle.addInitial(1,1,1);
		// puzzle.addInitial(1,2,2);
		// puzzle.addInitial(1,3,3);
		// puzzle.addInitial(2,1,4);
		// puzzle.addInitial(2,2,5);
		// puzzle.addInitial(2,3,9);
		// puzzle.addInitial(3,1,6);
		// puzzle.addInitial(3,2,7);
		puzzle.initV3(); //adding initial values
    
    System.out.print(puzzle.toString());
    int row, column, value, hintRow, hintColumn;
    boolean cont=true;
    while(cont==true) {
      System.out.println();
      System.out.println("1. Make a guess");
      System.out.println("2. Display solution");
      System.out.println("3. Get a hint");
      System.out.println("4. Check your solution");
      System.out.println("5. Quit");      
      System.out.print("Select an option: ");
      switch(input.nextInt()) {
        case 1:
			System.out.print("Row: ");   
			row = input.nextInt();
        	System.out.print("Column: ");      
        	column = input.nextInt();
        	System.out.print("Value: ");
        	value = input.nextInt();
	        puzzle.addGuess(row, column, value);        
	        System.out.println(puzzle);       
	        break;
	    case 2:
	    	System.out.println(puzzle);
	    	break;
        
        case 3:
        	System.out.print("Select hint cell row: ");
        	hintRow = input.nextInt()-1;
        	System.out.print("Select hint cell column: ");
        	hintColumn = input.nextInt()-1;
	        boolean valid[]=puzzle.getAllowedValues(hintRow, hintColumn);

	        System.out.print("Allowed values are: ");
	        for(int i=0; i<9; i++)
	        	if(valid[i])
	        		System.out.print((i+1)+" ");
	        System.out.println();
		    break;
	    case 4: 
	    	if (puzzle.checkPuzzle()==true) {
	    		System.out.println("Congratulations, you have completed the puzzle!");
	    		cont = false;
	    		break;
	    	}
	    	else {
	    		System.out.println("There is an error in the puzzle");
	    		break;
	    	}
	    case 5:        
        	cont = false; 
        	break;
      } 
    } //while loop ends if cont is false (i.e. case 4) */
//     if puzzle.checkPuzzle()
//     	System.out.println("Congratulations, you have completed the puzzle!");
//     else 
//     	System.out.println
// ///    if((!puzzle.isFull()) || !(puzzle.checkPuzzle()))
//       System.out.println("You have made an error in the puzzle.");
//     else if((puzzle.isFull()) && (puzzle.checkPuzzle()))
//       System.out.println("Congratulations, you have completed the puzzle.");
  }
}
 