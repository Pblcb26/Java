/**
 * Java 1. Lesson 4.
 * @author Afanasyeva MS
 * @version 20.09.2021
 */
import java.util.Scanner;
import java.util.Random;

class TicTacToe {
    final char SIGN_X = 'x'; //human
    final char SIGN_O = 'o'; //AI
    final char SIGN_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new TicTacToe() .game();
    }

    TicTacToe() {
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
            //ход человека
            //проверка - победа или ничья?
            //ход компа
            //проверка - победа или ничья?
            turnHuman();
            if (checkWin(SIGN_X)) {
                System.out.println("You win!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI();
            if (checkWin(SIGN_O)) {
                System.out.println("AI win!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }

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
        if (x < 0 || y < 0 || x >= 3|| y >= 3) {
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

    boolean checkWin(char ch) {
        //y
        if (table[0][0] == ch && table[1][0] == ch && table[2][0] == ch) {
            return true;
        }
        if (table[0][1] == ch && table[1][1] == ch && table[2][1] == ch) {
            return true;
        }
        if (table[0][2] == ch && table[1][2] == ch && table[2][2] == ch) {
            return true;
        }
        //x
        if (table[0][0] == ch && table[0][1] == ch && table[0][2] == ch) {
            return true;
        }
        if (table[1][0] == ch && table[1][1] == ch && table[1][2] == ch) {
            return true;
        }
        if (table[2][0] == ch && table[2][1] == ch && table[2][2] == ch) {
            return true;
        }
        //d
        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) {
            return true;
        }
        if (table[0][2] == ch && table[1][1] == ch && table[2][0] == ch) {
            return true;
        }
        return false;
    }
}