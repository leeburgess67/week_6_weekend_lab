package Hotel.AllRooms;

import Hotel.Guest.Guest;
import Hotel.AllRooms.*;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> bedrooms;
    private ArrayList<Room> diningRooms;
    private ArrayList<Room> conferenceRooms;
    private Bedroom foundBedroom;


    public Hotel(ArrayList<Room> bedrooms, ArrayList<Room> diningRooms, ArrayList<Room> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }


    public ArrayList<Room> getBedrooms() {
        return this.bedrooms;
    }

    public ArrayList<Room> getConferenceRooms() {
        return this.conferenceRooms;
    }

    public ArrayList<Room> getDiningRooms() {
        return this.diningRooms;
    }

    public Bedroom findBedroom(RoomType requestedRoomType) {
        Bedroom foundBedroom = null;
        for (Room bedroom : bedrooms)
            if (requestedRoomType == bedroom.getRoomType()) {
                foundBedroom = (Bedroom) bedroom;
            }

        return foundBedroom;
    }

    publ


    public void checkIn(RoomType requestedRoomType, Guest guest) {
        Bedroom foundBedroom = findBedroom(requestedRoomType);
        foundBedroom.getGuests().add(guest);

    }
}



