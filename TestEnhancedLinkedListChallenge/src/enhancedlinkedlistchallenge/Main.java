package enhancedlinkedlistchallenge;

import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    
    private static final Album album = new Album("Talk Dirty", "Jason Derulo");
    //MusicPlayer mPlayer = new MusicPlayer();
    
    public static void main(String[] args) {
      printMenu();
      processSongs();
    }
    
    public static void printMenu(){
        System.out.println("\n0 - Exit" +
                "\n1 - Add song in album" +
                "\n2 - List songs in album" +
                "\n3 - Remove song from album" +
                "\n4 - Add song on playlist" +
                "\n5 - List songs on playlist" +
                "\n6 - Remove song from playlist" +
                "\n7 - Play next song on playlist" +
                "\n8 - Play previous song on playlist" +
                "\n9 - Print Instructions");
    }
    
    public static void processSongs(){
        MusicPlayer mPlayer = new MusicPlayer();
        IPlayer playAction = mPlayer.new PlayActions();
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter option: \n(Enter 9 for menu options)");
            if(scan.hasNextInt()){
                int option = scan.nextInt();
                switch(option){
                    case 0:
                        flag = false;
                        System.out.println("Goodbye!");
                        break;
                    case 1:
                        scan.nextLine();
                        System.out.print("Enter song name: ");
                        Executor.addSongToAlbum(scan.nextLine());
                        break;            
                    case 2:
                        scan.nextLine();
                        Executor.listSongsInAlbum();
                        break;
                    case 3:
                        scan.nextLine();
                        System.out.print("Enter song name: ");
                        Executor.removeSongFromAlbum(scan.nextLine());
                        break;
                    case 4:
                        scan.nextLine();
                        System.out.print("Enter song name to add on playlist : ");
                        mPlayer.addSongOnPlaylist(scan.nextLine());
                        break;
                    case 5:
                        scan.nextLine();
                        mPlayer.listSongsOnPlaylist();
                        break;
                    case 6:
                        scan.nextLine();
                        System.out.print("Enter song name to remove from playlist : ");
                        mPlayer.removeSongOnPlaylist(scan.nextLine());
                        break;
                    case 7:
                        playAction.playNext();
                        break;
                    case 8:
                        playAction.playPrevious();
                        break;
                    case 9:
                        printMenu();
                        break;
                    default:
                        scan.nextLine();
                        System.out.println("Enter a valid option");              
                }
            }
        
        }
    }
    
    static class Executor {
        
        private static void addSongToAlbum(String title){
            if (findSong(title) == null) {
                album.getAlbums().add(new Album.Song(title));
                System.out.println(title +" song added to " +album.getAlbumName()+ " album");
            }
            else
                System.out.println(title+ " song already exist");
            
        }
        
        private static void listSongsInAlbum(){
            if (!album.getAlbums().isEmpty()) {
                for (Album.Song song : album.getAlbums()) {
                    System.out.println(song.getSongName());
                }
            }
            else
                System.out.println("There are no songs in " +album.getAlbumName()+ " album");
        }
        
        private static void removeSongFromAlbum(String title){
            Album.Song songItem = findSong(title);
            if(songItem != null){
                album.getAlbums().remove(songItem);
                System.out.println(title+ " song deleted from " +album.getAlbumName()+ " album");
                       
            }
            else
                System.out.println(title+ " song is not in " +album.getAlbumName()+ " album");
        }
        
        public static Album.Song findSong(String title){
            ListIterator<Album.Song> songItr = album.getAlbums().listIterator();
            while(songItr.hasNext()){
                if(songItr.next().getSongName().equalsIgnoreCase(title)){
                    songItr.previous();
                    return songItr.next();
                }
            }
            return null;
        }
    }
}
