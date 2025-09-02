import java.util.Scanner;

//method 2 to use threads
//run mwtod ko implement krna hi pdega

class myrunnablethread implements Runnable{
    public void run(){
        System.out.println("thread running");
    }
}

class myrunnablethread2 implements Runnable{
    public void run(){
        System.out.println("Thread working");
    }
}

public class Main{
    public static void main(String[] args) {

        myrunnablethread bullet1 = new myrunnablethread();
        myrunnablethread2 bullet2 = new myrunnablethread2();
        Thread thread1= new Thread(bullet1);
        Thread thread2= new Thread(bullet2);
        thread1.start();
        thread2.start();

    }
}