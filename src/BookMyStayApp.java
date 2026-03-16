/**
 * UseCase3InventorySetup
 * Demonstrates centralized room inventory management using HashMap.
 * The inventory stores room availability and allows controlled access.
 *
 * @author John
 * @version 3.0
 */

import java.util.HashMap;
import java.util.Map;

// Inventory class that manages room availability
class RoomInventory {

    // HashMap storing room type and available count
    private HashMap<String, Integer> inventory;

    // Constructor initializes the inventory
    public RoomInventory() {
        inventory = new HashMap<>();

        inventory.put("Single Room", 10);
        inventory.put("Double Room", 7);
        inventory.put("Suite Room", 3);
    }

    // Method to display current availability
    public void displayInventory() {
        System.out.println("\nCurrent Room Inventory:");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " rooms available");
        }
    }

    // Method to get availability of a specific room
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // Method to update availability
    public void updateAvailability(String roomType, int newCount) {
        inventory.put(roomType, newCount);
    }
}

// Main Application Class
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("    Book My Stay - Version 3.0   ");
        System.out.println("=================================");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display current inventory
        inventory.displayInventory();

        // Example availability check
        System.out.println("\nChecking availability for Single Room:");
        System.out.println("Available: " + inventory.getAvailability("Single Room"));

        // Example update
        System.out.println("\nUpdating availability after booking...");
        inventory.updateAvailability("Single Room", 9);

        // Display updated inventory
        inventory.displayInventory();

        System.out.println("\nInventory management completed.");
    }
}