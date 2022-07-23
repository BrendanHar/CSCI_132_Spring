package Projects.Project1;

public class Batter {

    int atBats = 0;
    int battingAverage = 0;
    int onBasePercentage = 0;
    int onBaseTimes = 0;
    int hits;

    public Batter(){
    }

    public Batter(int a, int b, int c){
        atBats = a;
        hits = b;
        onBaseTimes = c;
    }

    public int getAtBats() {
        return atBats;
    }

    public int getHits(){
        return hits;
    }

    public int getOnBaseTimes() {
        return onBaseTimes;
    }

    public void setAtBats(int a ){
        atBats = a;
    }

    public void setHits(int a){
        hits = a;
    }

    public void setOnBaseTimes(int a){
        onBaseTimes = a;
    }

    public void addHit(){
        atBats = atBats++;
        hits = hits++;
    }

    public void addStrikeOut(){
        atBats= atBats++;
    }

    public void addWalk(){
        atBats = atBats++;
        onBaseTimes = onBaseTimes++;
    }

    public int getOnBasePercentage(){
        onBasePercentage = (this.onBaseTimes / this.atBats)*100;
        return onBasePercentage;
    }

    public int getBattingAverage(){
        battingAverage = (this.hits / this.atBats)*100;
        return battingAverage;
    }

    @Override
    public String toString() {
        return "Batter{" +
                "atBats=" + atBats +
                ", battingAverage=" + getBattingAverage() +
                ", onBasePercentage=" + getOnBasePercentage() +
                ", onBaseTimes=" + onBaseTimes +
                ", hits=" + hits +
                '}';
    }
}
