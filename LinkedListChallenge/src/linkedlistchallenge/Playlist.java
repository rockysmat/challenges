package linkedlistchallenge;

import java.util.Iterator;
import java.util.LinkedList;

public class Playlist {
    
    private LinkedList<Album> albums;
    private LinkedList<Song> playlists;

    public Playlist() {
        albums = new LinkedList<>();
        playlists = new LinkedList<>();
    }
    
    public boolean findAlbum(String name){
       Iterator<Album> albumItr = albums.iterator();
       if(!albums.isEmpty()){
            while(albumItr.hasNext()){            
                if(albumItr.next().getAlbumName().equalsIgnoreCase(name)){
                    return true;
                }
            }
       }
       return false;
    }
    
    public LinkedList<Album> getAlbums() {
        return albums;
    }

    public LinkedList<Song> getPlaylists() {
        return playlists;
    }
    
}
