/**
 * Java 1. Homework. Lesson 7.
 * @author Afanasyeva MS
 * @version 01.10.2021
 */

class HomeWork7 {
    
    public static void main(String[] args) {
    Cat cat = new Cat(8);
    Plate plate = new Plate(25);
    System.out.println(plate);

    //plate.setFood(plate.getFood() - cat.getAppetite());
    //plate.decreaseFood(cat.getAppetite());
    cat.eat(plate);
    System.out.println(plate);
    }
}