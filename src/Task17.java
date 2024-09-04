import java.util.ArrayList;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        while (true)
        {
            Scanner in = new Scanner(System.in);
            int A = in.nextInt();
            int B = in.nextInt();
            ArrayList<Integer> primes = new ArrayList<Integer>();
            for (int j = A; j <= B; j++)
            {
                int N = j;
                int count = 0;
                for (int i = N; i > 0; i--) {
                    if (N % i == 0) {
                        count++;
                    }
                }
                if (count <= 2) {
                    primes.add(N);
                }
            }
            System.out.println(primes);
        }
    }
}
