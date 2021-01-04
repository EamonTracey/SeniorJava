import java.util.Scanner;

public class LoveHate {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a line of text.");
        String line = keyboard.nextLine();
        System.out.println("I have rephrased that line to read:");
        System.out.println(line.replaceFirst("hate", "love"));

        keyboard.close();

    }
}