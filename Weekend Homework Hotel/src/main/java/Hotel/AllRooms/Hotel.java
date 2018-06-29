package Hotel.AllRooms;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> bedrooms;
    private ArrayList<Room> diningRooms;
    private ArrayList<Room> conferenceRooms;

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
}
