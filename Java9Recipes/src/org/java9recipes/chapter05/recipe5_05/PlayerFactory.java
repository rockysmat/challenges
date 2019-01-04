
package org.java9recipes.chapter05.recipe5_05;

public class PlayerFactory {
public static Player createPlayer(String playerType){
    Player returntype;
    switch(playerType) {
        case "GOALIE":
            returnType = new Goalie();
            break;
        default:
            returnType = new AllPlayer();
    }
    return returnType;
 }    
}
public class Goalie extends Player implements PlayerType {
    private int totalSaves;
    public Goalie(){
        this.setPosition("GOALIE");
    }
    public int getTotalSaves(){
        return totalSaves;
    }
    public void setTotalSaves(int totalSaves) {
        this.totalSaves = totalSaves;
    }
}