import java.util.Scanner;

public class NumberAboveAverage {

    public static void main(String[] args) {

        double[] temperatures = new double[10];
        int higher = 0;
        double temperature;
        double average;

        System.out.print("Please input 10 temperatures: ");

        Scanner keyboard = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Temperature " + i + ": ");
            temperature = keyboard.nextDouble();
            temperatures[i - 1] = temperature;
        }
        keyboard.close();

        int sum = 0;
        for (double t: temperatures) {
            sum += t;
        }
        average = sum / 10;

        for (double t: temperatures) {
            if (t > average) higher += 1;
        }

        System.out.println("The average temperature is " + average + ".");
        System.out.println("The temperature was higher than average on " + higher + " days.");

    }

}

/*
temps = [float(input(f"Temperature {i}: ")) for i in range(1, 11)]
average = sum(temps) / len(temps)
higher = sum(1 for temp in temps if temp > average)
print(f"The average temperature is {average}.")
print(f"The temperature was higher than average on {higher} days.")
*/
