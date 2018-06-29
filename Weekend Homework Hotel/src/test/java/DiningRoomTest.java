import Hotel.AllRooms.ConferenceRoom;
import Hotel.AllRooms.DiningRoom;
import Hotel.AllRooms.RoomType;
import Hotel.Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {


        DiningRoom diningRoom;
        Guest guest1;
        Guest guest2;
        ArrayList<Guest> guests;

        @Before
        public void before(){
            guests = new ArrayList<>();
            guests.add(guest1);
            guests.add(guest2);
            diningRoom = new DiningRoom(RoomType.DININGROOM, guests, "Excellent Eats");

        }


        @Test
        public void hasGuests(){
            assertEquals(guests, diningRoom.getGuests());
        }

        @Test
        public void hasCapacity(){
            assertEquals(50, diningRoom.getRoomCapacity());
        }




    }



