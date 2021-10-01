public class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int food) {
        this.food -= food;
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}
