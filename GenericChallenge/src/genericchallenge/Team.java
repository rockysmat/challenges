package genericchallenge;

public abstract class Team {
    private String name;
    private int won, lost, tied, played;
    
    public Team(String name) {
        this.name = name;
        this.won = 0;
        this.lost = 0;
        this.tied = 0;
        this.played = 0;
    }
    
    public void matchResults(Team opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            won++;
            message = " won against ";
        } else if(ourScore < theirScore){
            lost++;
            message = " lost against ";
        } else{
            tied++;
            message = " drew with ";
        }
        played++;
        
        if(opponent != null){
            System.out.println(this.name + message + opponent.name);
            opponent.matchResults(null, ourScore, theirScore);
        }
    }
    
    public int points(Team team){
        return (won * 3) + tied;
    }

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }
    
}
