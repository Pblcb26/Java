import org.sqlite.JDBC;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbHandler {

    public final String PATH_DB = "jdbc:sqlite:Z:\\Git\\Learn\\GB\\Java\\JavaCore\\Lesson 8\\Lection\\src\\main\\resources\\University.db";

    Connection connection;

    public DbHandler() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        connection = DriverManager.getConnection(PATH_DB);
    }

    public void addStudent(Student student) {
        try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO Students('Name', 'Course', 'Faculty')" +
                        "VALUES(?, ?, ?)"
        )) { statement.setObject(1, student.name);
            statement.setObject(2, student.course);
            statement.setObject(3, student.faculty);
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    //Выполнить запрос
    //Опционально - заполнить запрос
    //Опционально - получить ответ

    public List<Student> findAllStudents() throws SQLException {
        List<Student> students = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Students");
            while (resultSet.next()) {
                Student student = new Student();
                student.name = resultSet.getString("Name");
                student.course = resultSet.getInt("Course");
                student.faculty = resultSet.getString("Faculty");
                students.add(student);
            }
        } catch (Exception ignored) {}
        return students;
    }

    public List<Student> findStudentOnFaculty(String faculty) throws SQLException {
        List<Student> students = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Students WHERE faculty = '"+ faculty +"'");
            while (resultSet.next()) {
                Student student = new Student();
                student.name = resultSet.getString("Name");
                student.course = resultSet.getInt("Course");
                student.faculty = resultSet.getString("Faculty");
                students.add(student);
            }
        } catch (Exception ignored) {
        }
        return students;
    }

    public void delStudent(String name) {
        try (PreparedStatement statement = connection.prepareStatement(
                "DELETE FROM Students WHERE Name = ?"
        )) { statement.setObject(1, name);
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
