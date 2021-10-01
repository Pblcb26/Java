/**
 * Java 1. Homework. Lesson 6.
 * @author Afanasyeva MS
 * @version 01.10.2021
 */

class HomeWork6 {

    public static void main(String[] args) {
        int cats = 0;
        int dogs = 0;
        
        Animal[] animals = {
        new Cat("Mister Kusaka", 10, 150, 0, 200),
        new Dog("Bobick", 7, 600, 10, 500),
        new Cat("Missis Moska", 0, 210, 0, 200),
        new Dog("Sharick", 15, 700, 10, 50),
        new Cat("KuseMos", -1, 0, 0, 200)
        };

        System.out.println();

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                cats += 1;
            }
            if (animal instanceof Dog) {
                dogs += 1;
            }
            animal.swim();
            animal.run();
            System.out.println(animal);
        }

        System.out.println("Animals in total " + animals.length + ". " + cats + " cats and " + dogs + " dogs.");
    }
}