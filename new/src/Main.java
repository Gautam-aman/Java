import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String  name=sc.nextLine();
        String  name1="aman";
        System.out.println(name);
        System.out.println(name1);
        System.out.println("enter value of a");
        int a= sc.nextInt();
        System.out.println("enter value of b");
        int b= sc.nextInt();
        System.out.printf("the value of a is %d and value of b is %d",a,b);
    }
}