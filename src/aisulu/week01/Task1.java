package aisulu.week01;

public class Task1 {

    public static void main(String[] args) {

        oddOrEven(5);
        oddOrEven(10);

    }

    public static void oddOrEven(int number){
        if(number % 2 == 0){
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is odd");
        }
    }

}
/*
     QUESTION 1 - Write a method which can identify if a given number odd or even
      Ex: identify(5) -->"Odd"
      identify (6) --> "Even"
     */