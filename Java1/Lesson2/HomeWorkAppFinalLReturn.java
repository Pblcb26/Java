/**
 * Java 1. Home Work 1. Lesson 2. Return.
 * @author Afanasyeva MS
 * @version 12.09.2021
 */
class HomeWorkAppFinalReturn {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-35, 35);
        checkSumSign(-35, 55);
        checkSumSign(-35, 25);
        printColor(125);
        printColor(56);
        printColor(0);
        printColor(-5);
        System.out.println(compareNumbers(55, 75));
        System.out.println(compareNumbers(95, 75));
        System.out.println(compareNumbers(55, 55));
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign(int c, int d) {
        System.out.println((c + d) >= 0? "Сумма положительная" : "Сумма отрицательная");
    }

    static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }    
    }

    static String compareNumbers(int a, int b) {
        return a >= b ? "a>=b" : "a < b";
        
    }
}