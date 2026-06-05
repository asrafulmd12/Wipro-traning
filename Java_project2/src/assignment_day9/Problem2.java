package assignment_day9;
class PrintABC {
    private int state = 0; // 0 -> A, 1 -> B, 2 -> C
    private final int TIMES = 10; // how many times to repeat ABC

    public synchronized void printA() {
        for (int i = 0; i < TIMES; i++) {
            while (state != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("A ");
            state = 1;
            notifyAll();
        }
    }

    public synchronized void printB() {
        for (int i = 0; i < TIMES; i++) {
            while (state != 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("B ");
            state = 2;
            notifyAll();
        }
    }

    public synchronized void printC() {
        for (int i = 0; i < TIMES; i++) {
            while (state != 2) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("C ");
            state = 0;
            notifyAll();
        }
    }
}

public class Problem2 {
    public static void main(String[] args) {
        PrintABC obj = new PrintABC();

        Thread t1 = new Thread(() -> obj.printA());
        Thread t2 = new Thread(() -> obj.printB());
        Thread t3 = new Thread(() -> obj.printC());

        t1.start();
        t2.start();
        t3.start();
    }
}