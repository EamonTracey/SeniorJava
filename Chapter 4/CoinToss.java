import java.util.Scanner;

public class CoinToss {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int heads = 0, tails = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Heads or Tails (h/t)? ");
            char ans = keyboard.next().charAt(0);
            if (ans == 'h') {
                heads++;
            } else if (ans == 't') {
                tails++;
            } else {
                System.out.println("Wrong input. Terminating.");
                System.exit(1);
            }
        }

        System.out.println("Number of heads: " + heads);
        System.out.println("Number of tails: " + tails);
        System.out.println("Percent heads: " + heads / 8.);
        System.out.println("Percent tails: " + tails / 8.);

        keyboard.close();

    }
}