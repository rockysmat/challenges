package enhancedlinkedlistchallenge;

import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    
    private static final Album album = new Album("Talk Dirty", "Jason Derulo");
    
    public static void main(String[] args) {
      printMenu();
      processSongs();
    }
    
    public static void printMenu(){
        System.out.println("\n0 - Exit" +
                "\n1 - Add song in album" +
                "\n2 - List songs in album" +
                "\n3 - Remove song from album" +
                "\n4 - Print Instructions");
    }
    
    public static void processSongs(){
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter option: \n(Enter 0 for menu options)");
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
                        printMenu();
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
        
        private static Album.Song findSong(String title){
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
