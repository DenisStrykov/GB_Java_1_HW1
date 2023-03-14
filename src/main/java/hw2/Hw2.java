package hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hw2 {

    public static void main(String[] args) {

        /*
        Дана последовательность целых чисел, оканчивающаяся нулем.
        Найти сумму положительных чисел, после которых следует отрицательное число.

        Пример ввода:
        1 2 1 2 -1 1 3 1 3 -1 0
        Логика расчета:
        2 -1 переход -> 2 в сумму
        3 -1 переход -> 3 в сумму
        Пример вывода: 5
         */


        List<Integer> list = ReadAndCreateList();
        System.out.println(list);

        FoundAndSum(list);


    }

    /**
     * Метод создает список List типа Array и дает возможность пользователю заполнить его с клавиатуры
     *
     * @return : возвращает список List типа Array
     */
    static List<Integer> ReadAndCreateList() {

        List<Integer> userInputArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через enter : ");
        while (true) {

            int x = scanner.nextInt();
            if (x != 0) {
                userInputArray.add(x);
            } else {
                break;
            }
        }
        userInputArray.add(0);
        return userInputArray;
    }

    /**
     * Метод ищет заданные по условию значения, выводит из в консоль и считает их сумму
     *
     * @param list : вложенный список List типа Array
     */
    static void FoundAndSum(List<Integer> list) {

        int count = 1;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > 0 && list.get(i + 1) < 0) {
                sum += list.get(i);
                System.out.println(count + " искомое число : " + list.get(i));
                count++;
            }
        }
        System.out.println("Сумма искомых чисел равна: " + sum);
    }

}
