import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String str= sc.nextLine();
        System.out.println("Enter your marks in subject 1");
        int a = sc.nextInt();
        System.out.println("enter your marks in second subject");
        int b = sc.nextInt();
        System.out.println("enter your marks in subjcet 3");
        int c= sc.nextInt();
        int total= a+b+c;
        int percentage= total/3;
        System.out.println("your name is " + str);
        System.out.println("your total marks are "+ total);
        System.out.println("your percentage is "+percentage);


    }
}