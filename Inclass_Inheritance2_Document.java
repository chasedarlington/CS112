public class Inclass_Inheritance2_Document {
	private String text; //an instance variable of type String named text that stores any textual content for the document.
/*
setText: A method to set this text value
Parameters: String input
Return Type: void
*/
	public void setText(String input) {
		text = input;
	}

/*
getText: A method to return this text value
Parameters: non
Return Type: String
*/
	public String getText() {
		return text;
	}

/*
toString: a method toString that returns the text field
Parameters: none
Return Type: String
*/	
	public String toString() {
		return "Email Body: " + "\n" + text;
	}
}