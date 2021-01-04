import java.util.Arrays;
import java.util.Scanner;

public class FlowerCounter {

    public static void main(String[] args) {

        String[] flowers = new String[] { "petunia", "pansy", "rose", "violet", "carnation" };
        double[] prices = new double[] { .5, .75, 1.5, .5, .8 };
        String flower;
        int quantity;
        double price;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to my flower shop. Our flowers include petunia, pansy, rose, violet, and carnation.");
        System.out.print("Please choose a flower: ");
        flower = keyboard.next();
        System.out.print("How many flowers would you like?: ");
        quantity = keyboard.nextInt();
        keyboard.close();

        price = prices[Arrays.asList(flowers).indexOf(flower)];

        System.out.println("The total cost is $" + price * quantity + ".");

    }

}