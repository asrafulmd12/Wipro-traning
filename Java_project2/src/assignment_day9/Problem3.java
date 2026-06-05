package assignment_day9;
class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    // Synchronized deposit
    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " depositing: " + amount);
        balance += amount;
        System.out.println("Updated Balance after deposit: " + balance);
    }

    // Synchronized withdraw
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting withdrawal: " + amount);

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }

    public int getBalance() {
        return balance;
    }
}

// Main class
public class Problem3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Deposit task
        Runnable depositTask = () -> {
            for (int i = 0; i < 3; i++) {
                account.deposit(500);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        };

        // Withdraw task
        Runnable withdrawTask = () -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(400);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        };

        // Multiple threads
        Thread t1 = new Thread(depositTask, "User-1");
        Thread t2 = new Thread(withdrawTask, "User-2");
        Thread t3 = new Thread(withdrawTask, "User-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
