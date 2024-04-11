package ridwan;

public class Task1 {
    public static void main(String[] args) {

        String answer = identify(-126);
        System.out.println(answer);

    }
    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }

    }
}
