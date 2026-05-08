package assignment_day8;
import java.util.*;

public class Problem2 {

    public static void main(String[] args) {

        // Product-Price Map
        HashMap<String, Integer> priceMap = new HashMap<>();
        priceMap.put("Apple", 30);
        priceMap.put("Banana", 10);
        priceMap.put("Orange", 20);

        // Cart (List)
        ArrayList<String> cart = new ArrayList<>();

        // Add items
        addToCart(cart, "Apple");
        addToCart(cart, "Banana");
        addToCart(cart, "Apple");

        // Display cart
        System.out.println("Cart Items: " + cart);

        // Calculate total
        int total = calculateTotal(cart, priceMap);
        System.out.println("Total Price: " + total);

        // Remove item
        removeFromCart(cart, "Banana");
        System.out.println("After Removal: " + cart);

        // Show quantities
        showBill(cart, priceMap);
    }

    // Add item
    public static void addToCart(ArrayList<String> cart, String product) {
        cart.add(product);
    }

    // Remove item
    public static void removeFromCart(ArrayList<String> cart, String product) {
        if (cart.contains(product)) {
            cart.remove(product);
        }
    }

    // Calculate total price
    public static int calculateTotal(ArrayList<String> cart, HashMap<String, Integer> priceMap) {
        int total = 0;
        for (String item : cart) {
            total += priceMap.getOrDefault(item, 0);
        }
        return total;
    }

    // Show bill with quantity
    public static void showBill(ArrayList<String> cart, HashMap<String, Integer> priceMap) {

        HashMap<String, Integer> quantityMap = new HashMap<>();

        // Count quantities
        for (String item : cart) {
            quantityMap.put(item, quantityMap.getOrDefault(item, 0) + 1);
        }

        System.out.println("\nBill Details:");
        int total = 0;

        for (String item : quantityMap.keySet()) {
            int qty = quantityMap.get(item);
            int price = priceMap.getOrDefault(item, 0);
            int cost = qty * price;

            System.out.println(item + " x " + qty + " = " + cost);
            total += cost;
        }

        System.out.println("Final Total: " + total);
    }
}
