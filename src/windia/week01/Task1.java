package windia.week01;

public class Task1 {
    /*
     QUESTION 1 - Write a method which can identify if a given number odd or even
      Ex: identify(5) -->"Odd"
      identify (6) --> "Even"
     */


    public static void evenAndOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else if (number % 2 == 1) {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        evenAndOdd(10);
    }
}
