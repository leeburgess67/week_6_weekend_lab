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

    public boolean isRoomEmpty(Room room){
        if (room.getGuests().size() == 0) {return true;}
        else { return false;}
    }



    public void checkIn(RoomType requestedRoomType, Guest guest) {
        Bedroom foundBedroom = findBedroom(requestedRoomType);
        if (isRoomEmpty(foundBedroom) == true) {
        foundBedroom.getGuests().add(guest);} else { }

    }

    public void checkOutGuest(Guest departingGuest) {
        for (Room room : bedrooms)
            if (room.getGuests().contains(departingGuest))
            { room.getGuests().clear(); }
            else { }

        }

        public ArrayList getGuestsInRoom(Room targetRoom) {
            for (Room room : bedrooms)
                if (room == targetRoom) {
                    return targetRoom.getGuests();
                } else {

                }
                return null;
        }


    }




