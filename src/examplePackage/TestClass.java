package examplePackage;

import java.util.Stack;

public class TestClass {


    public static void main(String [] args){

        Stack<Integer> test = new Stack<Integer>();

        test.push(4);
        test.push(5);
        int stackTop = test.pop();
        test.push(stackTop);
        test.push(5);
        stackTop = test.pop() + test.peek();
        int stackTop1 = test.pop() + test.pop();
        test.push(stackTop1);
        test.push(stackTop);
        System.out.println(test);

//        mystery(3);
//        System.out.println(bruh(15));
//        int arr[] = {3,6,9,12};
//        arr = counter(arr);
//        System.out.println(arr[1] +", "+arr[2]);

    }

    public static void mystery(int n){
        if (n == 1){
            System.out.print(n + ", ");
        }
        else {
            mystery(n -1);
            System.out.print(n +", ");
            mystery(n-1);
        }
    }

    public static int bruh(int n){
        boolean check = false;
        int cmon = 1;
        int curry = n - 2;

        while (! check){
            curry =(int) (curry / cmon);
            if (curry % 4 == 0){
                check = true;
            }
            else if (curry > 42){
                check = true;
            }
            else {
                cmon += 3;
            }
            System.out.println(curry);
        }
        return cmon;
    }

    public static int[] counter(int [] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i]+1;
            System.out.println(arr[i] +1);
        }
        return arr;
    }
}
