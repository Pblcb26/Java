import java.sql.SQLException;

/**
* Lection 8
*/

public class Main {
    public static void main(String[] args) throws SQLException {

        DbHandler dbHandler = new DbHandler();

        Student student = new Student();
        student.name = "Mosya";
        student.course = 3;
        student.faculty = "Obdiranstva";

        //dbHandler.addStudent(student);
        System.out.println(dbHandler.findAllStudents());
        System.out.println(dbHandler.findStudentOnFaculty("Obdiranstva"));
        //dbHandler.delStudent("Mosya");
    }
}
