package bioskop;

public class Seat {
    private String seatNumber;
    private boolean isAvailable;

    public Seat(String string, boolean b) {
        this.seatNumber = string;
        this.isAvailable = b;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void reserveSeat() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            return ;
        }
    }
}
