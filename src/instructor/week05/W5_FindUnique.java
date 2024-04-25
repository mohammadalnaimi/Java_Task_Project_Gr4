package instructor.week05;

import java.util.Arrays;
import java.util.Collections;
/*String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";*/


public class W5_FindUnique {
    public static void main(String[] args) {

        String letters ="AAABBBCCCDEF";
        System.out.println(unigueChar(letters));
    }

    public static String unigueChar(String letters){

        String uniqe ="";
        for (int i = 0; i < letters.length(); i++) {
            int index = 0;
            char count = letters.charAt(i);
            for (int j = 0; j < letters.length(); j++) {
                if (letters.charAt(j)  == count){
                    index++;

                }
            }

            if (index == 1){
                uniqe += count;
            }

        }
        return uniqe;

    }

}
