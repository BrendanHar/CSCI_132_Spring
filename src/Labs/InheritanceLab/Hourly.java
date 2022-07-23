package Labs.InheritanceLab;

public class Hourly extends Employee{

    protected double hourly;
    protected int hours;

    public Hourly(){
    }
    public Hourly(String a, String b, double c, int d){
        super(a,b);
        hourly = c;
        hours = d;
    }

    public String toString() {
        return "Employee id: " + id + " First: " + firstName + " Last: " + lastName + " Wage: " + hourly + " Hours: " + hours;
    }

}
