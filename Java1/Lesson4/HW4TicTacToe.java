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
    int fieldLenght = 5;
    int signForWin = 5;

    public static void main(String[] args) {
        new HW4TicTacToe() .game();
    }

    HW4TicTacToe() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[fieldLenght][fieldLenght];
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
        for (int i = 0; i < fieldLenght; i++) {
            for (int j = 0; j < fieldLenght; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int i = 0; i < fieldLenght; i++) {
            for (int j = 0; j < fieldLenght; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println(signForWin + " signs in line for win\n Enter X Y {1...5}");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while(!isCellValid(x, y));
        table[x][y] = SIGN_X;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(fieldLenght);
            y = random.nextInt(fieldLenght);
        } while(!isCellValid(x, y));
        table[x][y] = SIGN_O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= fieldLenght || y >= fieldLenght) {
            return false;
        }
        return table[x][y] == SIGN_EMPTY;
    }

    boolean isTableFull() {
        for (int i = 0; i < fieldLenght; i++) {
            for (int j = 0; j < fieldLenght; j++) {
                if (table[i][j] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    //Не работает если кол-во фишек для победы меньше размера поля
    boolean checkWin(char ch) {
        int diag = 0, diagRev = 0;
        //Проверка диагоналей.
        for (int i = 0; i < fieldLenght; i++) {
            diag += table[i][i] == ch? 1 : 0;
            diagRev += table[i][fieldLenght - 1 - i] == ch? 1 : 0;
        }
        if (diag == signForWin || diagRev == signForWin) {
            return true;
        }
        //Проверка горизонталь и вертикаль
        for (int i = 0; i < fieldLenght; i++) {
            int y = 0, x = 0;
            for (int j = 0; j < fieldLenght; j++) {
                y += table[i][j] == ch? 1 : 0;
                x += table[j][i] == ch? 1 : 0;
            }
            if (y == signForWin || x == signForWin) {
                return true;
            }
        }
        return false;
    }
}