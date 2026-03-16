import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RoomInventory inventory = new RoomInventory();
        inventory.initializeRoomType("Single", 2);

        RoomAllocator allocator = new RoomAllocator(Map.of("Single", 2));
        BookingQueue queue = new BookingQueue();

        queue.addRequest(new Reservation("Alice", "Single"));
        queue.addRequest(new Reservation("Bob", "Single"));
        queue.addRequest(new Reservation("Charlie", "Single"));

        BookingService service = new BookingService();

        while (queue.hasRequests()) {
            service.processBooking(queue.processNext(), inventory, allocator);
        }
    }
}