import java.util.Arrays;
import java.util.Scanner;

public class MiddleString {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = keyboard.next();
        System.out.print("Enter a string: ");
        String str2 = keyboard.next();
        System.out.print("Enter a string: ");
        String str3 = keyboard.next();

        String strs[] = new String[] {str1, str2, str3};
        Arrays.sort(strs);

        System.out.println(strs[1]);

        keyboard.close();

    }
}