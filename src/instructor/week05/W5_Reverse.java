package instructor.week05;


//String -- Reverse
/* Write a return method that can reverse  String
   Ex: Reverse("ABCD"); ==> DCBA*/
public class W5_Reverse {
    public static void main(String[] args) {

        String text ="ABCD";
        System.out.println(reversed(text));
        System.out.println(reversed2(text));

    }

    public static StringBuilder reversed(String text){

        StringBuilder sb = new StringBuilder(text);

        return sb.reverse();

    }

    public static String reversed2(String text){

        String reversed ="";
        for (int i = text.length()-1; i >= 0 ; i--) {
            reversed+=text.charAt(i);
        }
        return reversed;

    }

}
