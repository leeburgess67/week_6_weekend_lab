package Hotel.AllRooms;

import Hotel.Guest.Guest;
import Hotel.AllRooms.RoomType;

import java.util.ArrayList;

public class Bedroom extends Room {

    public Bedroom(RoomType roomType, ArrayList <Guest> guests){
        super(roomType, guests);
    }

    public int getRoomCapacity(){
        return getRoomType().getCapacity();
    }

    public void checkInBedroom(Guest guest){
        if (this.getGuests().size() == 0) {
            getGuests().add(guest);
        }
        else {
        }


    }

}
