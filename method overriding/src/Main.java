import java.util.Scanner;

class base{
    int a;
    void meth1(){
        System.out.println("i am method 1 of class base");
    }
    void meth2(){
        System.out.println("i am method 2 of class base");
    }
}

class derived extends base{

    void meth3(){
        System.out.println("i am method 3 of derived");
    }
    @Override
    void meth2(){
        System.out.println("I am method 2 of derived class");
    }
}

public class Main{
    public static void main(String[] args) {
        base aman = new base();
        derived kishan = new derived();
        aman.meth2();
        kishan.meth2();

    }
}