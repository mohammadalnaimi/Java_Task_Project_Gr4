package abderrazak.week01;

public class Task2 {

    public static void main(String[] args) {

        int dividend  = 10;
        int divisor = 1;

        System.out.print("result is : (" + dividend + " / " + divisor + ") = ");

        if ((dividend  < 0) || (divisor <= 0)) {
            System.err.println("dividend  cannot be negative and divisor cannot be zero or negative");
            return;
        }


        int quotient = 0;

        while (dividend  >= divisor){
            dividend  = dividend  - divisor;
            quotient++;
        }

        System.out.print(" " + quotient + "\n");

        if (dividend > 0) {
            int remainder = dividend;
            System.out.println("remainder is : " + remainder);
        }


    }

}



