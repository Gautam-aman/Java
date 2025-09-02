import java.util.Scanner;
//creating custom exceptions


class Myexception extends Exception{
    @Override
    public String toString() {
        return "Age is less than 18";
    }

    @Override
    public String getMessage() {
        return "you are ready to go";
    }
}


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
       

    }
}