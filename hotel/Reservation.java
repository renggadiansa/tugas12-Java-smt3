package hotel;

public class Reservation {
    private Room room;
    private int numberOfNights;

    public Reservation(Room room, Guest guest, int numberOfNights) {
        this.room = room;
        this.numberOfNights = numberOfNights;
    }

    public double calculateTotalPrice() {
        return room.getPricePerNight() * numberOfNights;
    }
}
