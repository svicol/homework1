import java.util.Objects;

/*
1. Create class Car. Describe the Car with color, model, type of box and capacity.
The Car must accelerate, and speed must also be switched.

4. The Car must have a driver, and may also have passengers. ("HAS-A" relationship) --> driver class member of type Man

8. Access to class fields should be provided only through getters and setters.
 Methods from the class Machine should not be public, but must be inherited. (access modifiers) (encapsulation)
    --> methods in this class are protected except
 */

public class Car extends Machine implements Acceleration{
    private Color color;
    private String model;
    private GearBox gearbox;
    private int capacity;
    private Man driver;
    private int numberOfLoadedPassengers = 0; //default value, keeps track of number of passengers loaded

    public Car() {
    }

    public Car(Color color, String model, GearBox gearbox, int capacity, Man driver) {
        this.color = color;
        this.model = model;
        this.gearbox = gearbox;
        this.capacity = capacity;
        this.driver = driver;
    }

    public void accelerate() {
        System.out.println("The car accelerated");
    }

    /*
    7. The speed switching method should have 2 implementations,
     - without parameters, if the automatic gearbox.
     - With the parameter, which characterizes the number of speeds if the box is manual. (overloading)
     */
    protected void switchGear() {
        if (gearbox == GearBox.MANUAL) {
            System.out.println("This method cannot be used to cars with manual gearbox");
            return;
        } else
            System.out.println("The gear switched automatically.");

    }

    protected void switchGear(int gear) {
        if (gearbox == GearBox.AUTOMATIC) {
            System.out.println("This method cannot be used to cars with automatic gearbox");
            return;
        }
        if (gear > 0 && gear <= 6)
            System.out.println("Switch manually to gear " + gear);
        else
            System.out.println("The gear can be manually switched from  1 to 6.");
    }

    /*
    5. There should be no more passengers than the capacity of the Car.
    You can’t put more people in the car. Create a condition that matches this restriction.
    If the condition is violated, the corresponding Exception shall be thrown.

     */
    protected void loadPassengers(int numberOfPassengers) throws ExceededCarCapacity {
        int temp = numberOfLoadedPassengers + numberOfPassengers;
        if (temp > capacity - 1) { //capacity - 1 because 1 place is for driver
            numberOfLoadedPassengers = capacity - 1;
            throw new ExceededCarCapacity(temp);
        } else
            numberOfLoadedPassengers = temp;
    }

    protected void unloadPassengers(int numberOfPassengers) {
        if (numberOfLoadedPassengers == 0) {
            System.out.println("No passengers loaded. You cannot unload anyone!");
        }

        int temp = numberOfLoadedPassengers - numberOfPassengers;
        if (temp < 0) {
            System.out.println("There were less passengers in the car! All passengers unloaded!");                              //TO DO
            numberOfLoadedPassengers = 0;
        } else {
            numberOfLoadedPassengers = temp;
        }
    }

    protected Color getColor() {
        return color;
    }

    protected void setColor(Color color) {
        this.color = color;
    }

    protected String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    protected GearBox getGearbox() {
        return gearbox;
    }

    protected void setGearbox(GearBox gearbox) {
        this.gearbox = gearbox;
    }

    protected int getCapacity() {
        return capacity;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    protected Man getDriver() {
        return driver;
    }

    protected void setDriver(Man driver) {
        this.driver = driver;
    }

    /*
    2. Implement toString, equals and hashcode.
    In toString, use the StringBulder for the Car class, and the StringBuffer for the Man class.
     */
    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Car{model=");
        stringBuilder.append(model);
        stringBuilder.append(", color=");
        stringBuilder.append(color);
        stringBuilder.append(", gearbox=");
        stringBuilder.append(gearbox);
        stringBuilder.append(", capacity=");
        stringBuilder.append(capacity);
        stringBuilder.append(", current driver is ");
        stringBuilder.append(driver.toString());
        if (numberOfLoadedPassengers == 0)
            stringBuilder.append(", no passengers loaded.");
        else {
            stringBuilder.append(", currently loaded ");
            stringBuilder.append(numberOfLoadedPassengers);
            stringBuilder.append(" passengers.");
        }

        stringBuilder.append('}');

        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return capacity == car.capacity &&
                color.equals(car.color) &&
                model.equals(car.model) &&
                gearbox == car.gearbox &&
                driver.equals(car.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model, capacity);
    }
}
