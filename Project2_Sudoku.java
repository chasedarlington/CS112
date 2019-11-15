/*
By: Alvin Tran and Chase Darlington
*/

public class Project2_Sudoku
{
/*----------------INSTANCE VARIABLES----------------*/
	private int [][]board;
	private int [][]initialBoard;
	private boolean [][]cellChangeable;

/*----------------CONSTRUCTOR METHODS----------------*/
// Default constructor (create empty puzzle)
	public Project2_Sudoku() {
		board = new int[9][9];
		initialBoard = new int[9][9];
		cellChangeable = new boolean[9][9];
	}

// Copy constructor
	public Project2_Sudoku(Project2_Sudoku puzzle) {
		board = puzzle.getBoard();
		initialBoard = puzzle.getInitialBoard();
		cellChangeable = puzzle.getCellChangeable();
	}

/*----------------ACCESSOR METHODS----------------*/
	public int[][] getBoard() {
		return board;
	}
	public int[][] getInitialBoard() {
		return initialBoard;
	}
	public boolean[][] getCellChangeable() {
		return cellChangeable;
	}

// getValueIn: returns a value at the specified location
// Precondition: row and col are passed in
// Postcondition: board[row][col] is returned
	public int getValueIn(int row, int col) {
		return board[row][col];
	}

/*----------------MUTATOR METHODS----------------*/
	public void setBoard(int[][] board) {
		this.board = board;
	}
	public void setInitialBoard(int[][] initialBoard) {
		this.initialBoard = initialBoard;
	}
	public void setCellChangeable(boolean[][] cellChangeable) {
		this.cellChangeable = cellChangeable;
	}

/*----------------ADD VALUE METHODS----------------*/

// addInitial: adds an initial value to the game board (board), initialBoard, and cellChangeable
// Precondition: row, col, and value are passed in
// Postcondition: board[row][col] and cellChangeable[row][col] now have the same values while 
		// cellChangeable is true
	public void addInitial(int row, int col, int value) {
		if((row>=0)&&(row<=9)&&(col>=0)&&(col<=9)&&(value>=1)&&(value<=9))
		{
           board[row][col]=value;
           initialBoard[row][col]=value;           
           cellChangeable[row][col]=true;
       }
	}   

// addGuess: adds a guess to the game board
// Precondition: row, col, and value are passed in
// Postcondition: if cellChangeable[row][col] is false, sets value in board[row][col], 
	// otherwise prints error
	public void addGuess(int row, int col, int value) {
		for(int i=0; i<=row; i++){
			for(int j=0; j<=col; j++) {
				if(cellChangeable[row][col]!=true)
					board[row][col]=value;
				else {
						System.out.println(" ");
						System.out.println("Invalid Sqaure!");
						break;
				}
			}
		}
	}

/*----------------CHECK METHODS----------------*/
// checkPuzzle: checks if the puzzle is valid (i.e. correct)
// Precondition: function is called at the end of program
// Postcondition: boolean allGood is returned depending on results of checkRow, checkCol, and checkSub 
    public boolean checkPuzzle()
    {
        boolean allGood=true;
        for(int i=0; i<9; i++)
        {
        	allGood=allGood&&checkRow(i);
            allGood=allGood&&checkCol(i);
            allGood=allGood&&checkSub(i);
        }
        return allGood;
    }

// checkRow: checks if a row of values is valid (i.e. correct)
// Precondition: function is called when checkPuzzle is called
// Postcondition: boolean rowOK is returned depending on whether row has values that only appear once
    public boolean checkRow(int row)
    {
        int count[]=new int[10];

        for(int col=0; col<9; col++)
            count[board[row][col]]++;
         
        boolean rowOK=true;

        for(int i=1; i<=9; i++)
            rowOK=rowOK && (count[i]<=1);
        
        return rowOK;
    }

// checkCol: checks if a column of values is valid (i.e. correct)
// Precondition: function is called when checkPuzzle is called
// Postcondition: boolean colOk is returned depending on whether column has values that only appear once
    public boolean checkCol(int col) {
        int count[]=new int[10];
        for(int row=0; row<9; row++) {
            count[board[row][col]]++;
        }
        boolean colOK=true;
        for(int i=1; i<=9; i++) {
            colOK=colOK && (count[i]<=1);
        }
        return colOK;
    }

// checkSub: checks if a subarray (a 3x3 array in the 9x9 puzzle) is valid (i.e. correct)
// Precondition: function is called when checkPuzzle is called
// Postcondition: boolean subOk is returned depending on whether subarray has values that only appear once
    public boolean checkSub(int sub) {        
        int count[]=new int[10];
        int rowBase=(sub/3)*3; //rowBase will be 0, 3, or 6 due to integer division
        int colBase=(sub%3)*3;
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                count[board[rowBase+i][colBase+j]]++;
            }
        }
        boolean subOK=true;
        for(int i=1; i<=9; i++) {
            subOK=subOK && (count[i]<=1);
        }
        return subOK;
    }

