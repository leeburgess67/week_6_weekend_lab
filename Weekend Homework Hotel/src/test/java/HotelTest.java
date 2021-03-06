import Hotel.AllRooms.*;
import Hotel.Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static Hotel.AllRooms.RoomType.*;
import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom emptyRoom;
    private Bedroom emptyRoom2;
    private DiningRoom diningRoom1;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private ArrayList<Room> bedrooms;
    private ArrayList<Room> diningRooms;
    private ArrayList<Room> conferenceRooms;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private ArrayList guests;
    private ArrayList emptyGuestArray;

    @Before
    public void before() {
        bedrooms = new ArrayList<>();
        diningRooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        guests = new ArrayList<Guest>();
        ArrayList <Room> emptyRooms = new ArrayList<>();

        guest1 = new Guest("Mr Smith", 2);
        guest2 = new Guest("Mrs Booker", 2);
        guest3 = new Guest("Mrs Leffe", 1);
        guests.add(guest1);
        guests.add(guest2);

        diningRoom1 = new DiningRoom(DININGROOM, guests, "Excellent Eatery");
        conferenceRoom1 = new ConferenceRoom(CONFERENCEROOM, guests, "Conference Room 1");
        conferenceRoom2 = new ConferenceRoom(CONFERENCEROOM, guests, "Conference Room 2");
        emptyGuestArray = new ArrayList<>();
        emptyRoom = new Bedroom(SINGLE, emptyGuestArray);
        emptyRoom2 = new Bedroom(DOUBLE, emptyGuestArray);
        bedroom1 = new Bedroom(DOUBLE, guests);
        bedroom2 = new Bedroom(TWIN, guests);
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(emptyRoom);

        diningRooms.add(diningRoom1);
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);

        hotel = new Hotel(bedrooms, diningRooms, conferenceRooms);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(bedrooms, hotel.getBedrooms());
    }

    @Test
    public void hasConferenceRooms() {
        assertEquals(conferenceRooms, hotel.getConferenceRooms());
    }

    @Test
    public void hasDiningRooms() {
        assertEquals(diningRooms, hotel.getDiningRooms());
    }

    @Test
    public void canCheckInEmptyRoom() {
        hotel.checkIn(RoomType.SINGLE, guest3);
        assertEquals(1, emptyRoom.getGuests().size());
    }

    @Test
    public void cantCheckInIfPartyBiggerThanCapacity(){
        hotel.checkIn(RoomType.SINGLE, guest1);
        assertEquals(0, emptyRoom.getGuests().size());
    }

    @Test
    public void canFindBedroom() {
        assertEquals(emptyRoom, hotel.findBedroom(RoomType.SINGLE));
    }

    @Test
    public void isRoomEmtpy(){
        assertEquals(true, hotel.isRoomEmpty(emptyRoom));
    }

    @Test
    public void cantCheckInFullRoom(){
        hotel.checkIn(RoomType.DOUBLE, guest2);
        assertEquals(2, bedroom1.getGuests().size());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkOutGuest(guest1);
        assertEquals(0, bedroom2.getGuests().size());
    }

    @Test
    public void canGetGuestsInRoom(){
        assertEquals(guests,hotel.getGuestsInRoom(bedroom2) );
    }

    @Test
    public void canReturnVacantBedrooms(){
        assertEquals(hotel.emptyRooms, hotel.getVacantRooms());
    }
    //Why did I have to make emptyRooms public in Hotel class? Shouldn't it be accessible from here?


    @Test
    public void canBookTableInDiningRoomIfNotFull(){
        hotel.bookTableInDiningRoom(guest1);
    }

}
