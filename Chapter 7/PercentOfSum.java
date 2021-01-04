import java.util.Scanner;

public class PercentOfSum {

    public static void main(String[] args) {
    
        int quant;
        int integer;
        int sum;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        quant = keyboard.nextInt();
        int[] integers = new int[quant];
        System.out.println("Enter " + quant + " integers, one per line:");
        for (int i = 0; i < integers.length; i++) {
            integer = keyboard.nextInt();
            integers[i] = integer;
        }
        keyboard.close();

        sum = sumOfIntsInArray(integers);

        System.out.println("The sum is " + sum + ".");
        System.out.println("The numbers are:");
        for (int n: integers) {
            System.out.println(n + ", which is " + ((double)n / (double)sum * 100) + "% of the sum.");
        }



    }

    private static int sumOfIntsInArray(int[] numbers) {
        int sum = 0;
        for (int n: numbers) {
            sum += n;
        }
        return sum;
    }

}