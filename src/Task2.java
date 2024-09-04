import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)
    {
        while (true) {
            Scanner in = new Scanner(System.in);
            int number1 = in.nextInt();
            int number2 = in.nextInt();
            int number3 = in.nextInt();
            int[] arr = {number1, number2, number3};
            int a = Arrays.stream(arr).min().getAsInt();
            System.out.println(a);
        }
    }
}
