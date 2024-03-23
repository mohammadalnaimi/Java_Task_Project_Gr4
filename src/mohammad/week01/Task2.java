package mohammad.week01;
/*
    QUESTION 2- Numbers without / operator
    Write a method that can divide two  numbers without using division operator
     */


public class Task2 {
    public static void main(String[] args) {
        int a = 10;
        int b = -2;

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
            System.out.println(basicDivision(a, b));
        } else if (a < 0 && b < 0) {
            a = a * -1;
            b = b * -1;
            System.out.println(basicDivision(a, b)*-1);

        } else if (a < 0 && b > 0) {
            a *= -1;
            System.out.println(basicDivision(a, b)*-1);
        } else if (a > 0 && b < 0) {
            b*= -1;
            System.out.println((basicDivision(a, b)*-1));
        }

    }
    public static int basicDivision(int a, int b) {
        int division = 0;
        while (a >= b){
            a= a-b;
            division++;
        }
        return division;
    }
}