// isFull: checks if the puzzle is full
// Precondition: method is called
// Postcondition: returns boolean isFull depending on whether every element is greater than 0
	public boolean isFull() {
		boolean isFull=true;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) { 
				isFull=(isFull)&&(board[i][j]>0);
			}
		}
		return isFull;
	}

/*----------------OTHER METHODS----------------*/

// <NOT AN ACCESSOR> getAllowedValues: fetch all possible valid inputs for a specified location 
// Precondition: row and col are passed in
// Postcondition: result[] is returned as an array of booleans
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

// toString: returns the puzzle in a string
// Precondition: toString is called
// Postcondition: toString is printed out
	public String toString() {
		String puzzleDisplay="Row/Col\n   1  2  3  4  5  6  7  8  9\n";
		puzzleDisplay+="  --------------------------\n";
		for(int i=0; i<9; i++) {
           puzzleDisplay+=(i+1)+"|";
           for(int j=0; j<9; j++) {
               if(board[i][j]==0)
                   puzzleDisplay+=" "+ ".|";
               else
                   puzzleDisplay+=" "+board[i][j]+"|";
           }
           puzzleDisplay+="\n";
           puzzleDisplay+=" |__|__|__|__|__|__|__|__|__|\n";
       }
       return puzzleDisplay;
   }

// reset: resets the puzzle to the initial version (not blank)
// Precondition: reset is called
// Postcondition: board is set to 0 for non-initial elements
	public void reset() {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				board[i][j]=initialBoard[i][j];
			}
		}
	}


