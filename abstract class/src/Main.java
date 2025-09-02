import java.util.Scanner;

//jo tum class banwaoge unhe tumhe ya to abstract banana pdeg ya to abstract functions o use me lena hi pdega

abstract class base{
    public base(){
        System.out.println("Hello base constructor called");
    }

    abstract void aman();

}

class derived extends base{
    public void aman(){
        System.out.println("hello good morning");
    }
}

class derived2 extends base{
    public void aman(){
        System.out.println("double inheritance");
    }
}

public class Main{
    public static void main(String[] args) {

        //base baby = new base();  //abstract class ka object nai bana sakte ham

        derived kishan= new derived();
        derived2 kishan2 = new derived2();
        kishan.aman();
        kishan2.aman();

    }
}