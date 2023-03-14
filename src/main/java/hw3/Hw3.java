package hw3;

import java.util.Scanner;

public class Hw3 {

    public static void main(String[] args) {

        /*
        Учитывая две двоичные строки a и b, верните их сумму в виде двоичной строки.
        Example 1:
        Input: a = "11", b = "1"
        Output: "100"
         */


        String a = ReadString("Введите число a: ");
        String b = ReadString("Введите число b: ");
        System.out.println("Число a = " + a);
        System.out.println("Число b = " + b);

        System.out.println("Бинарна сумма = " + FindSum(a, b));

    }


    static String ReadString(String m) {

        System.out.print(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static String FindSum(String a, String b) {

        int lengthA = a.length();
        int lengthB = b.length();

        int max = Math.max(lengthA, lengthB);

        StringBuilder sum = new StringBuilder();
        int carry = 0;

        for (int i = 0; i < max; i++) {

            int m = getBit(a, lengthA - i - 1);
            int n = getBit(b, lengthB - i - 1);
            int add = m + n + carry;
            sum.append(add % 2);
            carry = add / 2;
        }

        if (carry == 1) {
            sum.append("1");
        }

        return sum.reverse().toString();
    }


    static int getBit(String s, int index) {

        if (index < 0 || index > s.length()) {
            return 0;
        }
        if (s.charAt(index) == '0') {
            return 0;
        } else {
            return 1;
        }
    }

}
