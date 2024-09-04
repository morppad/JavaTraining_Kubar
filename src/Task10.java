import java.util.Scanner;

public class Task10 {
    public static void main(String[] args)
    {
        while (true) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            String n = String.valueOf(N);
            if (N>=0)
            {
                System.out.println(n.length());
            }
            else
            {
                System.out.println(n.length()-1);

            }

        }
    }
}
