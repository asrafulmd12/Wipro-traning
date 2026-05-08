package assignment_day9;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Order class (task)
class Order implements Runnable {
    private final int orderId;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void run() {
        try {
            System.out.println("Processing Order " + orderId + " by " + Thread.currentThread().getName());
            
            // Simulate delivery time
            Thread.sleep((long) (Math.random() * 3000));
            
            System.out.println("Completed Order " + orderId + " by " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Order " + orderId + " was interrupted");
        }
    }
}

// Main system
public class Problem4 {
    public static void main(String[] args) {
        int numberOfAgents = 3; // limited delivery agents

        // Thread pool representing delivery agents
        ExecutorService agentPool = Executors.newFixedThreadPool(numberOfAgents);

        // Simulate incoming orders
        for (int i = 1; i <= 10; i++) {
            System.out.println("New Order Received: " + i);
            agentPool.submit(new Order(i));
        }

        // Shutdown pool after all tasks submitted
        agentPool.shutdown();

        try {
            // Wait for all tasks to complete
            if (!agentPool.awaitTermination(60, TimeUnit.SECONDS)) {
                agentPool.shutdownNow();
            }
        } catch (InterruptedException e) {
            agentPool.shutdownNow();
        }

        System.out.println("All orders processed!");
    }
}
