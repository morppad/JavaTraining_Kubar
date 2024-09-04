import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();

            String[] words = str.split(" ");

            StringBuilder reversedString = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                reversedString.append(words[i]).append(" ");
            }

            System.out.println(reversedString.toString().trim());
        }
    }
}