package main.java;

/**
 * Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements:
 * the first element will represent a list of comma-separated numbers sorted in ascending order, the second element
 * will represent a second list of comma-separated numbers (also sorted). Your goal is to return a comma-separated
 * string containing the numbers that occur in elements of strArr in sorted order. If there is no intersection,
 * return the string false.
 *
 * For example:
 * if strArr contains ["1, 3, 4, 7, 13", "1, 2, 4, 13, 15"] the output should return "1,4,13"
 * because those numbers appear in both strings. The array given will not be empty,
 * and each string inside the array will be of numbers sorted in ascending order and may contain negative numbers.
 */

public class FindElementIntersection {

    public String FindIntersection(String[] strArr) {

        String[] str1 = strArr[1].split(", ");
        String res = "";

        for (int i = 0; i < str1.length; i++) {
            if (strArr[0].contains(String.valueOf(str1[i]))){
                if (res.length() == 0) {
                    res = "";
                    res += str1[i];
                } else {
                    res += "," + str1[i];
                }
            }
        }
        return res.length()==0 ? "false" : res;
    }

        public static void main (String[]args){

            String[] strArr = new String[]{"1, 3, 4, 7, 13", "25, 56, 1025, 456, 7"};

            FindElementIntersection str = new FindElementIntersection();
            System.out.print(str.FindIntersection(strArr));
        }
    }
