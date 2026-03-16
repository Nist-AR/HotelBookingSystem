public class SingleRoom extends Room {
    public SingleRoom(int roomNumber, double price) {
        super(roomNumber, price);
    }
    @Override
    public String getRoomType() { return "Single Room"; }
}