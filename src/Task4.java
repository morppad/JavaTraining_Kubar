import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (true) {
            int N = in.nextInt();
            int sum = 0;
            if (N >= 0)
            {
                for (int i = 1; i <= N; i++)
                {
                    sum = sum + i;
                }
                System.out.println(sum);
            }
            else
            {
                System.out.println("Введите число больше 0");
            }
        }
    }
}
