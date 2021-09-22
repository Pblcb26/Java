/**
 * Java 1. Homework. Lesson 4.
 * @author Afanasyeva MS
 * @version 22.09.2021
 */
import java.util.Scanner;
import java.util.Random;

class HW4TicTacToe {
    final char SIGN_X = 'x'; //human
    final char SIGN_O = 'o'; //AI
    final char SIGN_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new HW4TicTacToe() .game();
    }

    HW4TicTacToe() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
        System.out.println("Game init...");
    }

    void game() {
        initTable();
        
        System.out.println("Game start!");
        //игровая логика
        //инициализация таблицы
        while (true) {
            printTable();
            turnHuman();//ход человека
            if (checkWin(SIGN_X)) {//проверка - победа или ничья?
                System.out.println("You win!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI();//ход компа
            if (checkWin(SIGN_O)) {//проверка - победа или ничья?
                System.out.println("AI win!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        printTable();
    }

    //Дополнительные методы
    void initTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter X Y {1...3}");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while(!isCellValid(x, y));
        table[x][y] = SIGN_X;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while(!isCellValid(x, y));
        table[x][y] = SIGN_O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 3 || y >= 3) {
            return false;
        }
        return table[x][y] == SIGN_EMPTY;
    }

    boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    //Проверить при введении переменных для размера поля и кол-ва фишек в ряд
    boolean checkWin(char ch) {
        int diag = 0, diagRev = 0;
        //Проверка диагоналей.
        for (int i = 0; i < 3; i++) {
            if (table[i][i] == ch) {
                diag = diag + 1;
            }
            if ( table[i][2 - i] == ch) {
                diagRev = diagRev + 1;
            }
        }
        if (diag == 3 || diagRev == 3) {
            return true;
        }
        //Проверка горизонталь и вертикаль
        for (int i = 0; i < 3; i++) {
            int y = 0, x = 0;
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == ch) {
                    y = y + 1;
                }
                if (table[j][i] == ch) {
                    x = x + 1;
                }
            }
            if (y == 3 || x == 3) {
                return true;
            }
        }
        return false;
    }
}
