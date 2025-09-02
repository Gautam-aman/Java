import java.util.Scanner;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Enter the program");
        Scanner aman= new Scanner(System.in);
        System.out.println("Enter first number");
        int a = aman.nextInt();
        System.out.println("Enter second number");
        int b = aman.nextInt();
        int sum = a+b;
        System.out.println("the sum of number is ");
        System.out.println(sum);
        System.out.println("Enter number to check");
        int c = aman.nextInt();
        boolean b1= aman.hasNextInt();
        System.out.println(b1);

    }

}