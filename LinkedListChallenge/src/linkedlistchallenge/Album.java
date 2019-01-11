package linkedlistchallenge;

import java.util.ArrayList;
import java.util.Iterator;

public class Album {
    
    private String albumName;
    private Song song;
    private ArrayList<Song> songs;
    
    Playlist playlist = new Playlist();

    public Album() {
        songs = new ArrayList<>();
    }

    public Album(String albumName) {
        this.albumName = albumName;
        songs = new ArrayList<>();
    }
    
    public void createAlbum(String albumName){
        if(!playlist.findAlbum(albumName)){
           playlist.getAlbums().add(new Album(albumName));
            System.out.println("Album created successfully");
        }
        else
            System.out.println("Creation failed. Album already exist");
    }
    
    public void addSongToAlbum(String albumName, String title){
        if (playlist.findAlbum(albumName)) {
           if (!findSong(title, albumName)) {
               song = new Song(title);               
               songs.add(song);
               System.out.println("Song added to album");
           } else {
               System.out.println("Song already exist in album");
           }
        } 
        else
            System.out.println("Album does not exist");
    }
   
    public void listSongsInAlbum(String albumName){
       if (playlist.findAlbum(albumName)) {
           this.albumName = albumName;
           Iterator<Song> songItr = songs.iterator();
           if (!songs.isEmpty()) {
               while (songItr.hasNext()) {
                   System.out.println(songItr.next().getTitle());
               }
           }
           else
                System.out.println("There are no songs in the album");
       }
       else
            System.out.println("Album does not exist");
   }
   
    private boolean findSong(String title, String albumName){
       Iterator<Song> songItr = songs.iterator();
       if(!songs.isEmpty()){
            while(songItr.hasNext()){
                this.albumName = albumName;
                if(songItr.next().getTitle().equalsIgnoreCase(title)){
                    return true;
                }
            }
       }
       return false;
    }
   
    public boolean findSongInAlbum(String title){
        Iterator<Album> albumItr = playlist.getAlbums().iterator();
        if (!playlist.getAlbums().isEmpty()) {
            while (albumItr.hasNext()) {
                String albumName = albumItr.next().getAlbumName();
                return findSong(title, albumName);
            }
        }
        return false;
    }
        
    public void addSongToPlaylist(String title){   
        if(findSongInAlbum(title)){
            playlist.getPlaylists().add(new Song(title));
            System.out.println("Song added on playlist");
        }
        else
            System.out.println("Cannot add to playlist, song doesn't exist in an album.");
    }
    
    public void listSongsInPlaylist(){
       if(!playlist.getPlaylists().isEmpty()){
           Iterator<Song> playlistItr = playlist.getPlaylists().iterator();
           while(playlistItr.hasNext()){
               System.out.println(playlistItr.next().getTitle());
           }
       }
       else{
           System.out.println("There are no songs in the playlist");
       }
    }
    
    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
     
}
