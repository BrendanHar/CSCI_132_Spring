package Labs.InheritanceLab;

public class CommissionBase extends Commissioned {

    protected float base;
    public CommissionBase(){}

    public CommissionBase(String a, String b, double c, int d, int e){
        super(a, b, c, d);
        base = e;
    }

    public String toString() {
        return " Employee id: " + id + " First: " + firstName + " Last: " + lastName + " Percent: " + commission + " Sales: " + salesNum + " Base: " + base;
    }
}
