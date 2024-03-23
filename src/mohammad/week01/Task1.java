package mohammad.week01;
/*
     QUESTION 1 - Write a method which can identify if a given number odd or even
      Ex: identify(5) -->"Odd"
      identify (6) --> "Even"
     */
public class Task1 {

    public static void main(String[] args) {

        System.out.println("evenOrOdd() = " + evenOrOdd(6));

    }
    public static String evenOrOdd (int num){
        if (num % 2 == 0){
            return "even";
        }else {
            return "Odd";
        }
    }

}
