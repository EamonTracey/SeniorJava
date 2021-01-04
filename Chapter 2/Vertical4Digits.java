import java.util.Scanner;

public class Vertical4Digits {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a 4-Digit Integer: ");
        int number = keyboard.nextInt();

        System.out.println(number / 1000 % 10);
        System.out.println(number / 100 % 10);
        System.out.println(number / 10 % 10);
        System.out.println(number % 10);

        keyboard.close();

    }
}