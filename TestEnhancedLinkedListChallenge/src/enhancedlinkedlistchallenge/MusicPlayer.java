package enhancedlinkedlistchallenge;

import java.util.LinkedList;
import java.util.ListIterator;

public class MusicPlayer {
    private LinkedList<Album.Song> playlist;

    public MusicPlayer() {
        this.playlist = new LinkedList<>();
    }
    
    public void addSongOnPlaylist(String title){
        Album.Song songItem = Main.Executor.findSong(title);
        if(songItem != null){
            playlist.add(songItem);
            System.out.println(title+ " song added on playlist");
        }
        else
            System.out.println("Song need to exist in album to be put on playlist");
    }
    
    public void listSongsOnPlaylist(){
        int index = 1;
        if(!playlist.isEmpty()){
            System.out.println("Songs on playlist: ");
            for(Album.Song songItem : playlist){
                System.out.println("[" +index+ "]  " +songItem.getSongName());
                index++;
            }
        }
        else
            System.out.println("There are no songs on playlist");
    }
    
    public void removeSongOnPlaylist(String title){
        Album.Song songItem = searchSongOnPlaylist(title);
        if(songItem != null){
            playlist.remove(songItem);
            System.out.println(title+ " song removed from playlist");
        }
        else
            System.out.println(title+ " song is not on playlist");
    }
    
    private Album.Song searchSongOnPlaylist(String title){
        if(!playlist.isEmpty()){
            ListIterator<Album.Song> songItr = playlist.listIterator();
            while(songItr.hasNext()){
                if(songItr.next().getSongName().equalsIgnoreCase(title)){
                    songItr.previous();
                    return songItr.next();
                }
            }
        }
        return null;
    }
    
    public class PlayActions implements IPlayer {
        private ListIterator<Album.Song> songItr = playlist.listIterator();
        
        @Override
        public void playNext() {
            if (this.songItr.hasNext()) {
                System.out.println("Now playing " + this.songItr.next().getSongName());
            } else {
                System.out.println("You have reached end of playlist");
            }
        }

        @Override
        public void playPrevious() {
            if (this.songItr.hasPrevious()) {
                System.out.println("Now playing " + this.songItr.previous().getSongName());
            } else {
                System.out.println("You are on the first song on the playlist");
            }
        }

        @Override
        public void replay() {

        }
    }
    
}
