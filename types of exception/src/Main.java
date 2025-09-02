import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int [] marks={1,2,3,4,5};
        try {
            System.out.println("aman");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}