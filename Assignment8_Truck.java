//Chase Darlington
//10-30-2019

public class Assignment8_Truck extends Assignment8_Vehicle {
   //instance variables for load and towing capacity
   private double loadCapacityTons; //in tons
   private int towCapacityLbs; //in lbs
  
//-------------CONSTRUCTORS-------------//
   public Assignment8_Truck(Assignment8_Person owner, String manufacturer, int numCylinders, double loadCapacityTons, int towCapacityLbs) {
       super(owner, manufacturer, numCylinders); //calling Vehicle (super) constructor
       this.loadCapacityTons = loadCapacityTons;
       this.towCapacityLbs = towCapacityLbs;
   }

//-------------ACCESSOR METHODS-------------//
   public double getLoadCapacityTons() {
       return loadCapacityTons;
   }

   public int getTowCapacityLbs() {
       return towCapacityLbs;
   }

//-------------MUTATOR METHODS-------------//
   public void setTowCapacityLbs(int towCapacityLbs) {
       this.towCapacityLbs = towCapacityLbs;
   }

   public void setLoadCapacityTons(double loadCapacityTons) {
       this.loadCapacityTons = loadCapacityTons;
   }

//-------------OTHER METHODS-------------//
/*
toString: toString override that returns parent Vehicle variable values and Truck variable values
Parameters: none
Return Type: String
*/ 
   public String toString() {
       return ("Truck: " + getManufacturer() + ", " + getNumCylinders() + " cylinder, owned by " + getOwner().getName()
         + "\n\t" + loadCapacityTons + " ton load capacity, " + towCapacityLbs + " pound tow capacity");
   }
  
/*
equals: equals override that returns true if an input is equal to the current Truck object
*/
   public boolean equals(Object obj) {
      if (obj == null)
          return false;
      else if (this == obj)
          return true;
      else if (!(obj instanceof Assignment8_Truck))
          return false;
      Assignment8_Truck other = (Assignment8_Truck) obj;
      if (super.equals(obj)&& loadCapacityTons==other.loadCapacityTons && towCapacityLbs==other.towCapacityLbs)
         return true;
      else 
         return false;
   }
}