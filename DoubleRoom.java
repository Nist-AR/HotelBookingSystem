public class DoubleRoom extends Room {
    public DoubleRoom(int roomNumber, double price) {
        super(roomNumber, price);
    }
    @Override
    public String getRoomType() { return "Double Room"; }
}