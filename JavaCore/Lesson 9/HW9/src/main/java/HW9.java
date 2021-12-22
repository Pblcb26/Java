import java.util.*;
import java.util.stream.Collectors;

/**
 * JavaCore. Homework. Lesson 9.
 * @author Afanasyeva MS
 */

public class HW9 {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("Кусака");
        student1.setCourses(new ArrayList<>(Arrays.asList("Кусания", "Мурчания", "Диванодрания", "Пузочесания")));

        Student student2 = new Student();
        student2.setName("Моська");
        student2.setCourses(new ArrayList<>(Arrays.asList("Мурчания", "Диванодрания")));

        Student student3 = new Student();
        student3.setName("Элис");
        student3.setCourses(new ArrayList<>(Arrays.asList("Мурчания", "Диванодрания", "Вкусняхотырства")));

        Student student4 = new Student();
        student4.setName("Рыжий");
        student4.setCourses(new ArrayList<>(Arrays.asList("Кусания", "Художественного царапания")));

        Student student5 = new Student();
        student5.setName("Ниса");
        student5.setCourses(new ArrayList<>(Arrays.asList("Кусания", "Мурчания", "Диванодрания")));

        System.out.println(student5);


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Set<Student> studentCourses = students.stream()
                .collect(Collectors.toSet());
        System.out.println(studentCourses);

        List<Student> mostCurious = students.stream()
                .sorted(Comparator.comparingInt((Student e) -> e.getAllCourses().size()).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(mostCurious);

        String course = "Мурчания";
        String studentStream = students.stream()
                .filter((Student e1) -> e1.getAllCourses().contains(course))
                .map((Student e1) -> e1.getName())
                .collect(Collectors.joining(", ", "На курсе " + course + " обучаются: ", "."));
        System.out.println(studentStream);
    }
}