package abderrazak.week3;

public class W3_Number_Prime {

    public static void main(String[] args) {

        int num = 23 ;


        if (IsPrime(num)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }



    static int i = 2;
    public static boolean IsPrime(int n){

        if(n == 0 || n == 1){
            return false;
        }
        if (n == i){
            return true;
        }
        if (n % i == 0){
            return false;
        }
        i++;

        return IsPrime(n);
    }
}
