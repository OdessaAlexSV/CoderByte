package main.java;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Have the function ArrayAdditionI(arr) take the array of numbers stored in arr and return the string true if any
 * combination of numbers in the array can be added up to equal the largest number in the array, otherwise return the
 * string false.
 * For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true because
 * 4 + 6 + 10 + 3 = 23.
 * The array will not be empty, will not contain all the same elements, and may contain negative numbers.
 */

public class ArrayAditionOne {

    private String ArrayAditionOne(String str) {
        String[] arr = str.replaceAll("[^0-9,]", "").split(",");
        int[] numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(numbers);
        int sum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }

        if (sum == numbers[numbers.length - 1]) {
            return "true";
        } else {
            return "false";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input an array of numbers");
        String str = in.nextLine();
        in.close();

        ArrayAditionOne arrayAditionOne = new ArrayAditionOne();
        System.out.println(arrayAditionOne.ArrayAditionOne(str));
    }

}