// initializeTestPuzzle: initializes a sudoku puzzle board (less difficult)
// Precondition: method is called (in our driver, if 1 is inputted in Main for puzzleType, this method is called)
// Postcondition: the puzzle has addInitial called multiple times
	public static void initializeTestPuzzle(Project2_Sudoku puzzle) {
		puzzle.addInitial(0, 0, 1);
		puzzle.addInitial(0, 1, 2);
		puzzle.addInitial(0, 2, 3);
   		puzzle.addInitial(0, 3, 4);
   		puzzle.addInitial(0, 4, 9);
   		puzzle.addInitial(0, 5, 7);
  		puzzle.addInitial(0, 6, 8);
		puzzle.addInitial(0, 7, 6);
		puzzle.addInitial(0, 8, 5);

		puzzle.addInitial(1, 0, 4);
		puzzle.addInitial(1, 1, 5);
		puzzle.addInitial(1, 2, 9);		
		puzzle.addInitial(1, 3, 1);
		puzzle.addInitial(1, 4, 6);
		puzzle.addInitial(1, 5, 8);
		puzzle.addInitial(1, 6, 2);
		puzzle.addInitial(1, 7, 3);
		puzzle.addInitial(1, 8, 7);

		puzzle.addInitial(2, 0, 6);
		puzzle.addInitial(2, 1, 7);
		puzzle.addInitial(2, 2, 8);
		puzzle.addInitial(2, 3, 2);
		puzzle.addInitial(2, 4, 5);
		puzzle.addInitial(2, 5, 3);
		puzzle.addInitial(2, 6, 1);
		puzzle.addInitial(2, 7, 4);
		puzzle.addInitial(2, 8, 9);

		puzzle.addInitial(3, 0, 3);		
		puzzle.addInitial(3, 1, 4);
		puzzle.addInitial(3, 2, 5);
		puzzle.addInitial(3, 3, 6);
		puzzle.addInitial(3, 4, 1);		
		puzzle.addInitial(3, 5, 2);
		puzzle.addInitial(3, 6, 7);
		puzzle.addInitial(3, 7, 9);
		puzzle.addInitial(3, 8, 8);

		puzzle.addInitial(4, 0, 2);		
		puzzle.addInitial(4, 1, 1);
		puzzle.addInitial(4, 2, 6);
		puzzle.addInitial(4, 3, 7);
		puzzle.addInitial(4, 4, 8);
		puzzle.addInitial(4, 5, 9);
		puzzle.addInitial(4, 6, 3);
		puzzle.addInitial(4, 7, 5);
		puzzle.addInitial(4, 8, 4);

		puzzle.addInitial(5, 0, 9);		
		puzzle.addInitial(5, 1, 8);
		puzzle.addInitial(5, 2, 7);
		puzzle.addInitial(5, 3, 3);
		puzzle.addInitial(5, 4, 4);
		puzzle.addInitial(5, 5, 5);		
		puzzle.addInitial(5, 6, 6);
		puzzle.addInitial(5, 7, 1);
		puzzle.addInitial(5, 8, 2);

		puzzle.addInitial(6, 0, 8);		
		puzzle.addInitial(6, 1, 3);
		puzzle.addInitial(6, 2, 1);
		puzzle.addInitial(6, 3, 5);
		puzzle.addInitial(6, 4, 2);		
		puzzle.addInitial(6, 5, 4);
		puzzle.addInitial(6, 6, 9);
		puzzle.addInitial(6, 7, 7);
		puzzle.addInitial(6, 8, 6);

		puzzle.addInitial(7, 0, 7);

		puzzle.addInitial(8, 0, 5);
		puzzle.addInitial(8, 3, 9);
	}

// initializeTestPuzzle: initializes a sudoku puzzle board (more difficult)
// Precondition: method is called (in our driver, if 2 is inputted in Main for puzzleType, this method is called)
// Postcondition: the puzzle has addInitial called multiple times
	public static void initializeRealPuzzle(Project2_Sudoku puzzle) {
		puzzle.addInitial(0, 0, 1);
		puzzle.addInitial(0, 1, 2);
		puzzle.addInitial(0, 2, 3);
   		puzzle.addInitial(0, 3, 4);
   		puzzle.addInitial(0, 4, 9);
   		puzzle.addInitial(0, 5, 7);
  		puzzle.addInitial(0, 6, 8);
		puzzle.addInitial(0, 7, 6);
		puzzle.addInitial(0, 8, 5);

		puzzle.addInitial(1, 0, 4);
		puzzle.addInitial(1, 1, 5);
		puzzle.addInitial(1, 2, 9);		
		puzzle.addInitial(1, 3, 1);
		puzzle.addInitial(1, 4, 6);

		puzzle.addInitial(2, 0, 6);
		puzzle.addInitial(2, 1, 7);
		puzzle.addInitial(2, 5, 3);
		puzzle.addInitial(2, 6, 1);
		puzzle.addInitial(2, 7, 4);
		puzzle.addInitial(2, 8, 9);

		puzzle.addInitial(3, 0, 3);		
		puzzle.addInitial(3, 1, 4);
		puzzle.addInitial(3, 7, 9);
		puzzle.addInitial(3, 8, 8);

		puzzle.addInitial(4, 0, 2);		
		puzzle.addInitial(4, 1, 1);
		puzzle.addInitial(4, 2, 6);
		puzzle.addInitial(4, 3, 7);

		puzzle.addInitial(5, 0, 9);		
		puzzle.addInitial(5, 1, 8);
		puzzle.addInitial(5, 2, 7);

		puzzle.addInitial(6, 0, 8);		
		puzzle.addInitial(6, 1, 3);

		puzzle.addInitial(7, 0, 7);

		puzzle.addInitial(8, 0, 5);
		puzzle.addInitial(8, 3, 9);
	}
}