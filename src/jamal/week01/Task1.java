package jamal.week01;

public class Task1 {

    public static void main(String[] args)
    {
        String str = "AAABBBCCCDEF";

        for (int i = 0; i < str.length(); i++)
        {
            int unique = 0;
            for (int j = 0; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j) && i != j)
                {
                    unique = 1;
                    break;
                }
            }
            if (unique == 0)
                System.out.print(str.charAt(i));
        }
    }

    }

