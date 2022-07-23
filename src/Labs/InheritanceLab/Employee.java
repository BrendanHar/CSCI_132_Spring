package Labs.InheritanceLab;
import java.util.Random;
public class Employee {

    protected String firstName;
    protected String lastName;
    Random rand = new Random();
    public int id = rand.nextInt(15);



    public Employee(){
        id  = rand.nextInt();
    }

    public Employee(String fName, String lName){
        firstName = fName;
        lastName = lName;
        id+= 1;
    }
    public Employee(String fName, String lName, double a, int b){
        firstName = fName;
        lastName = lName;
        id+= 1;
    }
    public Employee(String fName, String lName, double a, int b, int c){
        firstName = fName;
        lastName = lName;
        id+= 1;
    }
}
