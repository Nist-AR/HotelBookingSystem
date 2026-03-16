public class SuiteRoom extends Room {
    public SuiteRoom(int roomNumber, double price) {
        super(roomNumber, price);
    }
    @Override
    public String getRoomType() { return "Luxury Suite"; }
}