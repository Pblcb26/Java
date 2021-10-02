public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    
    public int getFood() {
        return food;
    }

    public void decreaseFood(int food) {
        this.food -= food;
    }

    public void fillThePlate () {
        this.food = 40;
        System.out.println("Тарелка наполнена. В ней снова " + food + " кусочков мяса.");
    }

    @Override
    public String toString() {
        return "В тарелке " + food + " кусочков мяса.";
    }
}
