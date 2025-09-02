import java.util.Scanner;


class thread2 extends Thread{
    int i =0;


        void greet () {
        System.out.println("Kishan gautam is great");
        i++;
    }


}

class thread3 extends Thread{

    void greet (){
        System.out.println("Both are same");
    }
}


public class Main{
    public static void main(String[] args) {

        thread2 a= new thread2();
        thread3 b = new thread3();
        Thread thread = new Thread(a);
        Thread thread2= new Thread(b);
        thread2.start();
        thread.start();



    }
}