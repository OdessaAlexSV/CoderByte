package main.java;

/**
 * Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string.
 * If there are two or more words that are the same length, return the first word from the string with that length.
 * Ignore punctuation and assume sen will not be empty.
 * Examples
 * Input: "fun&!! time"
 * Output: time
 * Input: "I love dogs"
 * Output: love
 */

import java.util.Scanner;

public class LongestWordFromList {
    public static String LongestWord(String sen) {

        String[] array = sen.replaceAll("[^a-zA-Z0-9\\s]","").split(" ");

            int index = 0;
            int maxLength = 0;

            for (int i = 0; i < array.length; i++) {
                if(maxLength < array[i].length()){
                    maxLength = array[i].length();
                    index = i;
                }
            }

        return array[index];
    }


    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println("Input phrase:");
        System.out.print(LongestWord(s.nextLine()));
    }
}
