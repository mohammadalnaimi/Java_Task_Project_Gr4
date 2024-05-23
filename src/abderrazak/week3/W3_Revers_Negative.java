package abderrazak.week3;

public class W3_Revers_Negative {

    public static void main(String[] args) {

        System.out.println(reverseNegative(-5));
    }

    public static int reverseNegative (int n){

        if(n<0){
            n*=-1;
        }
         return n;
    }

}
