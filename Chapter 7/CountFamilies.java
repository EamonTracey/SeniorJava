import java.util.Scanner;

public class CountFamilies {

    public static void main(String[] args) {

        int nfamilies;
        double income;
        int less = 0;
        double max;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many families are there?: ");
        nfamilies = keyboard.nextInt();

        double[] incomes = new double[nfamilies];
        double[] incomes_less = new double[nfamilies];

        for (int i = 0; i < incomes.length; i++) {
            System.out.print("Family " + (i + 1) + " income: ");
            income = keyboard.nextDouble();
            incomes[i] = income;
        }
        keyboard.close();

        max = incomes[0];
        for (double inc: incomes) {
            max = inc > max ? inc : max;
        }

        for (double inc: incomes) {
            if (inc < max * .1) {
                incomes_less[less] = inc;
                less += 1;
            }
        }

        System.out.println("The maximum income is $" + max + ".");
        System.out.println(less + " families makes less than 10% of the maximum income.");
        System.out.println("These families incomes are: ");
        for (int i = 0; i < less; i++) {
            System.out.println("$" + incomes_less[i]);
        }

    }

}