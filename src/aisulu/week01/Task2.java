package aisulu.week01;

public class Task2 {

}


    public static void main(String[] args) {

        divide(10,5);
        divide(14,4);

    }

    public static void divide (double num1, double num2){
       double result = 0;
        while(num1>=num2){
            num1-=num2;
            result++;
        }
        System.out.println(result);
    }
}
/*
    QUESTION 2- Numbers without / operator
    Write a method that can divide two numbers without using division operator
     */

