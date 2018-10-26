package Ch16.Examples;

import java.util.Objects;

public class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String bpm;

    public Song(String title, String artist, String rating, String bpm) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
//        return title + ": " + artist;
        return title;
    }

    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.getTitle());
    }

//    @Override
//    public boolean equals(Object aSong) {
//        Song s = (Song) aSong;
//        return getTitle().equals(s.getTitle());
//    }
//
//    @Override
//    public int hashCode() {
//        return title.hashCode();
//    }


    //Generate
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return Objects.equals(getTitle(), song.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle());
    }
}