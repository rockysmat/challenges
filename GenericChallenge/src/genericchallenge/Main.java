package genericchallenge;

public class Main {

    public static void main(String[] args) {
        Football manchesterCity = new Football("Manchester City");
        Football liverpool = new Football("Liverpool");
        Football chelsea = new Football("Chelsea");
        Football tottenham = new Football("Tottenham");
        Tennis acers = new Tennis("Acers");
        Tennis alleyCats = new Tennis("Alley Cats");
        Hockey dires = new Hockey("Dires");
        
        League<Football> premier = new League<>();
        League<Tennis> leagueOne = new League<>();
                
        manchesterCity.matchResults(liverpool, 2, 3);
        chelsea.matchResults(manchesterCity, 0, 1);
        liverpool.matchResults(tottenham, 2, 1);
        tottenham.matchResults(manchesterCity, 2, 2);
        tottenham.matchResults(chelsea, 0, 3);
        chelsea.matchResults(liverpool, 1, 1);
        liverpool.matchResults(chelsea, 3, 1);
        chelsea.matchResults(manchesterCity, 2, 2);
        
        premier.addTeam(manchesterCity);
        premier.addTeam(chelsea);
        premier.addTeam(liverpool);
        premier.addTeam(tottenham);
        
        System.out.println("");
        acers.matchResults(alleyCats, 15, 19);
        alleyCats.matchResults(acers, 18, 11);
        
        leagueOne.addTeam(acers);
        leagueOne.addTeam(alleyCats);
        
        System.out.println("");
        leagueOne.leagueTable();
        System.out.println("");
        premier.leagueTable();
    }
    
}
