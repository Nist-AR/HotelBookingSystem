public abstract class Room {
    private int roomNumber;
    private double price;

    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public int getRoomNumber() { return roomNumber; }
    public double getPrice() { return price; }

    public abstract String getRoomType();

    @Override
    public String toString() {
        return "Room #" + roomNumber + " [" + getRoomType() + "] - Price: $" + price;
    }
}