import Hotel.AllRooms.Bedroom;
import Hotel.AllRooms.ConferenceRoom;
import Hotel.AllRooms.RoomType;
import Hotel.Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCEROOM, guests, "Conference Room 1");
    }


    @Test
    public void hasGuests(){
        assertEquals(guests, conferenceRoom.getGuests());
    }

    @Test
    public void hasCapacity(){
        assertEquals(100.00, conferenceRoom.getRoomCapacity());
    }

    @Test
    public void hasDailyRate(){
        assertEquals(150.00, conferenceRoom.getDailyRate(), 1);
    }




}
