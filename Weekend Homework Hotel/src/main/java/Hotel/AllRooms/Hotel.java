package Hotel.AllRooms;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> bedrooms;
    private ArrayList<Room> diningrooms;
    private ArrayList<Room> conferencerooms;

    public Hotel(ArrayList<Room> bedrooms, ArrayList<Room> diningRooms, ArrayList<Room> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferencerooms = conferenceRooms;
        this.diningrooms = diningRooms;
    }


    public ArrayList<Room> getBedrooms() {
        return this.bedrooms;
    }
}
