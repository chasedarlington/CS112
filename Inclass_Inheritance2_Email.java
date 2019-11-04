public class Inclass_Inheritance2_Email extends Inclass_Inheritance2_Document {
//The body of the email message will be stored in the inherited variable text.

	//instance variables for the sender, recipient, and title of an email message.
	private String sender, recipient, title;

	/*
	setSender: set the sender value
	Parameters: String input
	Return Type: void
	*/
	public void setSender(String input) {
			sender = input;
	}

	/*
	setRecipient: set the recipient value
	Parameters: String input
	Return Type: void
	*/
	public void setRecipient(String input) {
			recipient = input;
	}

	/*
	setTitle: set the title value
	Parameters: String input
	Return Type: void
	*/
	public void setTitle(String input) {
			title = input;
	}

	/*
	getSender: return the sender value
	Parameters: none
	Return Type: String
	*/
	public String getSender() {
			return sender;
	}

	/*
	getRecipient: return the recipient value
	Parameters: none
	Return Type: String
	*/
	public String getRecipient() {
			return recipient;
	}

	/*
	getTitle: return the title value
	Parameters: none
	Return Type: String
	*/
	public String getTitle() {
			return title;
	}

/* OVERRIDE, Redefining the toString method to con-catenate all text fields.
toString: a method toString that returns the variable fields
Parameters: none
Return Type: String
*/	
	public String toString() {
		return ("To: " + recipient
			+ "\n" + "From: " + sender
			+ "\n" + "Title/Subject: " + title
			+ "\n" + super.toString());
	}
}