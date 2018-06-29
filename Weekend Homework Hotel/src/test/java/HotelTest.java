import Hotel.AllRooms.*;
import Hotel.Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static Hotel.AllRooms.RoomType.DOUBLE;
import static org.junit.Assert.assertEquals;

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
    Guest guest1;
    Guest guest2;
    Guest guest3;
    ArrayList guests;



    @Before
    public void before(){
     bedrooms = new ArrayList<>();
     diningRooms = new ArrayList<>();
     conferenceRooms = new ArrayList<>();
     guests = new ArrayList<Guest>();

     bedrooms.add(bedroom1);
     bedrooms.add(bedroom2);
     diningRooms.add(diningRoom1);
     conferenceRooms.add(conferenceRoom1);
     conferenceRooms.add(conferenceRoom2);

     bedroom1 = new Bedroom(DOUBLE, guests );
     hotel = new Hotel(bedrooms, diningRooms, conferenceRooms);
    }

    @Test
    public void hasBedrooms(){
        assertEquals(bedrooms, hotel.getBedrooms());
    }
  @Test
    public void hasConferenceRooms(){
        assertEquals(conferenceRooms, hotel.getConferenceRooms());
    }
  @Test
    public void hasDiningRooms(){
        assertEquals(diningRooms, hotel.getDiningRooms());
    }

    @Test
    public void canCheckIn(){
        hotel.checkIn(DOUBLE, guest1);
        assertEquals(1, bedroom1.getGuests().size());
    }

    @Test
    public void canFindBedroom(){
        assertEquals(bedroom1, hotel.findBedroom(RoomType.DOUBLE));
    }

}
