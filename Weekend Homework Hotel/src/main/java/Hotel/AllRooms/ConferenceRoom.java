package Hotel.AllRooms;

import java.util.ArrayList;

public class ConferenceRoom extends Room {
    
    private String name;

    public ConferenceRoom(RoomType roomType, ArrayList guests, String name){
        super(roomType, guests);
        this.name = name;

    }
}