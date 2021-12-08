public class Student {
    String name;
    int course;
    String faculty;

    @Override
    public String toString() {
        return "[" + name + ", " + course + ", " + faculty + "]";
    }
}
