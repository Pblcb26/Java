public class Cat {
    private String name;
    private int appetite; //съедает за раз
    private int gluttony; //прожорливость - сколько съест для насыщения
    //private int isSatiety; //счетчик съеденного
    private boolean satiety; //сытый или голодный

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
        setSatiety();  //при прожорливости <= 0, кот сытый и не должен есть
        if (gluttony > 0 && appetite <= plate.getFood()) { //кот не ест, если в миске меньше, чем он съедает за раз
        plate.decreaseFood(appetite);
        //isSatiety = isSatiety + appetite;
        gluttony -= appetite;
        setSatiety();
        }
    }

    public void setSatiety() {
        //satiety = (isSatiety >= gluttony)? true : false;
        if (gluttony < 0) {
            gluttony = 0;
        } 
        satiety = (gluttony == 0)? true : false;
    }

    @Override
    public String toString() {
        //return name + " за один заход съедает " + appetite + " кусочков мяса, чтоб наесться надо " + gluttony + ". Съедено " + isSatiety + " кусочков. Животик полон: " + satiety;
        return name + " съедает " + appetite + " кусочков мяса, чтобы наполнить животик надо еще " + gluttony + " кусочков. Животик полон: " + satiety;
    }
}