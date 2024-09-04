import java.util.ArrayList;
import java.util.Scanner;

public class Task15
{
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
            int sum = 0;
            for (int j = 0; j<size; j++)
            {
                sum = sum + array.get(j);
            }
            System.out.println(sum);
        }
    }
}