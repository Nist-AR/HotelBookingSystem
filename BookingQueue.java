import java.util.LinkedList;
import java.util.Queue;

public class BookingQueue {
    private Queue<Reservation> queue;

    public BookingQueue() {
        this.queue = new LinkedList<>();
    }

    public void addRequest(Reservation reservation) {
        queue.add(reservation);
    }

    public boolean hasRequests() {
        return !queue.isEmpty();
    }

    public Reservation processNext() {
        return queue.poll();
    }
}