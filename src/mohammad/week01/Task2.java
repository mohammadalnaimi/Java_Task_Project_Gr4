package mohammad.week01;
/*
    QUESTION 2- Numbers without / operator
    Write a method that can divide two nigative numbers without using division operator
     */


public class Task2 {
    public static void main(String[] args) {
        int a =95;
        int b = 10;
        divide(a,b);
    }
    public static void divide(int a, int b) {
        if ( a == 0 ){
            System.out.println(0);
        } else if (b == 0) {
            System.out.println("cann't divide by 0");

        } else if (a == b ) {
            System.out.println(1);
        } else if (a > b) {
            int division = 0;
            while (a >= b){
                a= a-b;
                division++;
            }
            System.out.println(division);
        }

    }
}
