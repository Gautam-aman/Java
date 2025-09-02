import java.util.Scanner;

class smartphone{
    void greet(){
        System.out.println("Good morning");
    }
    void name(){
        System.out.println("smartphone");
    }
}

class phone extends smartphone{
    void msg(){
        System.out.println("Welcome");
    }
    @Override
    void name(){
        System.out.println("phone");
    }
}

public class Main{
    public static void main(String[] args) {

        smartphone Nokia = new phone();
        Nokia.greet();
        Nokia.name();



    }
}