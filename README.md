# homework1
Homework 1 for endava java course
1. Create classes Man and Car.
Characterize a Man by name and age, and also a Man should walk and eat.
Describe the Car with color, model, type of box and capacity. The Car must accelerate, and speed must also be switched.

2. Implement toString, equals and hashcode. In toString, use the StringBulder for the Car class, and the StringBuffer for the Man class.

3. For each Man who has a Car, the model should be different. ("IS-A" relationship)

4. A Man may have a Car. The Car must have a driver, and may also have passengers. ("HAS-A" relationship)

5. There should be no more passengers than the capacity of the Car.
You can’t put more people in the car. Create a condition that matches this restriction.
If the condition is violated, the corresponding Exception shall be thrown.

6. At least one acceleration or speed shift method must be rewritten for each new machine model. (overriding)

7. The speed switching method should have 2 implementations, without parameters, if the automatic gearbox. With the parameter,
which characterizes the number of speeds if the box is manual. (overloading)

8. Access to class fields should be provided only through getters and setters. Methods from the class Machine should not be public,
but must be inherited. (access modifiers) (encapsulation)

9. Create an enum class for the color of the Car. (enums)

10. (main method)
a) In the main method, create 4 objects in which Car is the parent class.
b) Assign 2 objects of the class to the variable of the parent class, the other two to the class of the object itself.
c) Give each of the objects the required characteristics.
d) Try to put in one of the Cars, more people than its capacity. If an Exception is thrown, handle it (try / catch).
e) Create an object of class Car and derive its value as a variable for which Car is the parent class.
f) When assigning age for Man, use both primitive data types and wrapping ones.
g) Create two people with the same characteristics. Compare if they are equal with == and with equals.
Compare if two different machines are equal using == and using equals.

11. Replace the Car class with an abstract class. (abstract classes)

12. Take the method to accelerate to the interface, make the Car implement the interface. (interfaces)

13. Have fun and if you have any questions, don't hesitate to contact us :)
