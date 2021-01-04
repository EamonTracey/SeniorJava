import java.util.Scanner;

public class HWBinary {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a 4-digit binary number: ");
        String binary = keyboard.next();

        int decimal = 8 * Character.getNumericValue(binary.charAt(0)) + 4 * Character.getNumericValue(binary.charAt(1)) + 2 * Character.getNumericValue(binary.charAt(2)) + 1 * Character.getNumericValue(binary.charAt(3));
        System.out.println(decimal);

        keyboard.close();

    }
}