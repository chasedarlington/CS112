import java.util.Scanner;

public class Assignment7_Password_demo {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Assignment7_Password pin1 = new Assignment7_Password();
		if (pin1.getError().equals("EMPTY")) {
			System.out.print("Set your PIN: ");
			pin1.setPin(input.next());
		} 

		while (pin1.getError() != "NONE") {
			if (pin1.getError().equals("LONG")) {
				System.out.println("ERROR: PIN too long. ");
				System.out.print("Set your PIN: ");
				pin1.setPin(input.next());
			}
			else if (pin1.getError().equals("SHORT")) {
				System.out.println("ERROR: PIN too short. ");
				System.out.print("Set your PIN: ");
				pin1.setPin(input.next());
			}
			else if (pin1.getError().equals("OUTOFRANGE")) {
				System.out.println("ERROR: PIN must be 00000 to 99999. ");
				System.out.print("Set your PIN: ");
				pin1.setPin(input.next());
			}
			else {
				System.out.print("SYSTEM ERROR. WE APOLOGIZE FOR THE INCONVENIENCE");
			}
		}
		System.out.println("SUCCESS: PIN securely saved.");

		boolean cont = true;
		do {	
			System.out.print(pin1.printKey());
			System.out.print("Input password: ");
			if (pin1.testInput(input.next())==true) {
				System.out.println("SUCCESS: User input (password) matches PIN.");
				cont = false;
			}
			else if (pin1.getError().equals("NONE")) {
				System.out.println("FAILURE: User input (password) does not match PIN.");
				System.out.print("Try again (true or false)? ");
				cont = input.nextBoolean();
			}	
			else if (pin1.getError().equals("LONG")) {
				System.out.println("ERROR: User input (password) too long.");
				System.out.print("Try again (true or false)? ");
				cont = input.nextBoolean();
			}
			else if (pin1.getError().equals("SHORT")) {
				System.out.println("ERROR: User input (password) too short.");
				System.out.print("Try again (true or false)? ");
				cont = input.nextBoolean();
			}
			else if (pin1.getError().equals("OUTOFRANGE")) {
				System.out.println("ERROR: User input (password) must be 00000 to 33333. ");
				System.out.print("Try again (true or false)? ");
				cont = input.nextBoolean();
			}
			else {
				System.out.print("SYSTEM ERROR. WE APOLOGIZE FOR THE INCONVENIENCE");
			}
		} while (cont == true); 
		System.out.println();
	}
}