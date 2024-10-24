package Week4;

/**
 * Created by Eligijus Ciza on 28/02/2023
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestCar
{
   public static void main(String args[])
   {
      //Phase 1: Define a variable called someCar
      //This indicates that someCar is to be used as a Car object
      Car someCar;

      //Phase 2: Build the Car object
      //This involves invoking the (default)
      //Car constructor method
      someCar = new Car();

      Car myCar = new Car("EDC 919", "BMW", "Red" ,2023);

      myCar.printCarInfo();

      myCar.setColour("Nardo Grey");
      myCar.printCarInfo();

      System.out.println(myCar.getReg());

      Car cCar = new Car("HDG 1234", "Toyota", "Blue", 2010);
      cCar.printCarInfo();

      System.out.println("The car is " + cCar.ageOfCar(cCar.getManYear()) + " years old");

      System.out.println("There are " + Car.numberOfCars() + " cars");
   }//main
}//class
