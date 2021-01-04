import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProfaneFilter {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = keyboard.nextLine().toLowerCase();

        List<String> words = Arrays.asList(str.split("\\W+"));

        if (words.contains("cat") || words.contains("dog") || words.contains("llama")) {
            System.out.println("Profane!");
        } else {
            System.out.println("Not profane!");
        }

        keyboard.close();

    }
}