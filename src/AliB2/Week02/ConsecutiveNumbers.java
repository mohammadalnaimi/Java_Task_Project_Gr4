package AliB2.Week02;

public class ConsecutiveNumbers {
    public static void main(String[] args) {

        int n = 24;
        for (int i = 0; i < n; i++) {
            if (i % 5 == 0 && i % 3 == 0 && i % 2 == 0){
                System.out.print("CodilityTestCoders");
            } else if (i % 3 == 0 && i % 2 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 5 == 0 ) {
                System.out.println("Coders");
            }  else if (i % 3 == 0 ) {
            System.out.println("Test");
            } else if (i % 2 == 0 ) {
                System.out.println("Codility");
            } else {
                System.out.print(i + " ");}
        }

    }
}
