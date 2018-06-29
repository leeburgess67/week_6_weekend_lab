package Hotel.AllRooms;


public enum RoomType
{
    SINGLE(1, 49.95, "Single Room"),
    DOUBLE(2, 99.95, "Double Room"),
    TWIN(2, 99.95, "Twin Room"),
    FAMILY(4, 115.95,"Family Room"),
    DININGROOM(50, 0.00, "Dining Room"),
    CONFERENCEROOM(100, 150.00, "Conference Room");

    private int capacity;
    private double dailyRate;
    private String name;

    RoomType(int capacity, double dailyRate, String name){
        this.capacity = capacity;
        this.dailyRate = dailyRate;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public int getCapacity(){
        return this.capacity;
    }
}