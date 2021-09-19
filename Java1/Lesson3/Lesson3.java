/**
 * Java 1. Training. Lesson 3.
 * @author Afanasyeva MS
 * @version 17.09.2021
 */

import java.util.Arrays;
import java.util.Random;
//import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


class Lesson3 {

    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 7, 15};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            arr[i] = arr[i] * 2;
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); /*Сортировка от меньего к большему*/
        
        /*Не статик метод*/
        Random random = new Random(); /*ссылочная переменная*/
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(10) + " "); /*вызов метода через имя ссылочной переменной*/
        }

        System.out.println();

        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(9);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("be");
        list1.add("be-be");
        System.out.println(list1);

        list1.remove(0);
        System.out.println(list1);

        list1.remove("be-be");
        System.out.println(list1);

        /*сканирует с терминала
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println(k);*/
    }
}