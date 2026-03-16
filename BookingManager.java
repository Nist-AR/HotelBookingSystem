import java.util.HashMap;
import java.util.Map;

public class BookingManager {
    private Map<Integer, Room> inventory = new HashMap<>();

    public void addRoom(Room room) {
        inventory.put(room.getRoomNumber(), room);
    }

    public void bookRoom(int roomNumber) {
        Room room = inventory.get(roomNumber);

        if (room != null && !room.isOccupied()) {
            room.setOccupied(true);
            System.out.println("Success: Room " + roomNumber + " booked.");
        } else if (room != null && room.isOccupied()) {
            System.out.println("Error: Room " + roomNumber + " is already occupied.");
        } else {
            System.out.println("Error: Room " + roomNumber + " not found.");
        }
    }

    public void showInventory() {
        System.out.println("\n--- Inventory Status ---");
        for (Room r : inventory.values()) {
            System.out.println(r);
        }
    }
}