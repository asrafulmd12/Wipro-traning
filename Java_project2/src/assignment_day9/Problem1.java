package assignment_day9;
class AlternatePrinting {
    private int number = 1;
    private final int MAX = 100;

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                try {
                    wait(); // wait if it's not odd's turn
                } catch (InterruptedException e) {
                    System.out.println("Interrupted Exception Occurs");
                }
            } else {
                System.out.println("Odd: " + number);
                number++;
                notify(); // wake up even thread
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 != 0) {
                try {
                    wait(); // wait if it's not even's turn
                } catch (InterruptedException e) {
                	 System.out.println("Interrupted Exception Occurs");
                }
            } else {
                System.out.println("Even: " + number);
                number++;
                notify(); // wake up odd thread
            }
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        AlternatePrinting obj = new AlternatePrinting();

        Thread t1 = new Thread(() -> obj.printOdd());
        Thread t2 = new Thread(() -> obj.printEven());

        t1.start();
        t2.start();
    }
}