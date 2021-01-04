import java.util.Scanner;

public class BMS {
    public static void main(String[] args) {

        int weight, height, age;
        String sex;
        double BMR = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Weight (pounds): ");
        weight = keyboard.nextInt();
        System.out.print("Height (inches): ");
        height = keyboard.nextInt();
        System.out.print("Age (years): ");
        age = keyboard.nextInt();
        System.out.print("Sex (m/f): ");
        sex = keyboard.next().toLowerCase();

        if (sex.equals("m")) {
            BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        } else if (sex.equals("f")) {
            BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        } else {
            System.out.println("Invalid sex. Must enter 'm' or 'f'");
            System.exit(1);
        }

        System.out.println("You should eat  " + BMR / 230 + " chocolate bars.");

        System.out.print("\n1) Sedentary\n2) Somewhat active (exercise occasionally)\n3) Active (exercise 3-4 days per weeak)\n4) Highly active (exercise daily)\nChoose the option that best describes you: ");
        int selection = keyboard.nextInt();
        if (selection > 4 || selection < 1) {
            System.out.println("Invalid selection. Must enter '1', '2', '3', or '4'");
            System.exit(1);
        }
        Activity activity = Activity.values()[selection - 1];

        switch (activity) {
            case sedentary:
                BMR *= 1.2;
                break;
            case somehwat:
                BMR *= 1.3;
                break;
            case active:
                BMR *= 1.4;
                break;
            case highly:
                BMR *= 1.5;
                break;
        }

        System.out.println("You should eat  " + BMR / 230 + " chocolate bars.");

        keyboard.close();

    }

    public enum Activity {
        sedentary, somehwat, active, highly
    }
}