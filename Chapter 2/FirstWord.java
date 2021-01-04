import java.util.Scanner;

public class FirstWord {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a line of text.");
        String line = keyboard.nextLine();

        String firstWord = line.split(" ")[0];
        line = line.replaceFirst(firstWord, "").trim() + " " + firstWord;
        line = line.substring(0, 1).toUpperCase() + line.substring(1);

        System.out.println("I have rephrased that line to read:");
        System.out.println(line);

        keyboard.close();

    }
}