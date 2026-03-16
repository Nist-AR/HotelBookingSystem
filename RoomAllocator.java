import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RoomAllocator {
    private Map<String, Set<String>> allocatedRooms = new HashMap<>();

    public RoomAllocator(Map<String, Integer> roomCapacity) {
        for (String type : roomCapacity.keySet()) {
            allocatedRooms.put(type, new HashSet<>());
        }
    }

    public String allocateRoom(String type, int sequence) {
        String roomId = type.replaceAll("\\s+", "") + "-" + sequence;

        if (allocatedRooms.get(type).contains(roomId)) {
            return null;
        }

        allocatedRooms.get(type).add(roomId);
        return roomId;
    }
}