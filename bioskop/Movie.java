package bioskop;

public class Movie {
    private String title;
    private int duration;
    private String rating;

    public Movie(String title, int duration, String rating) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getRating() {
        return rating;
    }
}
