import java.util.Scanner; //import Scanner class of util package

public class Assignment7_Airplane_demo {
/* run Assignment7_Airplane program */
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Assignment7_Airplane plane = new Assignment7_Airplane();
		boolean cont = true;
		/* Define currently occupied seats */
		plane.setSeat("1A");
		plane.setSeat("1B");
		plane.setSeat("1C");
		plane.setSeat("1D");
		plane.setSeat("2A");
		plane.setSeat("2B");
		plane.setSeat("2C");
		plane.setSeat("2D");
		plane.setSeat("3A");
		plane.setSeat("3B");
		plane.setSeat("3C");
		plane.setSeat("3D");
		plane.setSeat("4A");
		plane.setSeat("4B");
		plane.setSeat("4C");
		plane.setSeat("4D");
		plane.setSeat("5A");
		plane.setSeat("5B");
		plane.setSeat("5C");
		plane.setSeat("5D");
		plane.setSeat("6A");
		plane.setSeat("6B");
		plane.setSeat("6C");
		plane.setSeat("7B");
		plane.setSeat("7D");
		plane.printPlaneConfiguration(); //print plane layout
		System.out.println("Number of occupied seats: " + plane.getOccupiedSeats());
		System.out.println("Maximum seats: " + (plane.getPlaneConfiguration()[0].length - 1) * plane.getPlaneConfiguration().length);
		/* while the user wants to continue, and the number of occupied seats is less than the total number of seats */
		do {
			System.out.print("Please select a seat: ");
			plane.setSeat(input.next());
			if (plane.getSeat().equals("INVALID")) 
			System.out.println("ERROR: Invalid Selection. ");
			else if (plane.getSeat().equals("TAKEN")) 
				System.out.println("ERROR: Seat Occupied. ");
			else 
				System.out.println("SUCCESS: Selection Recorded. ");
			if (plane.getOccupiedSeats()<((plane.getPlaneConfiguration()[0].length - 1) * plane.getPlaneConfiguration().length)) {
				System.out.print("Select another seat (true or false)? ");
				cont = input.nextBoolean();
				plane.setSeat();
			}
		} while (cont == true && plane.getOccupiedSeats()<((plane.getPlaneConfiguration()[0].length - 1) * plane.getPlaneConfiguration().length));
		if (plane.getOccupiedSeats()==((plane.getPlaneConfiguration()[0].length - 1) * plane.getPlaneConfiguration().length)) 
			System.out.println("------PLANE FULL------");
		System.out.print("\n" + "Plane status:"); //finally, print plane status
		plane.printPlaneConfiguration();		

	}
}