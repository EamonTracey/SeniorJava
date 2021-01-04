import java.util.Scanner;

public class Mortgage3 {

    public static final double INTEREST_RATE = 7.29 / 12;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Outstanding Balance: ");
        double balance = keyboard.nextDouble();

        double monthlyPayment = balance / 12;
        double interest = monthlyPayment * (INTEREST_RATE / 100);
        double monthlyInterest = interest * 12;
        double monthlyTotal = monthlyPayment + interest;
        double principal = balance + monthlyInterest;

        System.out.println();
        System.out.println("Monthly Payment: " + monthlyTotal);
        System.out.println("Total Interest Paid: " + monthlyInterest);
        System.out.println("Total Back Payment: " + principal);

        keyboard.close();

    }
}