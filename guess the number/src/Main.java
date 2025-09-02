import java.util.Scanner;
import java.util.Random;

class Randomnumber{
    int a;

    public Randomnumber(){
        Scanner sc = new Scanner(System.in);
        Random aman = new Random();
        int num = aman.nextInt(4);
        int count =0;

        while(num==a){
            if (num != a){
                System.out.println("wrong try again");

            }
            else{
                System.out.println("your guessed it right ");
                System.out.println("you have taken "+ count + "chances to guess");
                break;
            }
        }

    }
}

public class Main{
    public static void main(String[] args) {

    }
}