package AliB2.Week02;

public class NumbersDivisibleBy_3_5_15 {

    public static void main(String[] args) {

        int n = 100;
        String res1 = "";
        String res2 = "";
        String res3 = "";
        for (int i = 0; i < n; i++) {
            if (i % 15 == 0 && i % 5 == 0 && i % 3 == 0 ) {
                res1 = res1 + i + " " ;
            } else if (i % 5 == 0) {
                res2 = res2 + i + " " ;
            } else if (i % 3 == 0 ) {
                res3 = res3 + i + " " ;
            }
        }
        System.out.println("Divisible By 15 " + res1);
        System.out.println("Divisible By 5 " + res2);
        System.out.println("Divisible By 3 " + res3);

    }
}
