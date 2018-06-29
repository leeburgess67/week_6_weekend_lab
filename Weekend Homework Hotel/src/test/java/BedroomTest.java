import Hotel.AllRooms.Bedroom;
import Hotel.Guest.Guest;
import org.junit.Before;

import java.util.ArrayList;

import static Hotel.AllRooms.RoomType.DOUBLE;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;

    ArrayList<Guest> guests;

    @Before
    public void before(){
        bedroom = new Bedroom(2, guests, DOUBLE);
    }
}
