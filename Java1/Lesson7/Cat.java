public class Cat {
    private String name;
    private int appetite;
    private int gluttony;
    private int isSatiety;
    private boolean satiety;

    Cat(String name, int appetite, int gluttony, boolean satiety) { 
        this.name = name;
        this.appetite = appetite;
        this.gluttony = gluttony;
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getGluttony() {
        return gluttony;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
        setSatiety();
        if (gluttony > 0 && appetite <= plate.getFood()) {
        plate.decreaseFood(appetite);
        isSatiety = isSatiety + appetite;
        setSatiety();
        }
    }

    public void setSatiety() {
        satiety = (isSatiety >= gluttony)? true : false;
    }

    @Override
    public String toString() {
        return name + " за один заход съедает " + appetite + " кусочков мяса, чтоб наесться надо " + gluttony + ". Съедено " + isSatiety + " кусочков. Животик полон: " + satiety;
    }
}