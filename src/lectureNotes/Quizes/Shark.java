package lectureNotes.Quizes;

public class Shark {

    String name;
    int rank = 0;

    public Shark(){
        name = "Unkown";
    }

    public Shark(String input){
        this.name = input;
    }

    public void eatMermaid(){
        rank++;
    }

    public void laserHuman(){
        if (rank >= 3)
            System.out.println( "Success: Human Lasered by " + name);
        else
            System.out.println( "error: No Laser Installed on " + name);
    }


}
