package main.java;


import java.util.Scanner;

/**
 * AB Check
 * Have the function ABCheck(str) take the str  parameter being passed and return the
 * string true if the characters a and b are separated by exactly 3 places anywhere in
 * the string at least once.
 * (ie. "lane borrowed" would result in true because there is exactly three characters
 * between a and b). Otherwise return the string false.
 */

public class ABCheck {

    String ABCheck(String str) {
        char[] letters = str.toCharArray();

        String res = "false";

        for (int i = 0; i < letters.length - 4; i++) {
            if (letters[i] == 'a' && letters[i + 4] == 'b') {
                res = "true";
                i = letters.length;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a sentence:");
        String str = in.nextLine();

        ABCheck c = new ABCheck();
        System.out.println(c.ABCheck(str));
    }
}
