

import java.util.HashMap;

// Abstract Room class
abstract class Room {

    protected String type;
    protected double price;

    public Room(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Room Type : " + type);
        System.out.println("Price     : ₹" + price + " per night");
    }
}

// Room Types
class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 2000);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 3500);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 6000);
    }
}

// Inventory Class (read-only access here)
class RoomInventory {

    private HashMap<String, Integer> inventory;

    public RoomInventory() {
        inventory = new HashMap<>();
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 0);   // Example unavailable room
        inventory.put("Suite Room", 2);
    }

    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }
}

// Main Class
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      Book My Stay - v4.0        ");
        System.out.println("      Available Room Search      ");
        System.out.println("=================================");

        // Inventory instance
        RoomInventory inventory = new RoomInventory();

        // Room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Search and display available rooms

        if (inventory.getAvailability("Single Room") > 0) {
            single.displayDetails();
            System.out.println("Available Rooms : " + inventory.getAvailability("Single Room"));
            System.out.println();
        }

        if (inventory.getAvailability("Double Room") > 0) {
            doubleRoom.displayDetails();
            System.out.println("Available Rooms : " + inventory.getAvailability("Double Room"));
            System.out.println();
        }

        if (inventory.getAvailability("Suite Room") > 0) {
            suite.displayDetails();
            System.out.println("Available Rooms : " + inventory.getAvailability("Suite Room"));
            System.out.println();
        }

        System.out.println("Search completed. No inventory changes were made.");
    }
}