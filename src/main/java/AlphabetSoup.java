package main.java;

import java.util.Arrays;
import java.util.Scanner;

/**                 CODERBYTE BEGINNER CHALLENGE                                        *
 *                                                                                      *
 *  Alphabet Soup                                                                       *
 *  Have the function AlphabetSoup(str) take the str string parameter being passed      *
 *  and return the string with the letters in alphabetical order                        *
 *  (ie. hello becomes ehllo). Assume numbers and punctuation symbols will not be       *
 *  included in the string.
 *
 */

public class AlphabetSoup {

    private static String AlphabetSort(String str) {
        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        return String.copyValueOf(letters);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input phrase:");
        System.out.print(AlphabetSort(s.nextLine()));
    }
}
