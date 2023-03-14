package cw1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        /*
        Задан массив nums.
        Мы определяем текущую сумму массива как runningSum[i] = sum(nums[0]...nums[i]).
        Возвращает текущую сумму чисел.
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
         */


        int size = ReadInt("Укажите размер массива: ");
        int[] collection = FillCollection(size);
        PrintCollection(collection, "Начальный массив: ");
        int[] newCollection = FillNewCollection(collection);
        System.out.println();
        PrintCollection(newCollection, "Обработанный массив: ");

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
     * Метод создает новый массив и на основе уже имеющегося массива заполняет его,
     * производя операции (по условию) на основе старого
     *
     * @param collection : вложенный массив данных
     * @return : возвращает новый, обработанный по условию массив
     */
    static int[] FillNewCollection(int[] collection) {

        int sum = 0;
        int[] newCollection = new int[collection.length];
        for (int i = 0; i < collection.length; i++) {
            newCollection[i] = collection[i] + sum;
            sum = newCollection[i];
        }
        return newCollection;
    }

}
