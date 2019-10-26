import java.lang.Character; //import Character class of lang package

public class Assignment7_Airplane {
	private static Character[][] planeConfiguration = {{'1','A','B','C','D'},{'2','A','B','C','D'},
	{'3','A','B','C','D'},{'4','A','B','C','D'},{'5','A','B','C','D'},{'6','A','B','C','D'},
	{'7','A','B','C','D'}}; //pre-defined 2d array for plane configuration
	private static String seat; //string for seat location
	private static int rowIndex, seatIndex; //index keys for seat location in the planeConfiguration array
	private static int occupiedSeats;
/*
setSeat: static method to deselect current static seat variable (i.e. set to "UNSELECTED")
Parameters: none
Return type: void
*/
	public static void setSeat() {
		seat = "UNSELECTED";
	}

/* 
setSeat: static method to reserve a seat based on input
Parameters: String input
Return type: void
*/
	public static void setSeat(String input) {
		String rownum = "";
		String seatLetter = "";
		String options = "ABCD";
		for (int i=0; i<input.length();i++){
			if (Character.isDigit(input.charAt(i))){
				rownum+=input.charAt(i);
			}
			else if (Character.isLetter(input.charAt(i))){
				seatLetter+=input.charAt(i);
			}
		}
		if (Integer.valueOf(rownum) <= planeConfiguration.length && options.contains(seatLetter)){ //planeConfiguration[0].length is number of columns && planeConfiguration.length is number of rows
			seat = seatLetter;
			rowIndex = Integer.valueOf(rownum)-1;
			if (seatLetter.equals("A")) {
				seatIndex = 1;
				if (planeConfiguration[rowIndex][seatIndex].toString().charAt(0)=='X'){
					seat = "TAKEN";
				}
				else {
					seat=input;
					occupiedSeats++;
					planeConfiguration[rowIndex][seatIndex]='X';
				}
			}
			else if (seatLetter.equals("B")) {
				seatIndex = 2;
				if (planeConfiguration[rowIndex][seatIndex].toString().charAt(0)=='X'){
					seat = "TAKEN";
				}
				else {
					seat=input;
					occupiedSeats++;
					planeConfiguration[rowIndex][seatIndex]='X';
				}
			}
			else if (seatLetter.equals("C")) {
				seatIndex = 3;
				if (planeConfiguration[rowIndex][seatIndex].toString().charAt(0)=='X'){
					seat = "TAKEN";
				}
				else {
					seat=input;
					occupiedSeats++;
					planeConfiguration[rowIndex][seatIndex]='X';
				}
			}
			else if (seatLetter.equals("D")) {
				seatIndex = 4;
				if (planeConfiguration[rowIndex][seatIndex].toString().charAt(0)=='X'){
					seat = "TAKEN";
				}
				else {
					seat=input;
					occupiedSeats++;
					planeConfiguration[rowIndex][seatIndex]='X';

				}
			}
		}
		else 
			seat = "INVALID";
	}

/* 
getSeat: static method to return currently reserved seat
Parameters: none
Return Type: String
*/
	public static String getSeat(){
		return seat;
	}

/*
getOccupiedSeat: return number of occupied seats
Parameters: none
Return type: int
*/
	public static int getOccupiedSeats(){
		return occupiedSeats;
	}

/* 
getPlaneConfiguration: returns the character array for the plane configuration
Parameters: none
Return type: Character[][]
*/
	public static Character[][] getPlaneConfiguration() {
		return planeConfiguration;
	}

/*
printPlaneConfiguration: print formatted version of the character array, plane configuration
Parameters: none
Return type: void
*/
	public static void printPlaneConfiguration() {
		for (int i=0; i<planeConfiguration.length; i++) {
			System.out.println();
			for (int j=0; j<(4+1); j++) {
				System.out.print(planeConfiguration[i][j] + " ");
			}
		}
		System.out.println();
	}
}