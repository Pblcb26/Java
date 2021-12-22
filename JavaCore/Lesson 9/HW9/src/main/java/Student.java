import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<String> courses;


    public String getName() {
        return name;
    }

    public List<String> getAllCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return name + " обучается на следующих курсах: " + courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}
