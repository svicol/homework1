/*
8. Access to class fields should be provided only through getters and setters.
 Methods from the class Machine should not be public, but must be inherited. (access modifiers) (encapsulation)

 */

/*
10. (main method)
        a) In the main method, create 4 objects in which Car is the parent class.
        b) Assign 2 objects of the class to the variable of the parent class, the other two to the class of the object itself.
        c) Give each of the objects the required characteristics.
        d) Try to put in one of the Cars, more people than its capacity. If an Exception is thrown, handle it (try / catch).
        e) Create an object of class Car and derive its value as a variable for which Car is the parent class.
        f) When assigning age for Man, use both primitive data types and wrapping ones.
        g) Create two people with the same characteristics. Compare if they are equal with == and with equals.
        Compare if two different machines are equal using == and using equals.

*/

import java.util.ArrayList;
import java.util.List;

public class Homework1 {
    public static void main(String[] args) {
//        This portion used for testing purposes
//        Man man = new Man("Serj", 42);
//        System.out.println(man);
//
//        Car car1 = new Car(Color.BLACK, "BMW", GearBox.AUTOMATIC, 5, man);
//        System.out.println(car1);
//        try {
//            car1.loadPassengers(5);
//        } catch (ExceededCarCapacity exceededCarCapacity) {
//            exceededCarCapacity.printStackTrace();
//        }
//
//        System.out.println(car1);
//        car1.unloadPassengers(5);
//        System.out.println(car1);

        // Task 10 from Homework 1
        Man mercedesDriver1 = new Man("Vova", 55);
        Man mercedesDriver2 = new Man("Ion", 25);
        Man ladaDriver = new Man("Mos Vasile", 65);
        Car mercedes1 = new Mercedes(Color.BLACK, 5, mercedesDriver1);
        Mercedes mercedes2 = new Mercedes(Color.WHITE, 5, mercedesDriver2);
        Car lada1 = new Lada(Color.BROWN, 5, ladaDriver);
        Lada lada2 = new Lada(Color.GREEN, 5, null);

        try {
            mercedes1.loadPassengers(5); //check with 5 to see exception
        } catch (ExceededCarCapacity exceededCarCapacity) {
            exceededCarCapacity.printStackTrace();
        }

        System.out.println(mercedes1);

        Man ladaDriver2 = new Man();
        Integer age = new Integer(35);
        ladaDriver2.setName("Gheorghe");
        ladaDriver2.setAge(age);
        int correctedAge = 37;
        ladaDriver2.setAge(correctedAge);

        //e) Create an object of class Car and derive its value as a variable for which Car is the parent class.
        Car newCar = new Car();
        newCar = lada1;
        System.out.println(newCar);

        // g) Create two people with the same characteristics. Compare if they are equal with == and with equals.
        Man similarMan = new Man("Gheorghe", 37);
        System.out.println("The result of comparing to people with the same characteristics is "
                + ladaDriver2.equals(similarMan));

        // Compare if two different machines are equal using == and using equals.
        System.out.println("The result of comparing lada1 and lada2 with == is " + (lada1 == lada2));
        System.out.println("The result of comparing lada1 and lada2 with equal() is " + (lada1.equals(lada2)));

        List<String> list = new ArrayList<>();
        int size = list.size();
        System.out.println(size);
    }
}
