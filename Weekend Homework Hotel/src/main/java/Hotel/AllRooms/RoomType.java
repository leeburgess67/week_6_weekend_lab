package Hotel.AllRooms;


public enum RoomType
{
    SINGLE(49.95, "Single Room"),
    DOUBLE(99.95, "Double Room"),
    TWIN(99.95, "Twin Room"),
    FAMILY(115.95,"Family Room");

    private double dailyRate;
    private String name;

    RoomType(double dailyRate, String name){
        this.dailyRate = dailyRate;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getDailyRate() {
        return dailyRate;
    }
}