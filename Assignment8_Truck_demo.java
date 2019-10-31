//Chase Darlington
//10-30-2019

public class Assignment8_Truck_demo {
   public static void main(String[] args) {
       Assignment8_Vehicle camaro = new Assignment8_Vehicle(new Assignment8_Person("Frank"), "Chevrolet", 8);
       System.out.println(camaro.toString());
       Assignment8_Vehicle mustang = new Assignment8_Vehicle();
       mustang.setNumCylinders(8);
       mustang.setManufacturer("Ford");
       mustang.setOwner(new Assignment8_Person("Christine"));
       System.out.println(mustang.toString());
       Assignment8_Truck c300 = new Assignment8_Truck(new Assignment8_Person("Jessica"), "Chevrolet", 8, 1.8, 4500);
       System.out.println(c300.toString());
       Assignment8_Truck c200 = new Assignment8_Truck(new Assignment8_Person("Jimmy"), "Chevrolet", 8, 1.6, 3800);
       System.out.println(c200.toString());
   }
}