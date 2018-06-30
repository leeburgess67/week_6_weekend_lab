import Hotel.AllRooms.Bedroom;
import Hotel.AllRooms.Room;
import Hotel.AllRooms.RoomType;
import Hotel.Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static Hotel.AllRooms.RoomType.DOUBLE;
import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Bedroom fullbedroom;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        guest1 = new Guest("Mr Smith");
        guest2 = new Guest("Mrs Jones");
        guests = new ArrayList<>();
        guests.add(guest1);
        bedroom = new Bedroom(RoomType.DOUBLE, guests);
        fullbedroom = new Bedroom(RoomType.SINGLE, guests);

    }


    @Test
    public void hasGuests(){
        assertEquals(guests, bedroom.getGuests());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getRoomCapacity());
    }

    @Test
    public void hasRoomType(){
        assertEquals(DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canCheckIn(){
        bedroom.checkInBedroom(guest1);
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void cantCheckIn(){
        fullbedroom.checkInBedroom(guest2);
        assertEquals(1, fullbedroom.getGuests().size());

    }







}
