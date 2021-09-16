/**
 * Java 1. Home work. Lesson 2.
 * @author Afanasyeva MS
 * @version 16.09.2021
 */
class HomeWorkLesson2 {

    public static void main(String[] args) {
        System.out.println(between10And20(-10, 10));
        System.out.println(between10And20(9, 1));
        System.out.println(between10And20(5, 10));
        System.out.println(between10And20(15, 5));
        System.out.println(between10And20(15, 10));
        checkSign(-4);
        checkSign(0);
        checkSign(4);
        System.out.println(isNegative(-56));
        System.out.println(isNegative(0));
        System.out.println(isNegative(56));
        printWord("Бе-бе-бе!", 0);
        printWord("Бе-бе-бе!", 1);
        printWord("", 1);
        printWord("", 0);
        printWord("Бе-бе-бе!", 2);
        System.out.println(intercalaryYear(-1200));
        System.out.println(intercalaryYear(0));
        System.out.println(intercalaryYear(1984));
        System.out.println(intercalaryYear(1600));
        System.out.println(intercalaryYear(2100));
    }

    static boolean between10And20(int a, int b) {
        int c = a + b;
        return (c >= 10 && c <= 20) ? true : false;
    }

    static void checkSign(int a) {
        System.out.println(a >= 0 ? a + " число положительное" : a + " число отрицательное");
    }

    static boolean isNegative(int a) {
        return (a < 0) ? true : false;
    }

    static void printWord(String word, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }

    static boolean intercalaryYear(int a) {
        if (a <= 0) {
            return false;
        } else if (a % 400 == 0) {
            return true;
        } else {
            return a % 100 == 0 ? false : a % 4 == 0;
        }
    }
}