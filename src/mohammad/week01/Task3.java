package mohammad.week01;

/*
   QUESTION 3- Write a function which prints out the numbers from 1 to 30 but
   for numbers which are a multiple of 3, print "FIN" instead of the number
   and for numbers which are a multiple of 5, print "RA" instead of the number.
   for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
    */

public class Task3 {
    public static void main(String[] args) {
        for (int x = 1 ; x <= 30 ; x++){
            if (x % 3 == 0 && x % 5 == 0){
                System.out.print("FINRA\t");
            } else if (x % 3 == 0) {
                System.out.print("FIN\t");
            } else if (x % 5 == 0) {
                System.out.print("RA\t");
            }else {
                System.out.print(x+"\t");
            }
        }
    }
}
