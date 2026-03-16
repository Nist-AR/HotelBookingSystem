public class BookingService {
    private int counter = 100;

    public void processBooking(Reservation res, RoomInventory inv, RoomAllocator alloc) {
        String type = res.getRoomType();

        if (inv.getAvailability(type) > 0) {
            String roomId = alloc.allocateRoom(type, ++counter);

            if (roomId != null) {
                inv.updateAvailability(type, -1);
                System.out.println("Success: " + res.getGuestName() + " assigned " + roomId);
            } else {
                System.out.println("Failure: ID collision for " + res.getGuestName());
            }
        } else {
            System.out.println("Failure: " + type + " is sold out for " + res.getGuestName());
        }
    }
}