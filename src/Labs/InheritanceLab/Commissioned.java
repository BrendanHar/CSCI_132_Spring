package Labs.InheritanceLab;

public class Commissioned extends Employee {

    protected double commission;
    protected double salesNum;

    public Commissioned(){
    }
    public Commissioned(String a, String b, double c, int d){
        super(a,b);
        commission = c;
        salesNum = d;
    }
    public String toString() {
        return "Employee id: " + id + " First: " + firstName + " Last: " + lastName + " Percent: " + commission + " Sales: " + salesNum;
    }
}
