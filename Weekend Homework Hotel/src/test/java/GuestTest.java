import Hotel.Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Mr Jimbo", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Mr Jimbo", guest.hasName());

    }


}
