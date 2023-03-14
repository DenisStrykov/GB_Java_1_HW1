package cw1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        /*
        Дан массив целых чисел. Верно ли, что массив является симметричным?
         */

        int size = ReadInt("Задайте размер массива: ");
        int[] collection = FillCollection(size);
        PrintCollection(collection, "Заданный массив: ");
        System.out.println();
        if (IsCollectionSymmetrical(collection)) {
            System.out.println("Массив симметричен");
        } else {
            System.out.println("Массив не симметричен");
        }



    }

    /**
     * Метод печатает вложенное сообщение и считывает переменную типа int
     *
     * @param m: вложенное сообщение
     * @return : возвращает считанную с консоли переменную
     */
    static int ReadInt(String m) {

        System.out.print(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * Метод считывает с консоли введенное число и записывает его в массив
     *
     * @param size : размер массива
     * @return : возвращает заполненный пользователем массив
     */
    static int[] FillCollection(int size) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + (i + 1) + " элемент массива: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
    /**
     * Метод выводит в консоль печать сообщения, затем массива
     *
     * @param collection : вложенный массив данных
     * @param m : вложенное сообщение
     */
    static void PrintCollection(int[] collection, String m) {

        System.out.print(m + Arrays.toString(collection));
    }

    /**
     * Метод сравнивает пары массива на симметричность
     *
     * @param collection : вложенный массив данных
     * @return : возвращает булевую переменную (true / false)
     */
    static boolean IsCollectionSymmetrical(int[] collection) {

        for (int i = 0; i < collection.length / 2; i++) {
            if (collection[i] != collection[(collection.length - 1) - i]) {
                return false;
            }
        }
        return true;
    }

}
