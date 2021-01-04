import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double volume, radius, height, cost;
        char ans;

        do {
            System.out.print("Volume: ");
            volume = keyboard.nextDouble();
            System.out.print("Radius: ");
            radius = keyboard.nextDouble();
            height = volume / (Math.PI * radius * radius);
            cost = 2 * Math.PI * radius * (radius + height);
            System.out.println("Height is " + height);
            System.out.println("Cost is $" + cost);
            System.out.print("\nWould you like to continue (y/n)? ");
            ans = keyboard.next().charAt(0);
        } while (ans == 'y');

        keyboard.close();

    }
}