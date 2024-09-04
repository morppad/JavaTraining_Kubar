import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task9
{
    public static void main(String[] args)
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            ArrayList list = new ArrayList<>();
            for (int k = 0; k <= input.length()-1; k++)
            {
                list.add(input.charAt(k));
            }
            for (int i = input.length(); i>0; i--)
            {
                list.set(input.length()-i, input.charAt(i-1));
            }
            for (int j = 0; j < input.length(); j++)
            {
                System.out.print(list.get(j));
            }
            System.out.println();
        }
    }
}
