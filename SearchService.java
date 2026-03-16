import java.util.List;

public class SearchService {
    public void searchAvailableRooms(List<Room> rooms, RoomInventory inventory) {
        System.out.println("--- Search Results: Available Rooms ---");
        boolean found = false;

        for (Room room : rooms) {
            String type = room.getRoomType();
            int count = inventory.getAvailability(type);

            if (count > 0) {
                System.out.println(room + " | Units Available: " + count);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No rooms currently available.");
        }
    }
}