package lectureNotes;

public class Week2 {

    public static int javaMethod(int a){
        a = 77;
        System.out.println("Something "+ a );
        return a;
    }

    public static void main(String[] args){
        int a = 99;
        a = javaMethod(a);
        System.out.println("Main " + a);
    }
}
