import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Project2_Sudoku {
  int[][] board; //Instance variable for Sudoku board
  boolean[][] start; //Instance variable for boolean array of which Sudoku cells may be changed
	
/*
Project2_Sudoku: default constructor for creating a 9x9 empty puzzle
Parameters: none
Return Type: none
*/
  public Project2_Sudoku() { 
    board=new int[9][9]; //set empty 9x9 Sudoku board
    start=new boolean[9][9]; 
  }

/*
Project2_Sudoku: overloaded constructor for creating an empty puzzle of user determined size
Parameters: int size
Return Type: none
*/
	public Project2_Sudoku(int size) { 
		if (size%3==0) {
      board=new int[size][size]; //set empty Sudoku board
      start=new boolean[size][size]; 
    }
    else {
      board=new int[9][9]; //set empty 9x9 Sudoku board
      start=new boolean[9][9]; 
    } 
	}

/*
toString: returns a string representation of the puzzle that can be printed
Parameters: none
Return Type: String
*/
  public String toString(){
    String display = "\n    ";
    for (int a=1; a<=board[0].length; a++) //add column numbers according to size of board[0][]
      display += a + "  ";
    display+= "\n   ";
    for (int b=1; b<=board[0].length-1; b++) //add spacing according to size of board[0][]
      display += "---"; 
    display+= "--\n";
    for(int i=0; i<board.length; i++){ //start row loop
      display+= (i+1) + " |";
      for(int j=0; j<board[0].length; j++){ //start column loop
        if(board[i][j]==0) //if board value is 0, print . placeholder
          display+= " .|";
        else //otherwise print the board value
          display+= " " + board[i][j] + "|";
      } //end column loop
      display += "\n  |";
      for (int c=1; c<=board[0].length; c++) //add spacing between rows according to size of board[0][]
        display += "__|";
      display += "\n"; //print spacing between rows
    } //end row loop
    return display;
  }

/*
addInitial: sets the specified cell to the given value as an initial value that cannot be changed by the puzzle solver
Parameters: int row, int col, int value
Return Type: none
*/
	public void addInitial(int row, int col, int value) {
    if(row>=0 && row<=board.length && col>=0 && col<=board[0].length && value>=1 && value<=9) { //inputs must be 0 to 9
           start[row-1][col-1]=true; //cell is a start value & may not be changed
           board[row-1][col-1]=value; //set cell to value
    }
	}

/*
addGuess: sets the given square to the given value; the value can be changed later by another call to addGuess 
Parameters: int row, int col, int value
Return Type: void
*/
	public void addGuess(int row, int col, int value) {
		if (start[row-1][col-1] == false)
      board[row-1][col-1] = value;
	}

/*
checkpuzzle: returns true if the values in the puzzle do not violate the restrictions
Parameters: none
Return Type: boolean
*/
	public boolean checkPuzzle() {
    for (int i=1; i<=board.length; i++) {
      if (checkRow(i)==false||checkColumn(i)==false||checkSub(i)==false)//||checkSub(i)==false)
        return false;
    }
    //if (checkSubArrays()==false)
    //  return false;
    //else 
      return true;
  }

/*
checkRow: returns true if no number (1 to 9) is repeated in the specified row
Parameters: int row
Return Type: boolean
*/
 	public boolean checkRow(int row) {
    row -= 1;
    HashSet<Integer> set = new HashSet<>();
    for (int i=0; i<board.length; i++) {
      if (set.add(board[row][i]) == false)
        return false;    
    }
    return true;
 	}

/*
checkColumn: returns true if no number (1 to 9) is repeated in the specified column
Parameters: int row
Return Type: boolean
*/
 	public boolean checkColumn(int col) {
    col -= 1;
    HashSet<Integer> set = new HashSet<>();
    for (int i=0; i<board.length; i++) {
      if (set.add(board[i][col]) == false)
        return false;    
    }
    return true;
 	}

  
  public boolean checkSub(int sub)
    {        
        int count[]=new int[10];
        
        int rowBase=(sub/3)*3;//This will give 0, 3, or 6 because of integer division
        int colBase=(sub%3)*3;
        
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                count[board[rowBase+i][colBase+j]]++;
            }
        }
        
        boolean subOK=true;
        for(int i=1; i<=9; i++)
            subOK=subOK && (count[i]<=1);
        
        return subOK;
    }

// /*
// checkSubArrays: returns true if no number (1 to 9) is repeated in any subarray on the Sudoku board
// Parameters: none
// Return Type: boolean
// */
//  	public boolean checkSubArrays() {
//     HashSet<Integer> set = new HashSet<>();
//     for (int row=0; row<board.length; row+=3) {
//       for (int col=0; col<board[0].length; col+=3) {
//         for (int sub_row=row; sub_row<3; sub_row++) {
//           for (int sub_col=col; sub_col<3; sub_col++) {
//             if (set.add(board[sub_row][sub_col]) == false)
//               return false;
//           }
//         }
//         set.clear();
//       }
//     }  
//     return true;
//   }

/*
getValueIn: returns the value in the given cell
Parameters: int row, int col
Return Type: int
*/
	public int getValueIn(int row, int col){
		return board[row][col];
	}

/* 
getAllowedValues: returns a one-dimensional array of nine booleans, 
                  each of which corresponds to a digit and is true 
                  if the digit can be placed in the given square without violating the restrictions
Parameters: int row, int col
Return Type: boolean[] (corresponding to digits 1 to 9)
*/
	public boolean[] getAllowedValues(int row, int col) 
  {
       int savedValue=board[row][col];
       boolean result[]=new boolean[9];

       for(int value=1; value<=9; value++)
       {
           board[row][col]=value;
           result[value-1]=checkPuzzle();
       }
       board[row][col]=savedValue;

       return result;
   }


/*
isFull: returns true if every cell has a value
Parameters: none
Return Type: boolean
*/
	public boolean isFull() {
    for(int i=0; i<board.length; i++) { //iterate through every cell
			for(int j=0; j<board[0].length; j++) { 
				if (board[i][j] == 0) //if a cell is 0 (i.e. "blank"), end the for loops and return false
          return false;
      }
    }
		return true; //if after iterating through every cell, no cell is 0 (i.e. "blank"), return true
	}

/*
reset: changes all of the nonpermanent (noninitial) cells back to blanks (0s)
Parameters: none
Return Type: void
*/
	public void reset() {
		for(int i=0; i<board.length; i++)
			for(int j=0; j<board[0].length; j++)
				if (start[i][j]==false) //if not an initial value
          board[i][j]=0; //set to 0
	}

//additional manual game initialization methods

//initialize v3 game
  public void initV3() {
    addInitial(1,1,1);
    addInitial(2,1,4);
    addInitial(3,1,6);
    addInitial(4,1,3);
    addInitial(5,1,2);
    addInitial(6,1,9);
    addInitial(7,1,8);
    addInitial(8,1,7);
    addInitial(9,1,5);
    addInitial(1,1,1);
    addInitial(1,2,2);
    addInitial(1,3,3);
    addInitial(1,4,4);
    addInitial(1,5,9);
    addInitial(1,6,7);
    addInitial(1,7,8);
    addInitial(1,8,6);
    addInitial(1,9,5);
    addInitial(2,2,5);
    addInitial(2,3,9);
    addInitial(3,2,7);
    addInitial(3,3,8);
    addInitial(4,5,1);
    addInitial(6,6,5);
    addInitial(9,4,9);
}

}