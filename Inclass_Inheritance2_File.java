public class Inclass_Inheritance2_File extends Inclass_Inheritance2_Document {
// The textual contents of the file are stored in the inherited variable text.
	
	private String path; //an instance variable for the pathname.

	/*
	setPath: set the path variable
	Parameters: String input
	Return Type: void
	*/
	public void setPath(String input) {
		path = input;
	}

	/*
	getPath: get the path variable
	Parameters: none
	Return Type: String
	*/
	public String getPath() {
		return path;
	}
}