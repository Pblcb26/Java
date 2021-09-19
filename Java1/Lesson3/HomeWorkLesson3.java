/**
 * Java 1. Homework. Lesson 3.
 * @author Afanasyeva MS
 * @version 20.09.2021
 */
import java.util.Arrays;
import java.util.Random;

class HomeWorkLesson3 {
    public static void main(String[] args) {
        invArr();
        fillArr();
        lessThan6Arr();
        diagonal(5);
        diagonal(6);
        argArray(5, 6);
        
        minMax(8);
        minMax(3);
        minMax(5);

        int[] arr = {8, 2, 6, 12, 2, 26};
        System.out.println(checkBalance(arr));
        System.out.println(checkBalance2(arr));
        System.out.println(checkBalance3(arr));
        int[] arr1 = {8, 2, 6, 12, 2, 28};
        System.out.println(checkBalance(arr1));
        System.out.println(checkBalance2(arr1));
        System.out.println(checkBalance3(arr1));
        int[] arr2 = {8, 3, 6, 12, 2, 26};
        System.out.println(checkBalance(arr2));
        System.out.println(checkBalance2(arr2));
        System.out.println(checkBalance3(arr2));
        
        int[] arr3 = {1, 2, 3, 4, 5};
        displacement(arr3, 0);
        int[] arr4 = {1, 2, 3, 4, 5};
        displacement(arr4, 1);
        int[] arr5 = {1, 2, 3, 4, 5};
        displacement(arr5, -2);
        int[] arr6 = {1, 2, 3, 4, 5};
        displacement(arr6, 6);
    }

    static void invArr() {
        int[] arr = {0, 1, 1, 0, 0, 1, 0, 0};
        System.out.println(Arrays.toString(arr));//Для сравнения с результатом
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void lessThan6Arr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));//Для сравнения с результатом
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void diagonal(int a) {
        int[] [] arr = new int[a] [a];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || j == arr.length - 1 - i) arr[i] [j] = 1;
                System.out.print(arr[i] [j] + " ");
            }
            System.out.println();
        }
    }

    static void argArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void minMax(int len) {
        Random rand = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(500);
        }
        System.out.println(Arrays.toString(arr));//Для сравнения с результатом
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//Для сравнения с результатом
        int min = arr[0];
        int max = arr[len - 1];
        System.out.println("Min - " + min + ", Max - " + max);
    }

    static boolean checkBalance(int[] arr) {
        int lSumm = 0;
        System.out.println(Arrays.toString(arr));//Для сравнения с результатом
        for (int i = 0; i < arr.length; i++) {
            lSumm += arr[i];
            int rSumm = 0;
            for (int j = i + 1; j < arr.length; j++) {
                rSumm += arr[j];
            }
            if (lSumm == rSumm) return true;
        }
        return false;
    }

    static boolean checkBalance2(int[] arr) {
        int arrSumm = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSumm += arr[i];
        }
        if (arrSumm % 2 != 0) return false; //Только для цельночисленного массива
        int curSumm = 0;
        for (int i = 0; i < arr.length; i++) {
            curSumm += arr[i];
            if (curSumm == arrSumm / 2) return true;
        }
        return false;
    }

    static boolean checkBalance3(int[] arr) {
        int arrSumm = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSumm += arr[i];
        }
        if (arrSumm % 2 != 0) return false; //Только для цельночисленного массива
        int curSumm = 0;
        for (int i = 0; i < arr.length; i++) {
            curSumm += arr[i];
            if (arrSumm - curSumm == curSumm) return true;
        }
        return false;
    }

    static void displacement(int[] arr, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                shiftRight(arr);
            }
        } else if (n < 0) {
            for (int i = n; i < 0; i++) {
                shiftLeft(arr);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void shiftRight(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                arr[i] = temp;
            } else {
                arr[i] = arr[i - 1];
            }
        }
    }

    static void shiftLeft(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = temp;
            } else {
                arr[i] = arr[i + 1];
            }
        }
    }
}