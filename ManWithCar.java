/*
3. For each Man who has a Car, the model should be different. ("IS-A" relationship) --> ManWithCar extends Man
4. A Man may have a Car. --> This class represents those Man who have a Car
 */


public class ManWithCar extends Man {
    private Car personalCar;

    public ManWithCar(Man man, Car personalCar) {
        super(man.getName(), man.getAge());
        this.personalCar = personalCar;
    }

    public Car getPersonalCar() {
        return personalCar;
    }

    public void setPersonalCar(Car personalCar) {
        this.personalCar = personalCar;
    }
}
