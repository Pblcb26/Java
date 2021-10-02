/**
 * Java 1. Homework. Lesson 7.
 * @author Afanasyeva MS
 * @version 03.10.2021
 */

class HomeWork7 {
    
    public static void main(String[] args) {
        Plate plate = new Plate(40);
        int numberOfPlates = 3;
        System.out.println(plate);

        Cat[] cats = {
            new Cat("Мистер Кусака", 10, 20, false),
            new Cat("Элис", 9, 0, false),
            new Cat("Миссиc Моська", 15, 32, false),
            new Cat("Клаус", 7, 7, false),
            new Cat("Ниса", 15, 20, false),
            new Cat("Фока", 11, 17, false)
        };

        for (int i = 0; i < numberOfPlates; i++) {
            System.out.println("Котики идут кушать.");
            for (Cat cat : cats) {
                if (cat.getSatiety() == false) {
                cat.eat(plate);
                }
                System.out.println(cat);
                System.out.println(plate);
            }
            plate.fillThePlate();
        }
    }
}