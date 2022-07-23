package Projects.Project02;

import java.util.Random;

public class Driver {


    public static void main(String[] args){
        int n = 10;
        int k = 4;
        int m = 3;
        int length = 12;
        int num1 = 6;
        int num2 = 6;
        Random rand = new Random();
        LinkedList test = new LinkedList();
        LinkedList test2 = new LinkedList();

        test.addAtStart(10);
        test.addAtStart(9);
        test.addAtStart(8);
        test.addAtStart(7);
        test.addAtStart(6);
        test.addAtStart(5);
        test.addAtStart(4);
        test.addAtStart(3);
        test.addAtStart(2);
        test.addAtStart(1);

        test2.addAtStart(12);
        test2.addAtStart(11);
        test2.addAtStart(10);
        test2.addAtStart(9);
        test2.addAtStart(8);
        test2.addAtStart(7);
        test2.addAtStart(6);
        test2.addAtStart(5);
        test2.addAtStart(4);
        test2.addAtStart(3);
        test2.addAtStart(2);
        test2.addAtStart(1);

        ElectionPool example = new ElectionPool(test, n);
        ElectionPool example2 = new ElectionPool(test2, length);



        System.out.println("n = " + n + ", k = " + k + ", m = " + m);
        System.out.println();
        System.out.println("Output");
        System.out.println("------");
        System.out.println();


        example.election( n, k, m);
        example.candidates.printFromStart();

        System.out.println();
        example2.election(length, num1, num2);
        example2.candidates.printFromStart();

//        candidates.printFromStart();

        for (int i = 0; i < n - 1; i++){
        }

    }

}
