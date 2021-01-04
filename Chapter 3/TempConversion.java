import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {

        double degrees;
        String query;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter degrees: ");
        degrees = keyboard.nextDouble();

        System.out.print("Convert from Celsius or Farenheit? (c/f): ");
        query = keyboard.next();

        if (query.equalsIgnoreCase("f")) {
            System.out.println(5 * (degrees - 32) / 9 + " °C");
        } else if (query.equalsIgnoreCase("c")) {
            System.out.println(9 * degrees / 5 + 32 + " °F");
        } else {
            System.out.println("Invalid input. Must be either 'c' or 'f'");
        }

        keyboard.close();

    }
}