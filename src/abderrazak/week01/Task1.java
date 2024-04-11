package abderrazak.week01;

public class Task1 {

    public static void main(String[] args) {



        String result = evenOROdd(5);
        System.out.println(result);

    }

    public static String evenOROdd (int num){
        if(num % 2 == 0){
            return "even";
        }else {
            return "odd";
        }

        //Write a method which can identifies given number is even or odd .
    }
}
