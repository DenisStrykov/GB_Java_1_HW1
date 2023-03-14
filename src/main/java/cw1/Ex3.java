package cw1;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        /*
        Дана строка. Поменять местами ее половины.
         */

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String res = "";

        if (str.length() % 2 != 0) {
            res = str.substring(str.length() / 2 + 1) + str.substring(str.length() / 2, str.length() / 2 + 1) + str.substring(0, str.length() / 2);
        } else {
            res = str.substring(str.length() / 2) + str.substring(0, str.length() / 2);
        }
        System.out.println(res);

    }

}
