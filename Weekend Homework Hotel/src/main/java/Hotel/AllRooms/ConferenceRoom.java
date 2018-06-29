package Hotel.AllRooms;

import java.util.ArrayList;

public class ConferenceRoom extends Room {
    
    private String name;

    public ConferenceRoom(RoomType roomType, ArrayList guests, String name){
        super(roomType.CONFERENCEROOM, guests);
        this.name = name;

    }

    public int getRoomCapacity() {
        return getRoomType().getCapacity();
    }

    public double getDailyRate() {
        return getRoomType().getDailyRate();
    }
}