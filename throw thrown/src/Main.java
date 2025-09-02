import java.util.Scanner;
import java.math.*;

//creating custom error:

class negativearea extends Exception{
    @Override
    public String toString() {
        return "radius cant be negative";
    }

    @Override
    public String getMessage() {
        return "radius CANT BE NEGAIVE";
    }
}

class aman{
  public static  double area(int rad) throws negativearea{
        if (rad<0){
            throw new negativearea();
        }
        return (Math.PI*rad*rad);
    }
   public static int display(int x, int y){
        int c = x/y;
        return c;

    }
}

public class Main{
    public static void main(String[] args) {

        aman kishan = new aman();
        int xray=kishan.display(4,2);
        System.out.println(xray);
        try{
            double Area= aman.area(2);
            System.out.println(Area);
        }
        catch(Exception e){
            System.out.println("exception");
        }

    }
}