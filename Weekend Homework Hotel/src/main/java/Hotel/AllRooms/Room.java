package Hotel.AllRooms;

import java.util.ArrayList;
import Hotel.Guest.Guest;

public abstract class Room {

    private int capacity;
    private ArrayList <Guest> guests;

    public Room(int capacity, ArrayList<Guest> guests) {
        this.capacity = capacity;
        this.guests = guests;
    }
    

    public int getCapacity() {
        return capacity;
    }

    public ArrayList getGuests() {
        return guests;
    }
}