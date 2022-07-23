package Labs.lab2;

public class ExampleClass {

    public static void main(String [] args){
        Shapes m = new Shapes(5);
        System.out.println(m.width);
        Shapes n = new Shapes(7, 10);
        System.out.println(n.height + " " + n.width) ;
        System.out.println("this is the area of my circle: " + m.calculateCircle());
        m.calculateRectangle();
        n.calculateRectangle();
        n.changeHeight();
        n.calculateRectangle();

    }
}
