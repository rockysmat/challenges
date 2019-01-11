package linkedlistchallenge;

import java.util.Scanner;

public class Main {
    private static Playlist playlist = new Playlist();
    private static Album album = new Album();
    
    public static void main(String[] args) {
       printMenu();
       processSongs();
    }
    
    public static void printMenu(){
        System.out.println("\n0 - Exit" +
                "\n1 - Create album" +
                "\n2 - Add song to album" +
                "\n3 - List songs in album" +
                "\n4 - Add song on playlist" +
                "\n5 - List songs on playlist" +
                "\n6 - Print Instructions");
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
                        System.out.print("Enter album name: ");
                        String albumNAME = scan.nextLine();
                        album.createAlbum(albumNAME);
                        break;            
                    case 2:
                        scan.nextLine();
                        System.out.print("Enter Album name: ");
                        String albumName = scan.nextLine();
                        System.out.print("Enter song name: ");
                        String songName = scan.nextLine();
                        album.addSongToAlbum(albumName, songName);
                        break;
                    case 3:
                        scan.nextLine();
                        System.out.print("Enter album name: ");
                        String aName = scan.nextLine();
                        album.listSongsInAlbum(aName);
                        break;
                    case 4:
                        scan.nextLine();
                        System.out.print("Enter song name: ");
                        String songTitle = scan.nextLine();
                        album.addSongToPlaylist(songTitle);
                        break;
                    case 5:
                        album.listSongsInPlaylist();
                        break;
                    case 6:
                        printMenu();
                    default:
                        scan.nextLine();
                        System.out.println("Enter a valid option");              
                }
            }
        
        }
    }
}
