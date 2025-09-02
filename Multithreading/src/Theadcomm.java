public class Theadcomm {
    public static void main(String[] args) throws InterruptedException {
    ThreadA a1 = new ThreadA();
    a1.start();
       synchronized (a1){
           System.out.println("Main thread is Calling wait");

           a1.wait();
           System.out.println("Main thread is Calling notify");
           //a1.notify();
           System.out.println("Main thread is notifying");
           System.out.println("total : " + a1.total);
       }
    }

}

class ThreadA extends Thread {
    int total = 0 ;
    @Override
    public void run() {

       synchronized (this) {
           System.out.println("Child thread Started");
           for (int i = 0;i < 10;i++) {
               total += i;
           }
           this.notify();
           System.out.println("chlild thread Ended");
       }
    }
}
