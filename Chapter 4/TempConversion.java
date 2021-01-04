import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {

        boolean err = false;
        char query = '.';
        double temp;
        String type;

        Scanner keyboard = new Scanner(System.in);

        while (!(query == 'Q' || query == 'q')) {
            System.out.print("Enter temperature: ");
            temp = keyboard.nextDouble();
            System.out.print("Input F/f if temperature is Fahrenheit. Input C/c if temperature is Celsius: ");
            err = true;
            while (err) {
                type = keyboard.next();
                if (type.equalsIgnoreCase("f")) {
                    temp = 5 * (temp - 32) / 9;
                    System.out.println("The temperature in Celsius is " + temp + "°");
                    err = false;
                } else if (type.equalsIgnoreCase("c")) {
                    temp = 9 * temp / 5 + 32;
                    System.out.println("The temperature in Fahrenheit is " + temp + "°");
                    err = false;
                } else {
                    System.out.print("Error. You must input F/f if temperature is Fahrenheit or C/c if temperature is Celsius: ");
                }
            }
            System.out.print("Press Q/q to quit or any key to continue: ");
            query = keyboard.next().charAt(0);
        }

        keyboard.close();

    }
}