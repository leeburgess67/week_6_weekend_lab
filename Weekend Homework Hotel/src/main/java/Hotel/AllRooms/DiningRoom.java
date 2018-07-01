package Hotel.AllRooms;

import java.util.ArrayList;

public class DiningRoom extends Room {
    
    public DiningRoom(RoomType roomType, ArrayList guests, String name){
        super(RoomType.DININGROOM, guests);
    }

    public int getRoomCapacity() {
        return getRoomType().getCapacity();
    }
}

