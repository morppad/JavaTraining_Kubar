import java.util.Scanner;

public class Task6
{

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            int count = 0;
            for (int i = N; i > 0; i--) {
                if (N % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Вы ввели простое число");
            } else {
                System.out.println("Введенное число не является простым");
            }
        }
    }
}
