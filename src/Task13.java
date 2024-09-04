import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args)
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            ArrayList list = new ArrayList<>();
            int count_check = 0;
            for (int k = 0; k <= input.length()-1; k++)
            {
                list.add(input.charAt(k));
            }
            for (int i = list.size(); i>0; i--)
            {
                int mirrored_index = list.size()-i;
                if (Objects.equals(list.get(mirrored_index), list.get(i - 1)))
                {
                    count_check = count_check+1;
                }
            }
            if (count_check == list.size())
            {
                System.out.println("Введенная строка - палиндром");
            }
            else
            {
                System.out.println("Введенная строка не является палиндромом");
            }
        }
    }
}
