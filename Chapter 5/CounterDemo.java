public class CounterDemo {

    public static void main(String[] args) {

        Counter myAwesomeCounter = new Counter();
        myAwesomeCounter.displayCount();
        myAwesomeCounter.incrementCount();
        myAwesomeCounter.displayCount();
        myAwesomeCounter.decrementCount();
        myAwesomeCounter.decrementCount();
        for (int i = 0; i < 31; i++) {
            myAwesomeCounter.incrementCount();
        }
        myAwesomeCounter.displayCount();
        myAwesomeCounter.resetCountToZero();
        System.out.println("Since I reset my counter, the count equals " + myAwesomeCounter.getCount() + ".");

    }

}

public class Counter {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        count++;
    }

    public void decrementCount() {
        if (count > 0) {
            count--;
        } else {
            System.out.println("ERROR: Count cannot be negative.");
        }
    }

    public void resetCountToZero() {
        count = 0;
    }

    public void displayCount() {
        System.out.println("Current count is " + count + ".");
    }

}