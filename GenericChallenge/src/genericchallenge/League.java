package genericchallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class League <T extends Team> {
        private ArrayList<T> teams;

        public League() {
            this.teams = new ArrayList<>();
        }
        
        public void addTeam(T team){
            teams.add(team);
        }
        
        public void leagueTable(){
            Collections.sort(teams, new PointsComparer() );
            System.out.println("Team");
            Iterator<T> itr = teams.iterator();
            if(!teams.isEmpty()){
                while(itr.hasNext()){
                    System.out.println(itr.next().getName());
                }
            }
        }
        
        
        
    private class PointsComparer implements Comparator<T> {    
        @Override
        public int compare(T t1, T t2) {
            if(t1.points(t1) > t2.points(t2)) return -1;
            if(t1.points(t1) < t2.points(t2)) return 1;
            else return 0;
        }
    }
        
}
