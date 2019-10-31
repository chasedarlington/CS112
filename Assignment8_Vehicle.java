//Chase Darlington
//10-30-2019
  
public class Assignment8_Vehicle {

   //private instance variables for owner, manufacturer, and number of cylinders for a vehicle
   private Assignment8_Person owner = new Assignment8_Person();
   private String manufacturer;
   private int numCylinders;

//-------------CONSTRUCTORS-------------//
/*
Assignment8_Vehicle: default constructor to set variables to blank
Parameters: none
Return type: none
*/
   public Assignment8_Vehicle() {
      owner = new Assignment8_Person("John Doe");
      manufacturer = "Unknown";
      numCylinders = (-1);
   }

/*
Assignment8_Vehicle: overloading constructor to accept inputs and set variables accordingly
Parameters: Person owner, String manufacturer, int numCylinders
Return type: none
*/
   public Assignment8_Vehicle(Assignment8_Person owner, String manufacturer, int numCylinders) {
      this.owner = owner;
      this.manufacturer = manufacturer;
      this.numCylinders = numCylinders;
   }
   
//-------------ACCESSOR METHODS-------------//
/*
getManufacturer: return manufacturer
Parameters: none
Return Type: String
*/
   public String getManufacturer() {
      return manufacturer;
   }

/*
getNumCylinders: return number of engine cylinders 
Parameters: none
Return Type: int
*/
   public int getNumCylinders() {
      return numCylinders;
   }

/*
getOwner: return owner (object of Person class)
Parameters: none
Return Type: Assignment8_Person
*/
   public Assignment8_Person getOwner() {
      return owner;
   }

//-------------MUTATOR METHODS-------------//
/*
setManufacturer: set manufacturer
Parameters: void
Return Type: String manufacturer
*/
   public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
   }

/*
setNumCylinders: set number of engine cylinders
Parameters: void
Return Type: int numCylinders
*/
   public void setNumCylinders(int numCylinders) {
      this.numCylinders = numCylinders;
   }

/*
setOwner: set owner of vehicle
Parameters: void
Return Type: Assignment8_Person owner
*/
   public void setOwner(Assignment8_Person owner) {
      this.owner = owner;
   }

//-------------OTHER METHODS-------------//
/*
equals: equals method
Parameters: Object obj
Return Type: boolean
*/
   public boolean equals(Object obj) {
      if (obj == null)
          return false;
      else if (this == obj)
          return true;
      else if (!(obj instanceof Assignment8_Vehicle))
          return false;
      Assignment8_Vehicle other = (Assignment8_Vehicle) obj;
      if (owner.equals(other.owner) && manufacturer.equals(other.manufacturer) && numCylinders == other.numCylinders)
         return true;
      else 
         return false;
   }

/*
toString: toString method to return instance variable values
Parameters: none
Return Type: String
*/
   public String toString() {
      return ("Vehicle: " + manufacturer + ", " + numCylinders + " cylinder, owned by " + getOwner().getName());
   }
}
