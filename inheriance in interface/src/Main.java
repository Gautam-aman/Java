import java.util.Scanner;

interface base {
    void meth1();
}

interface derived extends base{
    void meth2();
}

class aman implements derived{
    public void meth1(){
        System.out.println("meth 1");
    }
    public void meth2(){
        System.out.println("meth 2");
    }
}

public class Main{
    public static void main(String[] args) {

        aman kishan = new aman();
        kishan.meth2();

    }
}