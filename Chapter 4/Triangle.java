import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int size;

        System.out.print("Enter a number 1-50: ");
        size = keyboard.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        keyboard.close();

    }
}