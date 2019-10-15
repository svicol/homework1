public class Mercedes extends Car {

    public Mercedes(Color color, int capacity, Man driver) {
        super(color, "MERCEDES", GearBox.AUTOMATIC, capacity, driver);
    }
    /*
    6. At least one acceleration or speed shift method must be rewritten for each new machine model. (overriding)
     */
    @Override
    public void switchGear() {
        System.out.println("Mercedes switched gear automatically");
    }
}
