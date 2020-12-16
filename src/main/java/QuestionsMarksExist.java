package main.java;

/**
 * Have the function QuestionsMarks(str) take the str string parameter,
 * which will contain single digit numbers, letters, and question marks,
 * and check if there are exactly 3 question marks between every pair of
 * two numbers that add up to 10. If so, then your program should return
 * the string true, otherwise it should return the string false.
 * If there aren't any two numbers that add up to 10 in the string,
 * then your program should return false as well.
 *
 * For example: if str is "arrb6???4xxbl5???eee5" then your program should
 * return true because there are exactly 3 question marks between 6 and 4,
 * and 3 question marks between 5 and 5 at the end of the string.
 */

public class QuestionsMarksExist {

    public String QuestionsMarks(String str) {

        String[] strArr = str.split("");
        int[] res = new int[str.length()];
        int i = 0, j = 0, numQuestionMark = 0, sum = 0;
        String output = "false";

        for (String element : strArr) {
            if (element.matches("[0-9]")) {
                sum += Integer.parseInt(element);
                if (i == 0) {
                    res[i] = j;
                    i++;
                }

                if (sum == 10) {
                    res[i] = j;
                    i++;
                    sum = Integer.parseInt(element);
                }
            }
            j++;
        }

        if (i > 0) {
            for (int e = 0; e < i - 1; e++) {
                if (res[e + 1] > 0) {
                    numQuestionMark = 0;
                    for (int elemStrArr = res[e]; elemStrArr < res[e + 1]; elemStrArr++) {
                        if (strArr[elemStrArr].equals("?")) {
                            numQuestionMark++;
                        }
                    }
                }

                if ((numQuestionMark > 0) && (numQuestionMark == 3)) {
                    output = "true";
                } else {
                    output = "false";
                    e = i;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        // keep this function call here

        String initStr = "arrb6???4xxbl5???eee5";
        QuestionsMarksExist str = new QuestionsMarksExist();
        System.out.print(str.QuestionsMarks(initStr));
    }
}
