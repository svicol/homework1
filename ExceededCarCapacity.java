public class ExceededCarCapacity extends Exception {
    int id;

    public ExceededCarCapacity(int x) {
        id = x;
    }

    @Override
    public String toString() {
        return "Exceeded Car Capacity[" + id + "]";
    }

}
