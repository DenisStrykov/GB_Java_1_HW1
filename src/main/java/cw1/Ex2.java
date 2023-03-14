package cw1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        /*
        Дана последовательность N целых чисел. Найти кол-во положительных чисел, после которых следует отрицательное число.
         */

        // Инициализируем параметры массива
        int size = ReadInt("Укажите размер массива: ");
        int minOfCollection = ReadInt("Задайте минимальную границу массива: ");
        int maxOfCollection = ReadInt("Задайте максимальную границу массива: ");

        // Инициализируем, заполняем и печатаем массив
        int[] collection = FillRandomCollection(size, minOfCollection, maxOfCollection);
        PrintCollection(collection, "Начальный массив: ");

        // Находим и печатаем искомые значения
        FindRequiredValues(collection);

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
     * Метод создает массив и заполняет его целочисленными данными в пределах от min до max
     *
     * @param size : размер массива
     * @param min  : минимальное значение массива
     * @param max  : максимальное значение массива
     * @return : возвращает заполненный массив
     */
    static int[] FillRandomCollection(int size, int min, int max) {

        int[] array = new int[size];
        Random random = new Random();
        return random.ints(min, (max + 1)).limit(array.length).toArray();
    }

    /**
     * Метод выводит в консоль печать сообщения, затем массива
     *
     * @param collection : вложенный массив данных
     * @param m : вложенное сообщение
     */
    static void PrintCollection(int[] collection, String m) {

        System.out.println(m + Arrays.toString(collection));
    }

    /**
     * Метод ищет заданные по условию числа в массиве, печатает их и подсчитывает их кол-во
     *
     * @param collection : вложенный массив
     */
    static void FindRequiredValues(int[] collection) {

        int count = 0;
        System.out.print("Искомые значения: ");
        for (int i = 0; i < collection.length - 1; i++) {

            if (collection[i] > 0 && collection[i + 1] < 0) {
                System.out.print(collection[i] + ", ");
                count++;
            }
        }
        System.out.println("");
        System.out.println("Кол-во положительных чисел, после которых следует отрицательное число: " + count);
    }

}
