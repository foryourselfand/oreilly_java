package Ch16.Examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Jukebox3 {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new Jukebox3().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);

        Collections.sort(songList);
        System.out.println(songList);

//        ArtistCompare artistCompare = new ArtistCompare();
//        Collections.sort(songList, artistCompare);
//        System.out.println(songList);

//        HashSet<Song> songSet = new HashSet<Song>();
//        songSet.addAll(songList);
//        System.out.println(songSet);

        TreeSet<Song> songSet = new TreeSet<Song>();
        songSet.addAll(songList);
//        System.out.println(songSet);
    }

    void getSongs() {
        try {
            File file = new File("res/SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");

        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }

    class ArtistCompare implements Comparator<Song> {
        @Override
        public int compare(Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }
}
