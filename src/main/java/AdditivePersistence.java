package main.java;

import java.util.Scanner;

/**
 * Have the function AdditivePersistence(num) take the num parameter being passed which will always be a
 * positive integer and return its additive persistence which is the number of times you must add the digits in num
 * until you reach a single digit.
 * For example: if num is 2718 then your program should return 2
 * because 2 + 7 + 1 + 8 = 18 and 1 + 8 = 9 and you stop at 9.
 */

public class AdditivePersistence {
    int AdditivePersistence(int n) {
        int i = 0;
        int sum = n;
        while (sum > 9) {
            char[] letters = String.valueOf(sum).toCharArray();
            sum = 0;
            for (char let : letters) {
                sum += Character.getNumericValue(let);
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = in.nextInt();
        in.close();

        AdditivePersistence number = new AdditivePersistence();
        System.out.println(number.AdditivePersistence(num));
    }
}
