/**
 * Java 1. Training. Lesson 2.
 * @author Afanasyeva MS
 * @version 16.09.2021
 */
class Lesson2 {
    public static void main(String[] args) {
        System.out.println(summ(5, 5));
        printSomeText();
        printMyText("Java");
        cycle();
        minusCycle();
        doubleInt();
        forDrowing1();
        forDrowing2();
        forDrowing3();
        forDrowing4();
        forDrowing5();
        forDrowing6();
        forDrowing7();
        practice1();
        practice2();
        practice3();
        practice4();
        practice51();
        practice52();
    }

    /*Методы примеры*/
    static int summ(int a, int b) {
        return a + b;
    }

    static void printSomeText() {
        System.out.println("Hello");
    }

    static void printMyText(String txtToPrint) {
        System.out.println(txtToPrint);
    }

    /*Циклы*/
    static void cycle() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("end");
    }

    /*отрицательный счетчик*/
    static void minusCycle() {
        int x;
        for (x = 10; x >= 0; x -= 5) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    /*две переменных*/
    static void doubleInt() {
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i-j: " + i + "-" + j);
        }
    }

    /*Циклы For*/
    static void forDrowing1() {
        for (int j = 0; j < 10; j++) {
            System.out.print('*');
        }
    }

    static void forDrowing2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void forDrowing3() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void forDrowing4() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j < 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    static void forDrowing5() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    static void forDrowing6() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    static void forDrowing7() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i > j) {
                    System.out.print("0 ");
                } else if (i < j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /*Упражнения*/
    static void practice1() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print((i == 0 || i == 5 || j == 0 || j == 5) ? "* " : "  ");
            }
            System.out.println();
        }
    }

    static void practice2() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print((i == 0 || i == 5 || j == 0 || j == 5 || i == j) ? "* " : "  ");
            }
            System.out.println();
        }
    }

    static void practice3() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print((i == 5 || j <= i) ? "* " : "  ");
            }
            System.out.println();
        }
    }

    static void practice4() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print((i <= 1 || i >= 4 || j <= 1 || j >= 4) ? "* " : "  ");
            }
            System.out.println();
        }
    }

    static void practice51() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print((i < 2 && j > 3 || i > 3 && j < 2) ? "  " : "* ");
            }
            System.out.println();
        }
    }

    static void practice52() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print((i < 4 && j < 4 || i > 1 && j > 1) ? "* " : "  ");
            }
            System.out.println();
        }
    }
}