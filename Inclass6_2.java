public class Inclass6_2 {
	private String name, phone;
	
/*
Inclass6_2: default constructor
Parameters: none
Return Type: none
*/
	public Inclass6_2(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

/*
setName: sets name in the current Inclass6_2 object
Parameters: String name
Return Type: void
*/
	public void setName(String name) {
		this.name = name;
	}

/*
setPhone: sets phone number in the current Inclass6_2 object
Parameters: String phone
Return Type: void
*/
	public void setPhone(String phone) {
		this.phone = phone;
	}

/*
getName: gets name in the current Inclass6_2 object
Parameters: none
Return Type: String
*/
	public String getName() {
		return name;
	}

/*
getPhone: gets phone number in the current Inclass6_2 object
Parameters: none
Return Type: String
*/
	public String getPhone() {
		return phone;
	}

/*
toString: prStrings the consolidated information for the current Inclass6_2 object
Parameters: none
Return Type: String
*/
	public String toString() {
		return String.format("%-20s%-10s \n", name,  phone);
	}

/*
equals: if an input Inclass6_2 object is equal to the current Inclass6_2 object, returns true
Parameters: Inclass6_2 other
Return Type: boolean
*/
	public boolean equals(Inclass6_2 other) {
		if (this.name == other.name && this.phone == other.phone) 
			return true;
		else
			return false; 
	}

/*
search: searches the input array for a specified Inclass6_2 object and prints the information (including index) if found
Parameters: Inclass6_2 other
Return Type: void
*/
	public static String search(Inclass6_2[] search_list, Inclass6_2 search_item) {
		boolean record_found = false;
		for (int i=0; i<search_list.length; i++) {
			if (search_list[i].getName() == search_item.getName() | search_list[i].getPhone() == search_item.getPhone()) {
				if (search_list[i].getName() == search_item.getName() && search_list[i].getPhone() == search_item.getPhone())
					System.out.print("EXACT MATCH: " + "[" + (i+1) + "] " + search_list[i].toString());
				else 
					System.out.print("CLOSE MATCH: " + "[" + (i+1) + "] " + search_list[i].toString());
				record_found = true;
			}	
		}
		if (record_found==false) 
			System.out.println("No record found.");
		return null;
	}
}




