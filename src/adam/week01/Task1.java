package adam.week01;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        String string1 = "abc";
        String string2 = "cab";


        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        if (Arrays.equals(chars1, chars2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}


/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:


testing
 */