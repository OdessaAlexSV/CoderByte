package main.java;

/**
 * Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order. For example: if the input string is "Hello World and Coders" then your program should return the string sredoC dna dlroW olleH.
 * Examples
 * Input: "coderbyte"
 * Output: etybredoc
 * Input: "I Love Code"
 * Output: edoC evoL I
 */

import java.util.Scanner;

public class FirstEverReverse {
    public static String FirstReverse(String str) {
        String[] arr = str.split("");
        for (int k = 0; k < arr.length / 2; k++) {
            String tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }

        StringBuilder builder = new StringBuilder();
        for (String s : arr) {
            builder.append(s);
        }
        str = builder.toString();
        return str;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}
