package adam.week01;

public class Task2 {


        public static int[] SumToZero ( int N){
            int[] result = new int[N];
            int index = 0;


            for (int i = 1; i <= N / 2; i++) {
                result[index++] = i;
                result[index++] = -i;
            }


            if (N % 2 != 0) {
                result[index] = 0;
            }

            return result;
        }

        public static void main (String[]args) {

            int N = 100;
            int[] result1 = SumToZero(N);
            System.out.println("N = " + N + ": " + java.util.Arrays.toString(result1));

        }
    }

/*
Write a function that given an integer N(1<N<100), returns an array containing N unique integers
that sum up to 0. The function can return any such array.
For example, given N=4, the function could return [1,0,-3,2] or [-2,1,-4,5].
The answer [1,-1,1,3] would be incorrect (because value 1 occurs twice).
For N=3 one of the possible answers is [-1,0,1]
 */