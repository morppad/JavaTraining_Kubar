import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();

            int originalNumber = number;
            int numberOfDigits = (int) Math.log10(number) + 1;
            int sum = 0;

            while (number > 0) {
                int digit = number % 10;
                sum += (int) Math.pow(digit, numberOfDigits);
                number /= 10;
            }

            if (sum == originalNumber) {
                System.out.println(originalNumber + " - число Армстронга");
            } else {
                System.out.println(originalNumber + " - не число Армстронга");
            }
        }
    }
}