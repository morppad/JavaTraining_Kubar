import java.util.Scanner;

public class Task7
{

    public static void main(String[] args) {
        while (true)
        {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            int count = 0;
            for (int i = N-1; i >= 1; i--) {
                System.out.println(i);
            }
        }
    }
}