import java.util.Scanner;

class kishan extends Thread{
    public kishan(String name){
        super(name);
    }
    public void run (){
        System.out.println("hello good morning");
    }
}

public class Main{
    public static void main(String[] args) {
        kishan aman =new kishan("aman");
        kishan aman2 = new kishan("aman2");
        kishan aman3 = new kishan("aman3");
        aman.setPriority(Thread.MAX_PRIORITY);
        aman2.setPriority(Thread.MIN_PRIORITY);
        aman3.setPriority(Thread.NORM_PRIORITY );
        aman.start();
        try{
            aman.join();// umtill or unless ye jab tk poora khatam nahi hota to iske neeche wala function start nahi hoga
        }
        catch(Exception e){
            System.out.println(e);
        }
        aman2.start();
        aman3.start();
        System.out.println(aman.getName());

    }
}