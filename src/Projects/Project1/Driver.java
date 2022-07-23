package Projects.Project1;

public class Driver {
    public static void main(String [] args){
        Batter jimmy = new Batter(12, 33, 45);
        Batter ryan = new Batter(32, 15, 21);
        System.out.println(jimmy.getAtBats());
        System.out.println(ryan.getAtBats());
        System.out.println(ryan.onBaseTimes);
        System.out.println(ryan.getHits());
        ryan.addHit();
        System.out.println(ryan.getHits());
        System.out.println("");
        System.out.println(ryan);
    }
}
