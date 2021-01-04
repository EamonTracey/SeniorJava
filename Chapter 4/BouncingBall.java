import java.util.Scanner;

public class BouncingBall {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int count = 0;

        System.out.print("Enter the initial velocity of the ball: " );
        double velocity = keyboard.nextInt();
        double height = 0;

        for (int i = 0; i < 4; i++) {
            while (height >= 0) {
                count++;
                System.out.println("Time " + count + " height: " + height);
                height += velocity;
                velocity -= 32;
            }
            System.out.println("Bounce!");
            height *= -0.5;
            velocity *= -0.5;
        }

        keyboard.close();

    }
}