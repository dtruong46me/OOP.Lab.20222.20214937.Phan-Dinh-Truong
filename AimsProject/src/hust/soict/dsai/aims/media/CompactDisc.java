package AimsProject.src.hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc() {
        super();
    }

    public CompactDisc(String title, String category, float cost, int length, String director) {
        super(title, category, cost, length, director);
    }

    public CompactDisc(String title, String category, float cost, int length, String director, String artist, ArrayList<Track> tracks) {
        super(title, category, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("\u001B[31mThe track is already in the list of tracks!\u001B[37m");
        } else {
            tracks.add(track);
            System.out.println("\u001B[35mThe track '" + track.getTitle() + "' has been ADDED to the list of tracks!\u001B[37m");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("\u001B[35mThe track '" + track.getTitle() + "' has been REMOVED from the list of tracks!\u001B[37m");
        } else {
            System.out.println("\u001B[31mThe track is NOT EXIST in the list of tracks!\u001B[37m");
        }
    }

    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public void play() {
        System.out.println("Playing Compact Disc: " + getTitle());
        System.out.println("Director: " + getDirector());
        System.out.println("Length : " + getLength() + " minutes");

        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public String toString() {
        return "CompactDisc [id=" + id + ", title=" + title + ", category=" 
            + category + ", cost=" + cost + ", director= " + director + ", length=" 
            + length + ", artist=" + artist + ", tracks=" + tracks.toString() + "]";
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }
}
