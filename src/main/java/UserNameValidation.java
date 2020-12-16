package main.java;

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

    public boolean allowSymbols(String str) {
        return str.matches("[A-Za-z0-9_]+");
    }

    public boolean lastChar(String str) {
        return str.endsWith("_");
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