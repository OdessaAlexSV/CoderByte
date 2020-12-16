package main.java;

/**
 * Have the function CodelandUsernameValidation(str) take the str parameter being
 * passed and determine if the string is a valid username according to the following rules:
 *
 * 1. The username is between 4 and 25 characters.
 * 2. It must start with a letter.
 * 3. It can only contain letters, numbers, and the underscore character.
 * 4. It cannot end with an underscore character.
 *
 * If the username is valid then your program should return the string true, otherwise return the string false.
 */

import java.util.*;

class UserNameValidation {

    public boolean CodeLandUsernameValidation(String str) {
        return lengthName(str) && startChar(str) && allowSymbols(str) && lastChar(str);
    }

    public boolean lengthName(String str) {
        return (str.length() >= 4) && (str.length() <= 25);
    }

    public boolean startChar(String str) {
        return (Character.isAlphabetic(str.charAt(0)));
    }

//    public boolean allowSymbols(String str) {
//        return str.matches("[A-Za-z0-9_]+");
//    }

    public boolean allowSymbols(String str) {
        boolean res = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit((str.charAt(i))) || Character.isLetter((str.charAt(i))) || str.charAt(i) == '_') {
                res = true;
            } else {
                res = false;
             break;
            }
        }
        return res;
    }

    public boolean lastChar(String str) {
        return !str.endsWith("_");
    }

    public static void main(String[] args) {
        UserNameValidation nameCheck = new UserNameValidation();
        boolean input = false;

        Scanner s = new Scanner(System.in);

        while (input == false) {
            System.out.println("\nInput any name:");
            String str = s.nextLine();
            System.out.print(nameCheck.CodeLandUsernameValidation(str));
            if (nameCheck.CodeLandUsernameValidation(str) == true) {
                input = true;
            }
        }
    }
}