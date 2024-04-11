package windia.week01;

public class Task2 {
    /*
    QUESTION 2- Numbers without / operator
    Write a method that can divide two numbers without using division operator
     */

    public static void main(String[] args) {
        int dividend = 8;
        int divisor = 2;
        int num = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            num++;
        }

        System.out.println("Num: " + num);
    }
}
