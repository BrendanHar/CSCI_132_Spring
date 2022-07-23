package Labs.lab2;

public class Driver {


    public static void main (String [] args){
        Engineering r = new Engineering(6,7);
        Engineering c = new Engineering(7);
        c.changeheight(4);
        double answer = c.calculateCircle();
        System.out.println("The area of the circle is " + answer);
        int secondAnswer = r.calculateRectangle();
        int thirdAnswer = c.calculateRectangle();


    }
}
