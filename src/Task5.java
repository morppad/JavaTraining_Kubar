import java.util.ArrayList;
import java.util.Scanner;

public class Task5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (true) {
            int N = in.nextInt();
            ArrayList<Object> arr = new ArrayList<>();
            arr.add(0);
            arr.add(1);
            for (int i = 2; i<=N; i++)
            {
                int n1 = (int) arr.get((int) (i - 1));
                int n2 = (int) arr.get((int) (i-2));
                arr.add(n1+n2);

            }
            System.out.println(arr);
        }
    }
}
