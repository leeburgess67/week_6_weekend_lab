import Hotel.AllRooms.Bedroom;
import Hotel.AllRooms.RoomType;
import Hotel.Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static Hotel.AllRooms.RoomType.DOUBLE;
import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        guests = new ArrayList<>();
        guests.add(guest1);
        bedroom = new Bedroom(RoomType.DOUBLE, guests);
    }


    @Test
    public void hasGuests(){
        assertEquals(guests, bedroom.getGuests());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getRoomCapacity());
    }




}
