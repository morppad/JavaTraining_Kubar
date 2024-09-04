import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine().toLowerCase();

            int vowelsCount = 0;
            int consonantsCount = 0;
            String vowels = "аеёиоуыэюя";

            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch)) {
                    if (vowels.indexOf(ch) != -1) {
                        vowelsCount++;
                    } else {
                        consonantsCount++;
                    }
                }
            }

            System.out.println("Количество гласных: " + vowelsCount);
            System.out.println("Количество согласных: " + consonantsCount);
        }
    }
}