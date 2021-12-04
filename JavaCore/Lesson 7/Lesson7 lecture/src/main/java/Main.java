import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = new Employee("Kusya", 75000);
        objectMapper.writeValue(new File("test.json"), employee);

        Employee employeeFromJson = objectMapper.readValue(new File("test.json"), Employee.class);
        System.out.println(employeeFromJson);

    }
}
