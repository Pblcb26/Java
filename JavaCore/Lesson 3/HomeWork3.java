/**
 * JavaCore. Homework. Lesson 3.
 * @author Afanasyeva MS
 * @version 16.11.2021
 */

class HomeWork3 {
    
    public static void main(String[] args) {

        Box<Apple> box1 = new Box();
        Box<Apple> box2 = new Box();
        Box<Orange> box3 = new Box();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        box1.addFruitsToBox(apple1);
        box1.addFruitsToBox(apple2);
        box1.addFruitsToBox(apple3);

        box2.addFruitsToBox(apple4);

        box3.addFruitsToBox(orange1);
        box3.addFruitsToBox(orange2);

        System.out.println("In the box1: " + box1.boxInfo());
        System.out.println("In the box2: " + box2.boxInfo());
        System.out.println("In the box3: " + box3.boxInfo());

        System.out.println("weight of box1 is equal to weight of box3 ? " + box1.compare(box3));
        System.out.println("weight of box1 is equal to weight of box2 ? " + box1.compare(box2));
        System.out.println("weight of box2 is equal to weight of box3 ? " + box2.compare(box3));

        box2.fromBoxtoBox(box1);
        System.out.println("In the box2: " + box2.boxInfo());
        //System.out.println("In the box1: " + box1.boxInfo());

        //box2.fromBoxtoBox(box3); //метод не позволяет использовать ящики с другими фруктами.
        
    }
}