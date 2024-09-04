import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task14
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
            System.out.println(array.stream().max(Integer::compare).get());
        }
    }
}