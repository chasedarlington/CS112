public class Inclass_Inheritance2_Demo {
	public static void main(String [] args) {
		Inclass_Inheritance2_Email e1 = new Inclass_Inheritance2_Email();
		e1.setRecipient("arathi@usfca.edu");
		e1.setSender("csdarlington@dons.usfca.edu");
		e1.setTitle("CS112: Question about Binding");
		e1.setText("Hi Professor Rathi," + "\n\n" + "Can you explain in more detail how binding works and why it's used?" + "\n\n" + "Thank you," + "\n" + "Chase"); 
		Inclass_Inheritance2_File f1 = new Inclass_Inheritance2_File();
		f1.setPath("Desktop/Code");
		f1.setText(e1.getText());
		System.out.println("----------Email 1----------");
		System.out.println(e1.toString());
		System.out.println("----------File 1----------");
		System.out.println(f1.toString());


		Inclass_Inheritance2_Email e2 = new Inclass_Inheritance2_Email();
		e2.setRecipient("arathi@usfca.edu");
		e2.setSender("csdarlington@dons.usfca.edu");
		e2.setTitle("CS112: Question about Binding");
		e2.setText("Hi Professor Rathi," + "\n\n" + "How can I make this code (attached) more efficient?" + "\n\n" + "Thank you," + "\n" + "Chase"); 
		Inclass_Inheritance2_File f2 = new Inclass_Inheritance2_File();
		f2.setPath("Desktop/Code");
		f2.setText(e2.getText());
		System.out.println("----------Email 2----------");
		System.out.println(e2.toString());
		System.out.println("----------File 2----------");
		System.out.println(f2.toString());

		System.out.println("Email 1 contains Rathi: " + ContainsKeyword(e1, "Rathi"));
		System.out.println("File 1 contains Rathi: " + ContainsKeyword(f1, "Rathi"));
		System.out.println("Email 2 contains Rathi: " + ContainsKeyword(e2, "Rathi"));
		System.out.println("File 2 contains Rathi: " + ContainsKeyword(f2, "Rathi"));

	}

	public static boolean ContainsKeyword(Inclass_Inheritance2_Document docObject, String keyword) {
		if (docObject.toString().indexOf(keyword,0) >= 0)
        	return true;
        return false;
	}	
}