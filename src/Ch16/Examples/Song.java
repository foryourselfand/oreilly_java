package Ch16.Examples;

public class Song {
    String title;
    String atrist;
    String rating;
    String bpm;

    public Song(String title, String atrist, String rating, String bpm) {
        this.title = title;
        this.atrist = atrist;
        this.rating = rating;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getAtrist() {
        return atrist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return title;
    }
}