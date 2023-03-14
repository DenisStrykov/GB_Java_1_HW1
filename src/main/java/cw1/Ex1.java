package cw1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        /*
        Input: n = 234
        Output: 15
        Explanation:
        Product of digits = 2 * 3 * 4 = 24
        Sum of digits = 2 + 3 + 4 = 9
        Result = 24 - 9 = 15
         */

        // Считываем число с консоли
        int n = ReadInt("Введите целочисленное число: ");

        // Выполяем логику вычислений, печатаем результат
        System.out.println("Result = " + SubtractProductAndSum(n));

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
     * Метод вычисляет переменные по условию задачи и находит результат
     *
     * @param n: заданное пользователем число
     * @return : возвращает результат вычислений
     */
    static int SubtractProductAndSum(int n) {

        int productOfDigits = 1;
        int sumOfDigits = 0;

        while (n != 0) {
            productOfDigits *= n % 10;
            sumOfDigits += n % 10;
            n /= 10;
        }
        System.out.println("Result = " + productOfDigits + " - " + sumOfDigits);

        return productOfDigits - sumOfDigits;
    }

}
