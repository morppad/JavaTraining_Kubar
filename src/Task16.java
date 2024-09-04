import java.util.ArrayList;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args)
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>(size);
            for (int i = 0; i<size; i++)
            {
                int n = in.nextInt();
                array.add(n);
            }
            int even_sum = 0;
            int odd_sum = 0;
            for (int j = 0; j<size; j++)
            {
                if (array.get(j) % 2 != 0)
                {
                    odd_sum = odd_sum + array.get(j);
                }
                if(array.get(j) % 2 == 0)
                {
                    even_sum = even_sum + array.get(j);
                }
            }
            System.out.println(odd_sum);
            System.out.println(even_sum);
        }
    }
}
