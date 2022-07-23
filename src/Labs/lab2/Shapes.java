package Labs.lab2;

import java.lang.Math;
import java.util.Scanner;

public class Shapes {

    int width,
        height;

    public Shapes(int radius){
        this.width = radius;
        this.height = 0;
    }

    public Shapes(int w, int h){
        this.width = w;
        this.height = h;
    }

    public double calculateCircle(){
        double ans;
        ans = this.width * this.width * Math.PI;
//        System.out.println("The area of the circle is " + ans);
        return ans;
    }

    public int calculateRectangle(){
        int ans;
        if (this.height == 0){
            System.out.println("Oops! you can't do that");
            ans =0;
        }
        else {
            ans = this.width * this.height;
            System.out.println("The area of the rectangle is " + ans);
        }
        return ans;
    }

    public void changeHeight(){
        Scanner input = new Scanner(System.in);
        System.out.println("Current height is: " + this.height);
        System.out.println("enter a value to change the number: ");
        int heightChange = input.nextInt();
        int newHeight = this.height + heightChange;
        this.height = newHeight;
        System.out.println("New height is: " + this.height);

    }


}
