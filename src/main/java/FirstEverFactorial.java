package main.java;

/**
 * Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it. For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24. For the test cases, the range will be between 1 and 18 and the input will always be an integer.
 * Examples
 * Input: 4
 * Output: 24
 * Input: 8
 * Output: 40320
 */

import java.util.Scanner;

public class FirstEverFactorial {
    public static int FirstFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * FirstFactorial(num - 1);
    }


    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }

}
