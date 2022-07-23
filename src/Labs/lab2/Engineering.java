package Labs.lab2;
import java.lang.Math;
import java.util.Scanner;
public class Engineering {

    int x,
        y;

    public Engineering(int r){
        this.x = r;
        this.y = 0;
    }

    public Engineering(int height, int width){
        x = width;
        y = height;
    }

    public double calculateCircle(){
        double ans;
        ans = this.x * this.x * Math.PI;
        return ans;
    }

    public int calculateRectangle(){
        int ans;
        if (this.y != 0){
            ans = this.x * this.y;
            System.out.println("The area of your rectangle is " + ans);

        }

        else{
            System.out.println("Cannot calculate area of a rectangle with a single value.");
            ans =0;
        }
        return ans;
    }


    public int changeheight(int height){
        System.out.println("Current height value: " + this.y);
        System.out.print("Please Enter a number to change the Height: ");
        Scanner input = new Scanner(System.in);
        int newHeight = height + input.nextInt();
        this.y = newHeight;
        System.out.print("The new height is " + newHeight);
        return newHeight;
    }
//
}
