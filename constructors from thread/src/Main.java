import java.util.Scanner;

class aman extends Thread{
    public aman(String name){
        super(name);
    }

    public void run(){
        System.out.println(
                "aman is great"
        );
    }
}

public class Main{
    public static void main(String[] args) {

        aman ak =  new aman("kishan");
        ak.start();
        System.out.println(ak.getName());
        System.out.println(ak.getId());

    }
}