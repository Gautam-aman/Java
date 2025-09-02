import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name= sc.nextLine();
        System.out.println("Enter your age");
        int a= sc.nextInt();
        /*if(a>18){
            System.out.println("You are welcome");
        }
        else{
            System.out.println("bhakk bsdk");
        }

         */

        switch (a){
            case 18:
                System.out.println("you are 18 years old");
                break;
            case 19:
                System.out.println("you are 19 years old");
                break;
            default:
                System.out.println("code is working");
        }
    }
}