import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.*;

/**
 * Lesson 9
 */

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("qwe", 23, 30000);
        Employee employee2 = new Employee("sdf", 46, 22000);
        Employee employee3 = new Employee("jhm", 66, 54000);
        Employee employee4 = new Employee("kw5", 45, 48000);
        Employee employee5 = new Employee("fhb", 34, 30000);
        Employee employee6 = new Employee("hmg", 21, 61000);
        Employee employee7 = new Employee("nbs", 57, 30000);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);

        System.out.println(employees);

        /* Stream на основании массива
        String[] a = {"hjk", "bhu", "bhi"};
        Stream<String> streamfromArr = Arrays.stream(a);*/

        /*Stream параметризованный
        DoubleStream;
        IntStream;
        LongStream;*/

        /* Stream yf jcyjdfybb rjkktrwbb
        Stream<Employee> stream = employees.stream();*/
        List<Employee> sortedByAgeAndSalary = employees.stream()
                .filter(e1 -> e1.salary >= 40000)
                .sorted((e1, e2) -> e1.age - e2.age)
                .collect(Collectors.toList());
        System.out.println(sortedByAgeAndSalary);


        System.out.println(employees.stream()
                .filter(e1 -> e1.salary >= 40000)
                .map((e1) -> e1.name)
                .collect(Collectors.joining(" | ", "Имена сотрудников с зп от 50000: ", ".")));

        employees.stream()
                .filter(e1 -> e1.salary >= 40000)
                .map((e1) -> e1.name)
                .forEach((e1) -> System.out.println(e1.toUpperCase(Locale.ROOT)));

        System.out.println(employees.stream()
                .filter(e1 -> e1.salary >= 40000)
                .map((e1) -> e1.name)
                .count());

        System.out.println(employees.stream()
                .filter(e1 -> e1.salary >= 40000)
                .reduce((e1, e2) -> e1.salary > e2.salary ? e1 : e2));

        employees.stream()
                .sorted((e1, e2) -> e1.age - e2.age)
                .limit(3)
                .forEach(System.out::println);

        String[] a = {"hjk", "bhu", "bhi", "hjk", "bhu"};
        Arrays.stream(a)
                .distinct()
                .forEach(System.out::println);




    }
}
