public class Cat {
    private int appetite;
    private int satiety;
    private boolean gluttony;

    Cat(int appetite) { 
        this.appetite = appetite;
    }

    void eat(Plate plate) {
    plate.decreaseFood(appetite);
    }
}