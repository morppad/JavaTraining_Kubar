import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        while (true)
        {
            Scanner in = new Scanner(System.in);
            int N = in. nextInt();
            String n = String.valueOf(N);
            char[] array = n.toCharArray();
            int sum = 0;
            if (N>=0)
            {
                for (int i=0; i<array.length; i++){
                    int current_num = (int) array[i] - 48;
                    sum = sum + current_num;
                }
                System.out.println(sum);
            }
            else
            {
                for (int i=1; i<array.length; i++){
                    int current_num = (int) array[i] - 48;
                    sum = sum + current_num;
                }
                System.out.println(sum);
            }
        }
    }
}
