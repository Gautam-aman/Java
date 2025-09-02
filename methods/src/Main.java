import java.util.Scanner;

/*public class Main{
     int multi(int x, int y){
        int z;
        z=x+y;
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= 45;
        int b = 65;
        Main obj= new Main();
        int c= obj.multi(a,b);
        System.out.println(c);


        }
    }

 */

public class Main{
    static int multiply(int x, int y){
        int z;
        z=x*y;
        return z;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println(multiply(4,5));

    }
}