/**
 * UseCase2RoomInitialization
 * Demonstrates room initialization using abstraction and inheritance.
 * Displays predefined room types and their availability.
 *
 * @author John
 * @version 2.0
 */

// Abstract class
abstract class Room {

    protected String roomType;
    protected int beds;
    protected double price;

    public Room(String roomType, int beds, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.price = price;
    }

    // method to display room details
    public void displayRoomDetails() {
        System.out.println("Room Type : " + roomType);
        System.out.println("Beds      : " + beds);
        System.out.println("Price     : ₹" + price + " per night");
    }
}

// Single Room Class
class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 2000);
    }
}

// Double Room Class
class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 3500);
    }
}

// Suite Room Class
class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 6000);
    }
}

// Main Application Class
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     Book My Stay - Version 2.0  ");
        System.out.println("=================================");

        // Creating room objects (Polymorphism)
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability variables
        int singleAvailability = 10;
        int doubleAvailability = 7;
        int suiteAvailability = 3;

        System.out.println("\nSingle Room Details");
        single.displayRoomDetails();
        System.out.println("Available Rooms : " + singleAvailability);

        System.out.println("\nDouble Room Details");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms : " + doubleAvailability);

        System.out.println("\nSuite Room Details");
        suite.displayRoomDetails();
        System.out.println("Available Rooms : " + suiteAvailability);

        System.out.println("\nThank you for using Book My Stay!");
    }
}