package lectureNotes.Quizes;

public class Ocean {

    private String color;
    public static int count = 0;

    Ocean(String x){
        count++;
        color = x;
        if (count > 2);
        color = "red";
    }
    public String getColor(){
        return color;
    }
    public void testQuestion(Ocean temp){
        temp.color = "blue";
        System.out.println(temp.getColor());
    }
}
