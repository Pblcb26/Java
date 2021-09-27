/**
 * Java 1. Homework. Lesson 5.
 * @author Afanasyeva MS
 * @version 28.09.2021
 */

class HomeWork5 {

    public static void main(String[] args) {
        Employe[] employeArr = new Employe[5];
        employeArr[0] = new Employe("Ivanov Ivan Ivanvich", "Engineer", "ivivan@mailbox.com", "89231238512", 30000, -40);
        employeArr[1] = new Employe("Sidorov Sidor Sidorovich", "Worker", "sid@mailbox.com", "89562548542", 50000, 0);
        employeArr[2] = new Employe("Moskova Moska Moskovna", "Apostol", "moska@mailbox.com", "86666666666", 10000, 500);
        employeArr[3] = new Employe("Kusakov Kusaka Kusakovich", "Prosto Bog", "Kusaka@mailbox.com", "81313131313", 100500, 100500);
        employeArr[4] = new Employe("Kotov Kot Kotovich", "Meauker", "kot@mailbox.com", "89158464257", 50000, 41);

        for (int i = 0; i < employeArr.length; i++) {
            System.out.println(employeArr[i]);
        }
        
        System.out.println("Сотрудники старше 40 лет:");

        for (int i = 0; i < employeArr.length; i++) {
            if (employeArr[i].getAge() > 40)
                System.out.println(employeArr[i]);
        }

    }
}