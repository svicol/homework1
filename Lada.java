public class Lada extends Car {

    public Lada(Color color, int capacity, Man driver) {
        super(color, "LADA", GearBox.MANUAL, capacity, driver);
    }

    /*
    6. At least one acceleration or speed shift method must be rewritten for each new machine model. (overriding)
     */
    @Override
    public void switchGear(int gear) {
        if (gear > 0 && gear <= 4)
            System.out.println("Switch Lada manually to gear " + gear);
        else
            System.out.println("Lada can be manually switched from gear 1 to 4.");
    }
}
