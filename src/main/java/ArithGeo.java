package main.java;

import java.util.Scanner;

/**
 * Have the function ArithGeo(arr) take the array of numbers stored in arr and return the string "Arithmetic"
 * if the sequence follows an arithmetic pattern or return "Geometric" if it follows a geometric pattern.
 * If the sequence doesn't follow either pattern return -1. An arithmetic sequence is one where the difference between
 * each of the numbers is consistent, where as in a geometric sequence, each term after the first is multiplied by some
 * constant or common ratio.
 * Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54].
 * Negative numbers may be entered as parameters, 0 will not be entered, and no array will contain all the same elements
 */

public class ArithGeo {

    String ArithGew(String str) {
        String[] arr = str.replaceAll("[^0-9,]","").split(",");

        if (arr.length > 2) {
            int diff = Integer.parseInt(arr[1]) - Integer.parseInt(arr[0]);
            float div = Integer.parseInt(arr[1]) / Integer.parseInt(arr[0]);

            for (int i = 2; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) - Integer.parseInt(arr[i-1]) == diff) {
                    str = "Arithmetic";
                } else {
                    if (Integer.parseInt(arr[i]) / Integer.parseInt(arr[i-1]) == div) {
                        str = "Geometric";
                    } else {
                        str = "-1";
                        break;
                    }
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input an array of numbers:");
        String str = in.nextLine();
        in.close();

        ArithGeo arithGeo = new ArithGeo();
        System.out.println(arithGeo.ArithGew(str));
    }

}
