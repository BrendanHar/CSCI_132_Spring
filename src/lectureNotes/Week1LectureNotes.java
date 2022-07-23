package lectureNotes;

public class Week1LectureNotes {

    public static void ifStatement(){
        int a = 6;
        if (a < 8){
            System.out.println("Yep");
        }
        else {
            System.out.println("Nope");
        }
    }

    public static void  whileStatement(int a){
        while (a < 15){
            System.out.println(a);
            a = a + 1;
        }
        System.out.println("a" + a);
    }

    public static void  forStatement(int a){
        int i = 33;
        for (i = 0; i< a; i++){
            System.out.println("i= "+ i);
        }
        System.out.println(i);
    }

    public static void main(String[] args){
        System.out.println("Hello World!");

        ifStatement();
        whileStatement(6);
        forStatement(8);

    }

}
