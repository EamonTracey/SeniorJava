import java.util.Arrays;
import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num1, num2, num3;
        
        System.out.print("Enter a nonnegative integer: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter a nonnegative integer: ");
        num2 = keyboard.nextInt();
        System.out.print("Enter a nonnegative integer: ");
        num3 = keyboard.nextInt();

        int nums[] = new int[] {num1, num2, num3};
        Arrays.sort(nums);

        for (int num: nums) {
            System.out.println(num);
        }

        keyboard.close();

    }
}