package hotel;

public class Room {
    private String roomNumber;
    private double pricePerNight;

    public Room(String roomNumber, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
}
