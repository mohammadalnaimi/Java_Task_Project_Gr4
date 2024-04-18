package AliB2.Week04;

import java.util.Arrays;

public class W4_SameLetters {
    // Write a return method that check if a string is build out of the same letters as another string.
    // Ex:  same("abc",  "cab"); -> true

    public static void main(String[] args) {
        // Example usage
        boolean result = same("abc","cba");
        System.out.println(result);
    }




        // We will create a method that takes two strings and returns true if the strings are the same.
        public static boolean same(String str1, String str2) {
            // we will convert the strings to character arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // then we sort the character arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            for (int i = 0; i < str1.length(); i++) {

               if (charArray1[i]!= charArray2[i]) { // if char array 1 is not equal to char array 2
                   return false; // then will return false
               }
            }
              return true; // otherwise  will return true
        }

             // ------> Compare sorted character arrays
             //   ===> return if arrays are equal .


}





