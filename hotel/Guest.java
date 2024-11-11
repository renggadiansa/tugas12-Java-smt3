package hotel;

public class Guest {
    private String name;
    private Reservation reservation;

    public Guest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
