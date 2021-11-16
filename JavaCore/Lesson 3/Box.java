import java.util.ArrayList;

public class Box<T extends Fruit>{

    ArrayList<T> boxes;

    public Box() {
        boxes = new ArrayList<>();
    }

    public double getWeightOfBox() {
        return boxes.get(0).getWeight() * boxes.size();
    }

    public void addFruitsToBox(T t) {
        boxes.add(t);
    }

    public void fromBoxtoBox(Box<T> box) {
        this.boxes.addAll(box.boxes);
        box.boxes.clear();
    }

    public boolean compare(Box<?> box) {
        if (this.getWeightOfBox() == box.getWeightOfBox()) {
            return true; 
        } else {
            return false;
        }
    }

    public String boxInfo() {
        /* выводы ArrayList в консоль
        for (int i = 0; i < boxes.size(); i++) {
            System.out.println(boxes.toString());
        }
        boxes.forEach(System.out::println);*/
        return (boxes.size() + " " + boxes.get(0).getName() + " the weight is " + getWeightOfBox() + "f");
    }
}