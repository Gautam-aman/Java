public class syncthread extends Thread {
    tablewithmetho t1;

    syncthread (tablewithmetho t){
        this.t1 = t ;
    }

    @Override
    public void run() {
        t1.toString();
    }
}
