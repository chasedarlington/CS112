// Define a class named Doctor whose objects are records for a clinic’s doctors.

// Derive this class from the class Person given in Lesson.
// A Doctor record has the doctor’s name—defined in the class Person—a 
// specialty as a string (for example Pediatrician, Obstetrician, General 
// Practitioner, and so on), and an office-visit fee (use the type double).

// Give your class a reasonable complement of constructors and accessor methods. 
// Write a driver program to test all your methods.

public class Inclass_Inheritance1_Doctor extends Inclass_Inheritance1_Person {
//name defined in the class person

// preloaded constructor
	private String specialty;
	private double officeVisitFee;

	public Inclass_Inheritance1_Doctor() {
		super();
		specialty="General Practitioner";
		officeVisitFee=0;
	}

// autoset constructor
	public Inclass_Inheritance1_Doctor(String name, String special, double fee) {
		super(name);
		specialty = special;
		officeVisitFee = fee;
	}

// copy constructor
	public Inclass_Inheritance1_Doctor(Inclass_Inheritance1_Doctor other) {
		super(other);
		this.specialty = other.specialty;
		this.officeVisitFee = other.officeVisitFee;
	}

	public void setName(String input) {
		super.set(input);
	}

	public void setSpecialty(String input) {
		specialty = input;
	}

	public void setOfficeVisitFee(double input) {
		officeVisitFee = input;
	}

	public String getName() {
		return super.get();
	}

	public String getSpecialty() {
		return specialty;
	}

	public double getOfficeVisitFee() {
		return officeVisitFee;
	}

	public String toString() {
		return (super.get() + ": " + specialty + ": " +  "$" + officeVisitFee);
	}

	public static void main(String [] args){
		Inclass_Inheritance1_Doctor doc1 = new Inclass_Inheritance1_Doctor("Charles", "General Practitioner", 140);
		Inclass_Inheritance1_Doctor doc2 = new Inclass_Inheritance1_Doctor("Jaimie", "Obstetrician", 300);
		Inclass_Inheritance1_Doctor doc3 = new Inclass_Inheritance1_Doctor("Chelsea", "Orthopedist", 150);
		Inclass_Inheritance1_Doctor doc4 = new Inclass_Inheritance1_Doctor(doc3);
		System.out.println(doc1.toString());
		System.out.println(doc2.toString());
		System.out.println(doc3.toString());
		System.out.println(doc4.toString());
	}
}