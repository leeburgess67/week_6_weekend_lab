package Hotel.AllRooms;

import java.util.ArrayList;

public class ConferenceRoom extends Room {
    
    private String name;

    public ConferenceRoom(int capacity, ArrayList guests, double dailyRate, String name){
        super(capacity, guests);
        this.name = name;

    }
}