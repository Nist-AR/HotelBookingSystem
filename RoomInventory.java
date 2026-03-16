import java.util.HashMap;
import java.util.Map;

public class RoomInventory {
    private Map<String, Integer> availability;

    public RoomInventory() {
        this.availability = new HashMap<>();
    }

    public void initializeRoomType(String type, int count) {
        availability.put(type, count);
    }

    public int getAvailability(String type) {
        return availability.getOrDefault(type, 0);
    }

    public void updateAvailability(String type, int change) {
        if (availability.containsKey(type)) {
            int currentCount = availability.get(type);
            int newCount = currentCount + change;
            if (newCount >= 0) {
                availability.put(type, newCount);
            } else {
                System.out.println("Error: Insufficient inventory for " + type);
            }
        } else {
            System.out.println("Error: Room type " + type + " not found.");
        }
    }

    public void displayInventory() {
        System.out.println("--- Current Room Inventory ---");
        for (Map.Entry<String, Integer> entry : availability.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " available");
        }
    }
}