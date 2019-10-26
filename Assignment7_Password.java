import java.util.Random;
import java.util.Arrays;

public class Assignment7_Password {
	private int[] pin = new int[5]; //5 digits; 00000 to 99999; 
	private int[] attempt = new int[5]; //5 digits; 00000 to 99999; answer attempt
	private static int[] pinReference = {0,1,2,3,4,5,6,7,8,9};
	private int[] key = new int[10]; //5 digit key, where a random key digit corresponds to a pin digit; each digit is randomly 1,2,or 3
	private String error;
	public int[] translatedPin = new int[5];
/*
constructor: default constructor that sets error value
Parameters: none
Return type: none
*/
	public Assignment7_Password(){
		error = "EMPTY";
	}

/*
constructor: uses String input (to account for PINs like 09999), parses, and assigns characters to PIN
Parameters: String input
Return type: none
*/
	public Assignment7_Password(String input){
		if (input.length()==5){
			if (Integer.parseInt(input) >= 00000 && Integer.parseInt(input) <= 99999) {
				for (int i=0; i<input.length(); i++)
					pin[i] = Character.getNumericValue(input.charAt(i));
				error = "NONE";
			}
			else
				error = "OUTOFRANGE";
		}
		else if (input.length()>5)
			error = "LONG";
		else
			error = "SHORT";
	}

/*
constructor: copy constructor, copies pin value
Parameters: Assignment7_Password input
Return type: none
*/
	public Assignment7_Password(Assignment7_Password input){
		pin = input.getPin();
	}

/*
setPin: uses String input (to account for PINs like 09999), parses, and assigns characters to PIN
Parameters: String input
Return type: void
*/
	public void setPin(String input){
		if (input.length()==5){
			if (Integer.parseInt(input) >= 00000 && Integer.parseInt(input) <= 99999) {
				for (int i=0; i<input.length(); i++)
					pin[i] = Character.getNumericValue(input.charAt(i));
				error = "NONE";
			}
			else 
				error = "OUTOFRANGE";
		}
		else if (input.length()>5)
			error = "LONG";
		else
			error = "SHORT";
	}

/*
getPin: returns pin
Parameters: none
Return type: int[]
*/
	private int[] getPin(){
		return pin;
	}

/*
setRandomKey: randomly assigns characters (value 1 to 3) to key[] character array
Parameters: none
Return type: void
*/
	private void setRandomKey(){
		//int[] options = {1,2,3}; //array of options (to help generate random characters)
	    Random r=new Random(); 
	    for(int i=0;i<key.length;i++){
	        key[i]= r.nextInt(3)+1;  //options[r.nextInt(options.length)];
	    }
	}

/*
getKey: returns key value
Parameters: none
Return type: int[]
*/
	public int[] getKey(){
		return key;
	}

/* 
getKeyFull: returns PIN reference string and random key string
Parameters: none
Return type: void
*/
	public String printKey(){
		setRandomKey();
		String output = ("\n" + "PIN: ");
		for(int i=0; i<pinReference.length; i++){
			output += (pinReference[i] + " ");
		}
		output += ("\n" + "NUM: ");
		for(int i=0; i<key.length; i++){
			output += (key[i] + " ");
		}
		return (output + "\n");
	}

/* 
getError: returns error value
Parameters: none
Return type: String
*/
	public String getError() {
		return error;
	}

/*
translatePin: translates pin based on randomly generated key (randomly generated through print key & set random key methods)
Parameters: none
Return type: void
*/
	private void translatePin() {
		/* look at the reference values and match to key values */
		for (int j=0; j<pin.length; j++){ //iterate through pin
			for (int k=0; k<pinReference.length; k++){ //iterate through pinReference values
				if (pin[j] == pinReference[k]) { //if pin and reference value match
					translatedPin[j] = key[k]; //assign the key value to a translatedPin array (based on pin digit location); this generates a translated pin based on "key" values
				}
			}
		}
	}

/* 
testInput: test user input 
Parameters: String input
Return type: boolean
*/
	public boolean testInput(String input){
		int[] attempt = new int[5];
		if (input.length()==5){ //if input is of correct length
			if (Integer.parseInt(input) >= 00000 && Integer.parseInt(input) <= 33333) { //if input has the correct values
				for (int i=0; i<input.length(); i++) { //assign values from String input to integer array
					attempt[i] = Character.getNumericValue(input.charAt(i));
				}
				error = "NONE"; //register no error
				translatePin(); //translate pin based on the random key
				if (Arrays.equals(translatedPin, attempt)) //if translatedPin (based on "key" values) match the attempt (user input)
					return true; //the user input is a match
				else 
					return false; //otherwise it is not a match
			}
			else 
				error = "OUTOFRANGE"; //input has incorrect values (out of range)
				return false; //input is not a match
		}
		else if (input.length()>5) { //input has incorrect length. if too long.
			error = "LONG"; //register too long error
			return false; //input is not a match
		}
		else { //input has incorrect length. 
			error = "SHORT"; //register too short error
			return false; //input is not a match
		}
	}
}