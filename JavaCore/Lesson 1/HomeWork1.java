/**
 * JavaCore. Homework. Lesson 1.
 * @author Afanasyeva MS
 * @version 17.10.2021
 */

class HomeWork1 {

    public static void main(String[] args) {
        
        Course c = new Course();

        Team team = new Team("Бесявые котаны");

        c.courseInfo();
        team.teamInfo();
        c.doIt(team);
        team.showResults();
    }
}