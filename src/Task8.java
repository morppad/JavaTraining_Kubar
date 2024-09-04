import java.util.Scanner;
public class Task8
{
    public static void main(String[] args) {
        while (true)
        {
            Scanner in = new Scanner(System.in);
            int A = in.nextInt();
            int B = in.nextInt();
            int sum = 0;
            for (int i = A; i <= B; i++) {
                if (i%2==0){
                    sum = sum+i;
                }
            }
            System.out.println(sum);
        }
    }
}
