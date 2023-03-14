package hw1;

import java.util.Scanner;

public class Hw1 {

    public static void main(String[] args) {

        /*
        Измените порядок слов в обратном порядке
        Example 1:
        Input: s = "the sky is blue"
        Output: "blue is sky the"
         */


        String theLine = ReadString("Введите ваш текст: ");
        System.out.println(theLine);

        String[] words = theLine.split(" ");
        Swap(words);

        StringBuildAndPrint(words);

    }

    /**
     * Метод считывает введенную с консоли строку, убирает пробелы перед и после строки,
     * и лишние пробелы между слов
     *
     * @param m : вложенное сообщение
     * @return : возвращает строку без лишних пробелов
     */
    static String ReadString(String m) {

        System.out.print(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim().replaceAll("[\\s]{2,}", " ");
    }

    /**
     * Метод меняет слова в предложении местами
     *
     * @param words : вложенный массив слов
     */
    static void Swap(String[] words) {

        String c = "";
        for (int i = 0; i < words.length / 2; i++) {
            c = words[(words.length - 1) - i];
            words[(words.length - 1) - i] = words[i];
            words[i] = c;
        }
    }

    /**
     * Метод собирает массив строк в одну строку и печатает ее
     *
     * @param words : вложенный массив слов
     */
    static void StringBuildAndPrint(String[] words) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        System.out.println(result);
    }

}
