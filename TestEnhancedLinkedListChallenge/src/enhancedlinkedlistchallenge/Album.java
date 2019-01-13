package enhancedlinkedlistchallenge;

import java.util.LinkedList;

public class Album {
    
    private String albumName;
    private String artistName;
    private LinkedList<Song> albums;
    private LinkedList<Song> playlist;

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.albums = new LinkedList<>();
        this.playlist = new LinkedList<>();
    }  
    
    public static class Song {
        private String title;
        private Double duration;

        public Song(String title) {
            this.title = title;
            this.duration = 3.50;
        }

        public String getSongName() {
            return title;
        }
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public LinkedList<Song> getAlbums() {
        return albums;
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }
  
}
