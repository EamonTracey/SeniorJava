import java.util.Scanner;

public class SillySentence {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Favorite color: ");
        String color = keyboard.next();
        System.out.print("Favorite food: ");
        String food = keyboard.next();
        System.out.print("Favorite animal: ");
        String animal = keyboard.next();
        System.out.print("First name of friend/relative: ");
        String relative = keyboard.next();

        System.out.println("I had a dream that " + relative + " ate a " + color + " " + animal);
        System.out.println("and said it tasted like " + food + "!");

        keyboard.close();

    }
}