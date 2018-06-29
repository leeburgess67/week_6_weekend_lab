import Hotel.AllRooms.*;
import org.junit.Before;

import java.util.ArrayList;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    DiningRoom diningRoom1;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ArrayList<Room> bedrooms;
    ArrayList<Room> diningRooms;
    ArrayList<Room> conferenceRooms;



    @Before
    public void before(){
     bedrooms = new ArrayList<>();
     diningRooms = new ArrayList<>();
     conferenceRooms = new ArrayList<>();

     bedrooms.add(bedroom1);
     bedrooms.add(bedroom2);
     diningRooms.add(diningRoom1);
     conferenceRooms.add(conferenceRoom1);
     conferenceRooms.add(conferenceRoom2);

     hotel = new Hotel(bedrooms, diningRooms, conferenceRooms);
    }


}
