//Chase Darlington
//10-30-2019

class Assignment8_Person {

   private String name; //private instance variable for name

//-------------CONSTRUCTORS-------------//
/*
Assignment8_Person: constructor for "no name" persons
Parameters: none
Return type: none
*/ 
   public Assignment8_Person() {
      name = "No name";
   }

/*
Assignment8_Person: constructor (overloading) to set name
Parameters: String input
Return type: none
*/ 
   public Assignment8_Person(String input) {
      name = input;  
   }

/*
Assignment8_Person: copy constructor (overloading) to accept Person class objects and duplicate name
Parameters: Assignment8_Person other
Return type: none
*/ 
   public Assignment8_Person(Assignment8_Person other) {
       name = other.name;
   }


//-------------ACCESSOR METHODS-------------//
/*
getName: accessor method to get & return name
Parameters: none
Return type: String
*/ 
   public String getName() {
      return name;  
   }

//-------------MUTATOR METHODS-------------//
/*
setName: mutator method to set name
Parameters: String input
Return type: void
*/
   public void setName(String input) {
      name = input;      
   }

//-------------OTHER METHODS-------------//
/*
toString: toString method to return String information for a Person object
Parameters: none
Return type: String
*/
   public String toString() {
      return("Name: " + name);
   }
      
/*
equals: equals method to return true if input object is equal to current Person object
Parameters: Object obj
Return Type: boolean
*/
   public boolean equals(Object obj) {
      if (obj == null) 
         return false;
      else if (this == obj)
         return true;
      Assignment8_Person other = (Assignment8_Person) obj;
      if (name.equals(other.name))
         return true;
      else if (name.equals(obj)) //using String class equals() method
         return true;
      else 
         return false;
   }  
}