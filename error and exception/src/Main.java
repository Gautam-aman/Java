import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
      //exceptions through try and catch method
        int a = 4500;
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        try {
            int c= a/b;
            System.out.println("Value is "+ c);

        }

        catch(Exception e){
            System.out.println("Sorry we failed to do this");
            System.out.println(e);



        }
        System.out.println("i am done");

    }
}