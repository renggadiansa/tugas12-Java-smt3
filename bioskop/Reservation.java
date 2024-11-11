package bioskop;

public class Reservation {
    private Seat seat;

    public Reservation(String reservationId, Movie movie, Seat seat) {
        this.seat = seat;
    }

    public void reserveSeat() {
        if (seat.isAvailable()) {
            seat.reserveSeat();
        } else {
            return;
        }
    }
}
