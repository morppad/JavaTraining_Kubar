import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число:");
            int number = in.nextInt();
            if (number % 2 == 0) {
                System.out.println("Вы ввели четное число");
            }
            else
            {
                System.out.println("Вы ввели нечетное число");
            }
        }
    }
}