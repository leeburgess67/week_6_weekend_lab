package Hotel.Guest;

public class Guest {

    private String leadName;
    private int noOfGuests;

    public Guest(String leadName, int noOfGuests){
        this.leadName = leadName;
        this.noOfGuests = noOfGuests;
    }

    public String hasName() {
        return this.leadName;
    }

    public int getNoOfGuests() {
        return noOfGuests;
    }
}
