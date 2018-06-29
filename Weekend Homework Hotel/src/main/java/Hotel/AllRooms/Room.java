package Hotel.AllRooms;

import java.util.ArrayList;
import Hotel.Guest.Guest;

public abstract class Room {

    private ArrayList <Guest> guests;
    private RoomType roomType;

    public Room(RoomType roomType, ArrayList<Guest> guests) {
        this.roomType = roomType;
        this.guests = guests;
    }
    

    public ArrayList getGuests() {
        return guests;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }
}