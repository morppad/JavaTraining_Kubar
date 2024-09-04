import java.util.Scanner;

public class Task11 {
    public static void main(String[] args)
    {
        while (true) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            int f = 1;
            for (int i = 1; i <= N; i++)
            {
                    f = f*i;
            }
            if (N>0) {
                System.out.println(f);
            }
            else {System.out.println("Введите число больше 0");}
        }
    }
}
