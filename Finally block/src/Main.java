import java.util.Scanner;
import java.math.*;

public class Main{
    public static void main(String[] args) {
        try {
            int a=4;
            //int b = 0;
            int b = 4;
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);

        }
        finally {
            System.out.println("This program  is done");
        }
    }
}